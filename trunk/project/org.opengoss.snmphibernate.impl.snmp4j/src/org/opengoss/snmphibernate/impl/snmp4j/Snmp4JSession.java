package org.opengoss.snmphibernate.impl.snmp4j;

import java.io.IOException;
import java.io.Serializable;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Vector;


import org.opengoss.snmphibernate.api.AbstractSnmpSession;
import org.opengoss.snmphibernate.api.ISnmpTarget;
import org.opengoss.snmphibernate.api.SmiType;
import org.opengoss.snmphibernate.api.SnmpAnnotationException;
import org.opengoss.snmphibernate.api.SnmpException;
import org.opengoss.snmphibernate.api.annotation.MibIndex;
import org.opengoss.snmphibernate.api.annotation.MibObjectType;
import org.opengoss.snmphibernate.api.annotation.RowStatus;
import org.opengoss.snmphibernate.api.annotation.MibObjectType.Access;
import org.snmp4j.PDU;
import org.snmp4j.Snmp;
import org.snmp4j.Target;
import org.snmp4j.TransportMapping;
import org.snmp4j.event.ResponseEvent;
import org.snmp4j.smi.Integer32;
import org.snmp4j.smi.OID;
import org.snmp4j.smi.UnsignedInteger32;
import org.snmp4j.smi.Variable;
import org.snmp4j.smi.VariableBinding;
import org.snmp4j.transport.DefaultUdpTransportMapping;

public class Snmp4JSession extends AbstractSnmpSession {

	private Snmp snmp4J;

	private final Snmp4JTarget target;

	public Snmp4JSession(ISnmpTarget target) throws IOException {
		this.target = (Snmp4JTarget) target;
		TransportMapping tm = new DefaultUdpTransportMapping();
		this.snmp4J = new Snmp(tm);
		this.snmp4J.listen();
	}
	
	private Target getReadTarget() {
		Target targetImpl = target.getReadTarget();
		initTimeoutRetries(targetImpl);
		return targetImpl;
	}
	
	private void initTimeoutRetries(Target targetImpl) {
		targetImpl.setTimeout(getTimeout());
		targetImpl.setRetries(getRetries());
	}

	private Target getWriteTarget() {
		Target targetImpl = target.getWriteTarget();
		initTimeoutRetries(targetImpl);
		return targetImpl;
	}

	public <T> T get(Class<T> scalarClass) throws IOException, SnmpException,
			SnmpAnnotationException {
		PDU reqPDU = newGetPDU(scalarClass);
		return get(scalarClass, reqPDU);
	}

	public <T> T get(Class<T> scalarClass, String[] fields) throws IOException,
			SnmpException, SnmpAnnotationException {
		try {
			PDU reqPDU = newGetPDU(scalarClass, fields);
			return get(scalarClass, reqPDU);
		} catch (SecurityException e) {
			throw new SnmpAnnotationException(e);
		} catch (NoSuchFieldException e) {
			throw new SnmpAnnotationException(e);
		}
	}

	public <T> List<T> getTable(Class<T> entryClass) throws IOException, SnmpException,
			SnmpAnnotationException {
		try {
			List<T> list = new ArrayList<T>();
			// init pdu
			PDU reqPDU = newGetNextFirstEntryPDU(entryClass);
			checkReqError(reqPDU);
			OID firstReqOid = reqPDU.get(0).getOid();
			while (true) {
				ResponseEvent event = snmp4J.getNext(reqPDU, getReadTarget());
				checkEventError(event);
				PDU respPDU = event.getResponse();
				checkResError(respPDU);
				OID firstRespOid = respPDU.get(0).getOid();
				if (isTableEnd(firstReqOid, firstRespOid)) {
					break;
				}
				int[] indexOids = extractIndexOids(firstRespOid, firstReqOid);
				T entry = entryClass.newInstance();
				fillIndices(entry, indexOids);
				fillProperties(entry, respPDU);
				list.add(entry);
				reqPDU = newGetNextEntryPDU(entry);
			}
			return list;
		} catch (IllegalArgumentException e) {
			throw new SnmpAnnotationException(e);
		} catch (InstantiationException e) {
			throw new SnmpAnnotationException(e);
		} catch (IllegalAccessException e) {
			throw new SnmpAnnotationException(e);
		}
	}

