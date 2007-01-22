package org.opengoss.snmphibernate.mib;

import org.opengoss.snmphibernate.mib.host.HostResourceTestSuite;
import org.opengoss.snmphibernate.mib.rfc1213.RFC1213TestSuite;

import junit.framework.Test;
import junit.framework.TestSuite;

public class AllTestSuite {

	public static Test suite() {
		TestSuite suite = new TestSuite(
				"Test for org.opengoss.snmphibernate.mib");
		//$JUnit-BEGIN$
		suite.addTest(RFC1213TestSuite.suite());
		suite.addTest(HostResourceTestSuite.suite());
		//$JUnit-END$
		return suite;
	}

}