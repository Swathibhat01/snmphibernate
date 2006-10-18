package net.sourceforge.snmphibernate.api;

import java.io.IOException;

public interface ISnmpSessionFactory {

	/**
	 * Create SNMP Session.
	 * 
	 * @param target Snmp Target.
	 * @return SNMP Session.
	 * @throws IOException 
	 */
	ISnmpSession newSnmpSession(ISnmpTarget target) throws IOException;
	
}
