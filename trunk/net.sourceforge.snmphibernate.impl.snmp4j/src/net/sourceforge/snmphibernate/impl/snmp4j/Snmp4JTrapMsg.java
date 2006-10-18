package net.sourceforge.snmphibernate.impl.snmp4j;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Vector;

import net.sourceforge.snmphibernate.api.ISnmpTrapMsg;

import org.snmp4j.PDU;
import org.snmp4j.PDUv1;
import org.snmp4j.smi.OID;
import org.snmp4j.smi.Variable;
import org.snmp4j.smi.VariableBinding;

//TODO: Parse the trap to a map msg
public class Snmp4JTrapMsg implements ISnmpTrapMsg {
	
	private Map<String, Object> valueMap = new HashMap<String, Object>(5);

	public Snmp4JTrapMsg(PDU pdu) {
		if (pdu instanceof PDUv1) {//v1 trap
			parseV1((PDUv1) pdu);
		} else { //v2c trap
			parseV2c(pdu);
		}
	}
	
	private void parseV1(PDUv1 pdu) {
		//TODO: parse header
		//parse variable bindings
		parseVariableBindings(pdu.getVariableBindings());
	}

	private void parseV2c(PDU pdu) {
		//TODO: parse header
		//parse variable bindings
		parseVariableBindings(pdu.getVariableBindings());
	}

	private void parseVariableBindings(Vector vbs) {
		for (Iterator it = vbs.iterator(); it.hasNext();) {
			VariableBinding vb = (VariableBinding) it.next();
			OID oid = vb.getOid();
			Variable var = vb.getVariable();
			valueMap.put(oid.toString(), var.getValue());
		}
	}
	
	public Map<String, Object> getMap() {
		return valueMap;
	}

	@Override
	public String toString() {
		return valueMap.toString();
	}
	
}
