package org.opengoss.snmphibernate.mib;

import junit.framework.TestCase;

import org.opengoss.snmphibernate.api.ISnmpClientFacade;
import org.opengoss.snmphibernate.api.ISnmpSession;
import org.opengoss.snmphibernate.api.ISnmpSessionFactory;
import org.opengoss.snmphibernate.api.ISnmpTargetFactory;
import org.opengoss.snmphibernate.impl.snmp4j.Snmp4JClientFacade;

public class MibTest extends TestCase {

	protected ISnmpSession session;

	@Override
	protected void setUp() throws Exception {
		ISnmpClientFacade facade = new Snmp4JClientFacade();
		ISnmpSessionFactory sessionFactory = facade.getSnmpSessionFactory();
		ISnmpTargetFactory targetFactory = facade.getSnmpTargetFactory();
		session = sessionFactory.newSnmpSession(targetFactory.newSnmpTarget(
				"127.0.0.1", 161));
	}
	
	@Override
	protected void tearDown() throws Exception {
		session.close();
	}

}
