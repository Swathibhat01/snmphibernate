package org.opengoss.snmphibernate.impl.snmp4j;

import java.io.IOException;

import org.opengoss.snmphibernate.api.ISnmpSession;
import org.opengoss.snmphibernate.api.ISnmpSessionFactory;
import org.opengoss.snmphibernate.api.ISnmpTarget;


public class Snmp4JSessionFactory implements ISnmpSessionFactory {

	private final Snmp4JSmiTypeProvider typeProvider;

	private final Snmp4JErrorMsgProvider errorMsgProvider;

	public Snmp4JSessionFactory() {
		typeProvider = new Snmp4JSmiTypeProvider();
		errorMsgProvider = new Snmp4JErrorMsgProvider();
	}

	public ISnmpSession newSnmpSession(ISnmpTarget target) throws IOException {
		Snmp4JSession session = new Snmp4JSession(target);
		session.setSmiTypeProvider(typeProvider);
		session.setSnmpErrorMsgProvider(errorMsgProvider);
		return session;
	}

}