	public <T> T getByIndex(Class<T> entryClass, Serializable indices)
			throws IOException, SnmpException, SnmpAnnotationException {
		try {
			T entry = buildEntryWithIndices(entryClass, indices);
			PDU reqPDU = newGetEntryPDU(entry);
			return getEntryByIndex(entry, reqPDU);
		} catch (InstantiationException e) {
			throw new SnmpAnnotationException(e);
		} catch (IllegalAccessException e) {
			throw new SnmpAnnotationException(e);
		}
	}

	public <T> T getByIndex(Class<T> entryClass, Serializable indices,
			String[] fields) throws IOException, SnmpException,
			SnmpAnnotationException {
		try {
			T entry = buildEntryWithIndices(entryClass, indices);
			PDU reqPDU = newGetEntryPDU(entry, fields);
			return getEntryByIndex(entry, reqPDU);
		} catch (IllegalArgumentException e) {
			throw new SnmpAnnotationException(e);
		} catch (SecurityException e) {
			throw new SnmpAnnotationException(e);
		} catch (IllegalAccessException e) {
			throw new SnmpAnnotationException(e);
		} catch (NoSuchFieldException e) {
			throw new SnmpAnnotationException(e);
		} catch (InstantiationException e) {
			throw new SnmpAnnotationException(e);
		}
	}

	public void set(Object entry) throws IOException, SnmpException,
			SnmpAnnotationException {
		try {
			PDU reqPDU = newSetPDU(entry);
			checkReqError(reqPDU);
			ResponseEvent event = snmp4J.set(reqPDU, getWriteTarget());
			checkEventError(event);
			PDU resPDU = event.getResponse();
			checkResError(resPDU);
		} catch (InstantiationException e) {
			throw new SnmpAnnotationException(e);
		} catch (IllegalAccessException e) {
			throw new SnmpAnnotationException(e);
		} catch (IllegalArgumentException e) {
			e.printStackTrace();
		} catch (SecurityException e) {
			throw new SnmpAnnotationException(e);
		} catch (NoSuchMethodException e) {
			throw new SnmpAnnotationException(e);
		} catch (InvocationTargetException e) {
			throw new SnmpAnnotationException(e);
		}
	}

	public void create(Object entry) throws IOException, SnmpException,
			SnmpAnnotationException {
		try {
			PDU reqPDU = newCreatePDU(entry);
			checkReqError(reqPDU);
			ResponseEvent event = snmp4J.set(reqPDU, getWriteTarget());
			checkEventError(event);
			PDU resPDU = event.getResponse();
			checkResError(resPDU);
		} catch (IllegalArgumentException e) {
			throw new SnmpAnnotationException(e);
		} catch (IllegalAccessException e) {
			throw new SnmpAnnotationException(e);
		} catch (SecurityException e) {
			throw new SnmpAnnotationException(e);
		} catch (NoSuchMethodException e) {
			throw new SnmpAnnotationException(e);
		} catch (InstantiationException e) {
			throw new SnmpAnnotationException(e);
		} catch (InvocationTargetException e) {
			throw new SnmpAnnotationException(e);
		}
	}

	public void delete(Object entry) throws IOException, SnmpException,
			SnmpAnnotationException {
		try {
			PDU reqPDU = newDeletPDU(entry);
			checkReqError(reqPDU);
			ResponseEvent event = snmp4J.set(reqPDU, getWriteTarget());
			checkEventError(event);
			PDU resPDU = event.getResponse();
			checkResError(resPDU);
		} catch (IllegalArgumentException e) {
			throw new SnmpAnnotationException(e);
		} catch (IllegalAccessException e) {
			throw new SnmpAnnotationException(e);
		}
	}

	public void close() throws IOException {
		snmp4J.close();
	}

