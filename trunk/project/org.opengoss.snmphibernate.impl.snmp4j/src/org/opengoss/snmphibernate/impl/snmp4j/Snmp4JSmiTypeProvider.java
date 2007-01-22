package org.opengoss.snmphibernate.impl.snmp4j;


import org.opengoss.snmphibernate.api.AssertFailureException;
import org.opengoss.snmphibernate.api.ISmiTypeProvider;
import org.opengoss.snmphibernate.api.SmiType;
import org.snmp4j.smi.Counter32;
import org.snmp4j.smi.Counter64;
import org.snmp4j.smi.DisplayString;
import org.snmp4j.smi.Gauge32;
import org.snmp4j.smi.Integer32;
import org.snmp4j.smi.IpAddress;
import org.snmp4j.smi.OID;
import org.snmp4j.smi.OctetString;
import org.snmp4j.smi.TimeTicks;
import org.snmp4j.smi.UnsignedInteger32;

public class Snmp4JSmiTypeProvider implements ISmiTypeProvider {

	public Class getSmiType(SmiType smiTypeEnum) {
		switch(smiTypeEnum) {
		case INTEGER:
		case INTEGER32:
			return Integer32.class;
		case UNSIGNED32:
			return UnsignedInteger32.class;
		case COUNTER32:
			return Counter32.class;
		case GAUGE32:
			return Gauge32.class;
		case TIMETICKS:
			return TimeTicks.class;
		case COUNTER64:
			return Counter64.class;
		case OCTET_STRING:
		case OPAQUE:
			return OctetString.class;
		case DISPLAY_STRING:
			return DisplayString.class;
		case OID:
			return OID.class;
		case IPADDRESS:
			return IpAddress.class;
		}
		throw new AssertFailureException("Unknow enum type: " + smiTypeEnum);
	}

}
