package net.sourceforge.snmphibernate.impl.snmp4j;

import org.snmp4j.mp.SnmpConstants;

import net.sourceforge.snmphibernate.api.ISnmpErrorMsgProvider;

public class Snmp4JErrorMsgProvider implements ISnmpErrorMsgProvider {

	public String getErrorMsg(int errorStatus, int errorIndex) {
		if(0 <= errorStatus && errorStatus <= SnmpConstants.SNMP_ERROR_MESSAGES.length) {
			return SnmpConstants.SNMP_ERROR_MESSAGES[errorStatus];
		}
		return "";
	}

}