	private Field[] getWritePropFields(Class clazz) {
		List<Field> list = new ArrayList<Field>();
		Field[] fields = clazz.getDeclaredFields();
		for (Field field : fields) {
			if (field.isAnnotationPresent(MibObjectType.class)
					&& !field.isAnnotationPresent(MibIndex.class)) {
				MibObjectType mot = field.getAnnotation(MibObjectType.class);
				if (mot.access() == Access.WRITE
						|| mot.access() == Access.CREATE) {
					list.add(field);
				}
			}
		}
		return (Field[]) list.toArray(new Field[list.size()]);
	}

	private OID buildIndexOid(Object entry) throws IllegalArgumentException,
			IllegalAccessException {
		Class clazz = entry.getClass();
		Field[] indexFields = getIndexFields(clazz);
		OID oid = null;
		for (Field indexField : indexFields) {
			indexField.setAccessible(true);
			Object value = indexField.get(entry);
			MibIndex miAnnotation = indexField.getAnnotation(MibIndex.class);
			int length = miAnnotation.length();
			if (length == MibIndex.VARSTR_WITH_LENGTH) {
				byte[] bytes = ((String) value).getBytes();
				int[] integers = new int[bytes.length + 1];
				integers[0] = bytes.length;
				int i = 1;
				for (byte b : bytes) {
					integers[i++] = b;
				}
				oid = appendRawOids(oid, integers);
			} else if (length == MibIndex.VARSTR_WITHOUT_LENGTH) {
				byte[] bytes = ((String) value).getBytes();
				int[] integers = new int[bytes.length];
				int i = 0;
				for (byte b : bytes) {
					integers[i++] = b;
				}
				oid = appendRawOids(oid, integers);
			} else if (length == 1) {
				MibObjectType mot = indexField
						.getAnnotation(MibObjectType.class);
				Class smiTypeClass = getSmiTypeProvider().getSmiType(
						mot.smiType());
				if (smiTypeClass.equals(Integer32.class)) {
					int v = ((Integer) value).intValue();
					oid = appendRawOids(oid, new int[] { v });
				} else if (UnsignedInteger32.class
						.isAssignableFrom(smiTypeClass)) {
					int v = (int) ((Long) value).longValue();
					oid = appendRawOids(oid, new int[] { v });
				} else {
					throw new RuntimeException("Index length should not be 1."
							+ indexField);
				}
			} else if (length >= 1) {
				MibObjectType mot = indexField
						.getAnnotation(MibObjectType.class);
				SmiType smiType = mot.smiType();
				if (smiType == SmiType.OID) {
					if (oid == null)
						oid = new OID();
					oid.append((String) value);
				} else if (smiType == SmiType.DISPLAY_STRING) {
					byte[] bytes = ((String) value).getBytes();
					int[] integers = new int[length];
					for (int i = 0; i < integers.length; i++) {
						integers[i] = (int) bytes[i];
					}
					oid = appendRawOids(oid, integers);
				} else if (smiType == SmiType.OCTET_STRING) {
					byte[] bytes = ((byte[]) value);
					int[] integers = new int[length];
					for (int i = 0; i < integers.length; i++) {
						integers[i] = (int) bytes[i];
					}
					oid = appendRawOids(oid, integers);
				} else if (smiType == SmiType.IPADDRESS) {
					String[] strBytes = ((String) value).split("\\.");
					if (strBytes.length != 4)
						throw new RuntimeException(
								"Assert faild. IpAddres length must be 1.");
					int[] integers = new int[strBytes.length];
					for (int i = 0; i < integers.length; i++) {
						integers[i] = Integer.parseInt(strBytes[i]);
					}
					oid = appendRawOids(oid, integers);
				} else {
					throw new RuntimeException("Unknow smiType: " + smiType);
				}
			} else {
				throw new RuntimeException(
						"Assert Failed! Unknow index length.");
			}
		}
		return oid;
	}

	private OID appendRawOids(OID oid, int[] integers) {
		if (oid == null)
			return new OID(integers);
		oid.append(new OID(integers));
		return oid;
	}

