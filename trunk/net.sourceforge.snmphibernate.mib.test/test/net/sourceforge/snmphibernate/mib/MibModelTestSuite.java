package net.sourceforge.snmphibernate.mib;

import junit.framework.Test;
import junit.framework.TestSuite;

public class MibModelTestSuite {

	public static Test suite() {
		TestSuite suite = new TestSuite(
				"Test for net.sourceforge.erynmms.mibmodel.test");
		//$JUnit-BEGIN$
		suite.addTestSuite(UdpEntryTest.class);
		suite.addTestSuite(IpRouteEntryTest.class);
		suite.addTestSuite(HrSWInstalledEntryTest.class);
		suite.addTestSuite(HrSWRunEntryTest.class);
		suite.addTestSuite(TcpInfoTest.class);
		suite.addTestSuite(Snmp4JSessionTest.class);
		suite.addTestSuite(IpAddrEntryTest.class);
		suite.addTestSuite(UdpInfoTest.class);
		suite.addTestSuite(HrStorageEntryTest.class);
		suite.addTestSuite(IcmpInfoTest.class);
		suite.addTestSuite(TcpConnEntryTest.class);
		suite.addTestSuite(HrSWRunPerfEntryTest.class);
		suite.addTestSuite(IpInfoTest.class);
		suite.addTestSuite(HrProcessorEntryTest.class);
		suite.addTestSuite(HrSystemTest.class);
		//$JUnit-END$
		return suite;
	}

}
