package net.sourceforge.snmphibernate.mib;

import junit.framework.TestCase;
import net.sourceforge.snmphibernate.api.ISnmpClientFacade;
import net.sourceforge.snmphibernate.api.ISnmpSession;
import net.sourceforge.snmphibernate.api.ISnmpSessionFactory;
import net.sourceforge.snmphibernate.api.ISnmpTargetFactory;
import net.sourceforge.snmphibernate.impl.snmp4j.Snmp4JClientFacade;

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