	private void fillIndices(Object entry, int[] indexOids)
			throws IllegalArgumentException, IllegalAccessException {
		Class clazz = entry.getClass();
		Field[] indexFields = getIndexFields(clazz);
		for (int i = 0, j = 0; i < indexFields.length && j < indexOids.length; i++) {
			Field indexField = indexFields[i];
			indexField.setAccessible(true);
			MibIndex miAnnotation = indexField.getAnnotation(MibIndex.class);
			int length = miAnnotation.length();
			if (length == MibIndex.VARSTR_WITH_LENGTH) {
				byte[] bytes = new byte[indexOids[j++]];
				bytes = copyBytes(indexOids, j, bytes);
				indexField.set(entry, new String(bytes));
				j += bytes.length;
			} else if (length == MibIndex.VARSTR_WITHOUT_LENGTH) {
				byte[] bytes = new byte[indexOids.length - j];
				bytes = copyBytes(indexOids, j, bytes);
				indexField.set(entry, new String(bytes));
				j += bytes.length;
			} else if (length == 1) {
				MibObjectType mot = indexField
						.getAnnotation(MibObjectType.class);
				Class smiTypeClass = getSmiTypeProvider().getSmiType(
						mot.smiType());
				if (smiTypeClass.equals(Integer32.class)) {
					indexField.set(entry, indexOids[j++]);
				} else if (UnsignedInteger32.class
						.isAssignableFrom(smiTypeClass)) {
					indexField.set(entry, (long) indexOids[j++]);
				} else {
					throw new RuntimeException("Index length should not be 1."
							+ indexField);
				}
			} else if (length >= 1) {
				MibObjectType mot = indexField
						.getAnnotation(MibObjectType.class);
				SmiType smiType = mot.smiType();
				if (smiType == SmiType.OID) {
					int[] oidValue = new int[length];
					System.arraycopy(indexOids, j, oidValue, 0, length);
					indexField.set(entry, intAry2Str(oidValue));
				} else if (smiType == SmiType.DISPLAY_STRING) {
					byte[] bytes = new byte[length];
					bytes = copyBytes(indexOids, j, bytes);
					indexField.set(entry, new String(bytes));
				} else if (smiType == SmiType.OCTET_STRING) {
					byte[] bytes = new byte[length];
					bytes = copyBytes(indexOids, j, bytes);
					indexField.set(entry, bytes);
				} else if (smiType == SmiType.IPADDRESS) {
					if (length != 4)
						throw new RuntimeException(
								"Asser Failed, IpAddress length must be 4. length="
										+ length);
					StringBuffer sb = new StringBuffer();
					sb.append(indexOids[j]).append('.');
					sb.append(indexOids[j + 1]).append('.');
					sb.append(indexOids[j + 2]).append('.');
					sb.append(indexOids[j + 3]);
					indexField.set(entry, sb.toString());
				} else {
					throw new RuntimeException("Unknow smiType: " + smiType);
				}
				j += length;
			} else {
				throw new RuntimeException(
						"Assert Failed! Unknow index length.");
			}
		}
	}

	private String intAry2Str(int[] oidValue) {
		StringBuffer sb = new StringBuffer();
		for (int i : oidValue) {
			sb.append(i).append('.');
		}
		if (sb.length() > 0)
			sb.deleteCharAt(sb.length() - 1);
		return sb.toString();
	}

	private byte[] copyBytes(int[] srcArray, int srcPos, byte[] destBytes) {
		for (int k = 0; k < destBytes.length; k++) {
			destBytes[k] = (byte) (srcArray[srcPos + k] & 0xff);
		}
		return destBytes;
	}

	private Field[] getIndexFields(Class clazz) {
		Field[] fields = clazz.getDeclaredFields();
		List<Field> list = new ArrayList<Field>();
		for (int i = 0; i < fields.length; i++) {
			if (fields[i].isAnnotationPresent(MibIndex.class)) {
				fields[i].setAccessible(true);
				list.add(fields[i]);
			}
		}
		Field[] indexFields = list.toArray(new Field[list.size()]);
		// bubble sort.
		for (int i = 0; i < indexFields.length; i++) {
			for (int j = i + 1; j < indexFields.length; j++) {
				Field top = indexFields[i];
				int no = top.getAnnotation(MibIndex.class).no();
				Field another = indexFields[j];
				int anotherNo = another.getAnnotation(MibIndex.class).no();
				if (anotherNo < no) {
					indexFields[i] = another;
					indexFields[j] = top;
				}
			}
		}
		return indexFields;
	}

