package org.opengoss.snmphibernate.mib.rfc1213;

import junit.framework.Test;
import junit.framework.TestSuite;

public class RFC1213TestSuite {

	public static Test suite() {
		TestSuite suite = new TestSuite(
				"Test for org.opengoss.snmphibernate.mib.rfc1213");
		//$JUnit-BEGIN$
		suite.addTestSuite(IcmpInfoTest.class);
		suite.addTestSuite(IpRouteEntryTest.class);
		suite.addTestSuite(IpAddrEntryTest.class);
		suite.addTestSuite(IpInfoTest.class);
		suite.addTestSuite(IpNetToMediaEntryTest.class);
		suite.addTestSuite(IpRouteEntryTest.class);
		suite.addTestSuite(TcpConnEntryTest.class);
		suite.addTestSuite(TcpInfoTest.class);
		suite.addTestSuite(UdpEntryTest.class);
		suite.addTestSuite(UdpInfoTest.class);
		//$JUnit-END$
		return suite;
	}

}
