package org.opengoss.snmphibernate.impl.snmp4j;

import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Vector;

import org.opengoss.snmphibernate.api.ISnmpTrapMsg;
import org.snmp4j.PDU;
import org.snmp4j.PDUv1;
import org.snmp4j.mp.SnmpConstants;
import org.snmp4j.smi.Address;
import org.snmp4j.smi.OID;
import org.snmp4j.smi.Variable;
import org.snmp4j.smi.VariableBinding;

/**
 * Trap message parsed from SNMP4J trap PDU
 * 
 * @author Ery Lee(ery.lee@gmail.com)
 * 
 */
public class Snmp4JTrapMsg implements ISnmpTrapMsg {

	private Address peerAddr;

	private Map<String, Object> valueMap = new HashMap<String, Object>(5);

	public Snmp4JTrapMsg(Address address, PDU pdu) {
		this.peerAddr = address;
		valueMap.put(MSG_TYPE, "trap");
		valueMap.put(NODE_ADDR, getPeerAddr());
		valueMap.put(RECEIVED_TIME, System.currentTimeMillis());
		if (pdu instanceof PDUv1) {// v1 trap
			parseV1((PDUv1) pdu);
		} else { // v2c trap
			parseV2c(pdu);
		}
	}

	public Map<String, Object> toMap() {
		return Collections.unmodifiableMap(valueMap);
	}

	public String getTrapOid() {
		return (String) valueMap.get(TRAP_OID);
	}

	public String getPeerAddr() {
		String s = peerAddr.toString();
		int idx = s.indexOf('/');
		if(idx != -1) {
			s = s.substring(0, idx);
		}
		return s;
	}
	
	private void parseV1(PDUv1 pdu) {
		// parse headers
		valueMap.put(ENTERPRISE, pdu.getEnterprise().toString());
		valueMap.put(AGENT_ADDR, pdu.getAgentAddress());
		valueMap.put(GENERIC_TRAP, pdu.getGenericTrap());
		valueMap.put(SPECIFIC_TRAP, pdu.getSpecificTrap());
		valueMap.put(TIME_STAMP, pdu.getTimestamp());
		OID trapOid = SnmpConstants.getTrapOID(pdu.getEnterprise(), pdu
				.getGenericTrap(), pdu.getSpecificTrap());
		valueMap.put(TRAP_OID, trapOid.toString());
		// parse variable bindings
		Vector vbs = pdu.getVariableBindings();
		for (Iterator it = vbs.iterator(); it.hasNext();) {
			VariableBinding vb = (VariableBinding) it.next();
			OID oid = vb.getOid();
			Variable var = vb.getVariable();
			valueMap.put(oid.toString(), var.getValue());
		}
	}

	private void parseV2c(PDU pdu) {
		//set the agent address the same to peer address
		valueMap.put(AGENT_ADDR, getPeerAddr());
		// parse header
		Vector vbs = pdu.getVariableBindings();
		for (Iterator it = vbs.iterator(); it.hasNext();) {
			VariableBinding vb = (VariableBinding) it.next();
			OID oid = vb.getOid();
			Variable var = vb.getVariable();
			if (oid.equals(SnmpConstants.snmpTrapOID)) {
				valueMap.put(TRAP_OID, var.getValue().toString());
			} else if (oid.equals(SnmpConstants.sysUpTime)) {
				valueMap.put(TIME_STAMP, var.getValue());
			} else {
				valueMap.put(oid.toString(), var.getValue());
			}
		}
	}

	@Override
	public String toString() {
		return valueMap.toString();
	}

}