	private int[] extractIndexOids(OID firstRespOid, OID firstReqOid) {
		int[] respOids = firstRespOid.getValue();
		int[] reqOids = firstReqOid.getValue();
		int[] indexOids = new int[respOids.length - reqOids.length];
		System.arraycopy(respOids, reqOids.length, indexOids, 0,
				indexOids.length);
		return indexOids;
	}

	private boolean isTableEnd(OID firstReqOid, OID firstRespOid) {
		// TODO: END OF MIB
		return !firstRespOid.startsWith(firstReqOid);
	}

	private void fillProperties(Object object, PDU pdu)
			throws InstantiationException, IllegalAccessException {
		Field[] propFields = getPropFields(object.getClass());
		Vector variableBindings = pdu.getVariableBindings();
		for (Field propField : propFields) {
			propField.setAccessible(true);
			MibObjectType mot = propField.getAnnotation(MibObjectType.class);
			OID oid = new OID(mot.oid());
			Variable variable = findVariableByOid(oid, variableBindings);
			if (variable != null) {
				Object value = variable.getValue();
				if (mot.smiType() == SmiType.DISPLAY_STRING) {
					value = new String((byte[]) value);
				} else if (mot.smiType() == SmiType.OID) {
					value = ((OID) variable).toString();
				}
				propField.set(object, value);
			}
		}
	}

	private Variable findVariableByOid(OID oid, Vector variableBindings) {
		for (Iterator it = variableBindings.iterator(); it.hasNext();) {
			VariableBinding vb = (VariableBinding) it.next();
			if (vb.getOid().startsWith(oid)) {
				return vb.getVariable();
			}
		}
		return null;
	}

	private PDU newSetPDU(Object entry) throws IllegalArgumentException,
			IllegalAccessException, SecurityException, NoSuchMethodException,
			InstantiationException, InvocationTargetException {
		PDU pdu = new PDU();
		pdu.setType(PDU.SET);
		OID indexOid = buildIndexOid(entry);
		Field[] writePropFields = getWritePropFields(entry.getClass());
		for (Field writeField : writePropFields) {
			writeField.setAccessible(true);
			MibObjectType mot = writeField.getAnnotation(MibObjectType.class);
			OID oid = new OID(mot.oid());
			if (indexOid != null) {
				oid.append(indexOid);
			}
			Class type = writeField.getType();
			Constructor constructor = getSmiTypeProvider().getSmiType(
					mot.smiType()).getConstructor(new Class[] { type });
			Variable variable = (Variable) constructor
					.newInstance(new Object[] { writeField.get(entry) });
			pdu.add(new VariableBinding(oid, variable));
		}
		return pdu;
	}

	private PDU newDeletPDU(Object entry) throws IllegalArgumentException,
			IllegalAccessException, SnmpAnnotationException {
		PDU pdu = new PDU();
		pdu.setType(PDU.SET);
		pdu.add(newDeleteVB(entry));
		return pdu;
	}

	private VariableBinding newDeleteVB(Object entry)
			throws IllegalAccessException, SnmpAnnotationException {
		OID indexOid = buildIndexOid(entry);
		if (indexOid == null)
			throw new SnmpAnnotationException(new NullPointerException(
					"No index oid."));
		RowStatus rowStatus = entry.getClass().getAnnotation(RowStatus.class);
		if (rowStatus == null)
			throw new SnmpAnnotationException(new NullPointerException(
					"No RowStatus Annotation."));
		OID oid = new OID(rowStatus.oid());
		oid.append(indexOid);
		Integer32 var = new Integer32(rowStatus.delete());
		VariableBinding vb = new VariableBinding(oid, var);
		return vb;
	}

	private PDU newCreatePDU(Object entry) throws IllegalArgumentException,
			SecurityException, IllegalAccessException, NoSuchMethodException,
			InstantiationException, InvocationTargetException,
			SnmpAnnotationException {
		PDU pdu = newSetPDU(entry);
		pdu.add(newCreateVB(entry));
		return pdu;
	}

	private VariableBinding newCreateVB(Object entry)
			throws IllegalAccessException, SnmpAnnotationException {
		OID indexOid = buildIndexOid(entry);
		checkIndexOid(indexOid);
		RowStatus rowStatus = entry.getClass().getAnnotation(RowStatus.class);
		checkRowStatusAnnotation(rowStatus);
		OID oid = new OID(rowStatus.oid());
		oid.append(indexOid);
		Integer32 var = new Integer32(rowStatus.create());
		return new VariableBinding(oid, var);
	}

	private PDU newGetPDU(Class scalarClass) {
		PDU pdu = new PDU();
		pdu.setType(PDU.GET);
		Field[] propFields = getPropFields(scalarClass);
		for (Field propField : propFields) {
			MibObjectType mib = propField.getAnnotation(MibObjectType.class);
			pdu.add(new VariableBinding(new OID(mib.oid())));
		}
		return pdu;
	}

	private PDU newGetPDU(Class scalarClass, String[] fields)
			throws SecurityException, NoSuchFieldException {
		PDU pdu = new PDU();
		pdu.setType(PDU.GET);
		for (String fn : fields) {
			Field field = scalarClass.getDeclaredField(fn);
			MibObjectType mib = field.getAnnotation(MibObjectType.class);
			pdu.add(new VariableBinding(new OID(mib.oid())));
		}
		return pdu;
	}

	private <T> T get(Class<T> scalarClass, PDU reqPDU) throws IOException,
			SnmpException, SnmpAnnotationException {
		try {
			checkReqError(reqPDU);
			ResponseEvent event = snmp4J.get(reqPDU, getReadTarget());
			checkEventError(event);
			PDU resPDU = event.getResponse();
			checkResError(resPDU);
			T mibObj = scalarClass.newInstance();
			fillProperties(mibObj, resPDU);
			return mibObj;
		} catch (InstantiationException e) {
			throw new SnmpAnnotationException(e);
		} catch (IllegalAccessException e) {
			throw new SnmpAnnotationException(e);
		}
	}

	private PDU newGetEntryPDU(Object entry) throws IllegalArgumentException,
			IllegalAccessException {
		PDU pdu = new PDU();
		pdu.setType(PDU.GET);
		OID indexOid = buildIndexOid(entry);
		Field[] propFields = getPropFields(entry.getClass());
		for (Field propField : propFields) {
			MibObjectType mib = propField.getAnnotation(MibObjectType.class);
			OID oid = new OID(mib.oid());
			if (indexOid != null) {
				oid.append(indexOid);
			}
			pdu.add(new VariableBinding(oid));
		}
		return pdu;
	}

	private PDU newGetNextFirstEntryPDU(Class entryClass) {
		PDU pdu = new PDU();
		pdu.setType(PDU.GETNEXT);
		Field[] propFields = getPropFields(entryClass);
		for (Field propField : propFields) {
			MibObjectType mib = propField.getAnnotation(MibObjectType.class);
			pdu.add(new VariableBinding(new OID(mib.oid())));
		}
		if (pdu.size() <= 0) {
			// in some mib, there are only indices.
			Field[] indexFields = getIndexFields(entryClass);
			if (indexFields.length > 0) {
				MibObjectType mot = indexFields[0]
						.getAnnotation(MibObjectType.class);
				pdu.add(new VariableBinding(new OID(mot.oid())));
			}
		}
		return pdu;
	}

	private PDU newGetNextEntryPDU(Object entry)
			throws IllegalArgumentException, IllegalAccessException {
		PDU pdu = newGetEntryPDU(entry);
		pdu.setType(PDU.GETNEXT);
		if (pdu.size() <= 0) {
			OID indexOid = buildIndexOid(entry);
			Field[] indexFields = getIndexFields(entry.getClass());
			if (indexFields.length > 0) {
				MibObjectType mib = indexFields[0]
						.getAnnotation(MibObjectType.class);
				OID oid = new OID(mib.oid());
				if (indexOid != null) {
					oid.append(indexOid);
				}
				pdu.add(new VariableBinding(oid));
			}
		}
		return pdu;
	}

	private PDU newGetEntryPDU(Object entry, String[] fields)
			throws IllegalArgumentException, IllegalAccessException,
			SecurityException, NoSuchFieldException {
		PDU pdu = new PDU();
		pdu.setType(PDU.GET);
		OID indexOid = buildIndexOid(entry);
		for (String fn : fields) {
			Field field = entry.getClass().getDeclaredField(fn);
			MibObjectType mib = field.getAnnotation(MibObjectType.class);
			OID oid = new OID(mib.oid());
			if (indexOid != null) {
				oid.append(indexOid);
			}
			pdu.add(new VariableBinding(oid));
		}
		return pdu;
	}

	private <T> T getEntryByIndex(T entry, PDU reqPDU)
			throws IOException, SnmpException, InstantiationException,
			IllegalAccessException {
		checkReqError(reqPDU);
		ResponseEvent event = snmp4J.get(reqPDU, getReadTarget());
		checkEventError(event);
		PDU resPDU = event.getResponse();
		checkResError(resPDU);
		fillProperties(entry, resPDU);
		return entry;
	}

	private <T> T buildEntryWithIndices(Class<T> entryClass, Serializable indices)
			throws InstantiationException, IllegalAccessException {
		T entry = entryClass.newInstance();
		Field[] indexFields = getIndexFields(entryClass);
		if (indexFields.length == 1) {
			indexFields[0].set(entry, indices);
		} else {
			Serializable[] indicesArray = (Serializable[]) indices;
			for (int i = 0; i < indexFields.length; i++) {
				indexFields[i].set(entry, indicesArray[i]);
			}
		}
		return entry;
	}

	private Field[] getPropFields(Class clazz) {
		List<Field> list = new ArrayList<Field>();
		Field[] fields = clazz.getDeclaredFields();
		for (Field field : fields) {
			field.setAccessible(true);
			if (field.isAnnotationPresent(MibObjectType.class)
					&& !field.isAnnotationPresent(MibIndex.class)) {
				list.add(field);
			}
		}
		return (Field[]) list.toArray(new Field[list.size()]);
	}

	private void checkRowStatusAnnotation(RowStatus rowStatus)
			throws SnmpAnnotationException {
		if (rowStatus == null) {
			throw new SnmpAnnotationException(new NullPointerException(
					"No RowStatus Annotation."));
		}
	}

	private void checkIndexOid(OID indexOid) throws SnmpAnnotationException {
		if (indexOid == null) {
			throw new SnmpAnnotationException(new NullPointerException(
					"No index oid."));
		}
	}

	private void checkResError(PDU resPDU) throws SnmpException {
		if (resPDU == null) {
			SnmpException e = new SnmpException(SnmpException.NO_RESPONSE_PDU, -1);
			e.setSnmpErrorMsgProvider(getSnmpErrorMsgProvider());
			throw e;
		}
		if (resPDU.getErrorStatus() != 0) {
			SnmpException e = new SnmpException(resPDU.getErrorStatus(), resPDU
					.getErrorIndex());
			e.setSnmpErrorMsgProvider(getSnmpErrorMsgProvider());
			throw e;
		}
	}

	private void checkReqError(PDU reqPDU) {
		if (reqPDU.size() == 0) {
			throw new IllegalArgumentException("No declarative mib object.");
		}
	}

	private void checkEventError(ResponseEvent event) throws SnmpException {
		if (event.getError() != null) {
			SnmpException e = new SnmpException(event.getError());
			e.setSnmpErrorMsgProvider(getSnmpErrorMsgProvider());
			throw e;
		}
	}

}
