package org.opengoss.snmphibernate.mib.host;

import org.opengoss.snmphibernate.mib.host.HrProcessorEntryTest;
import org.opengoss.snmphibernate.mib.host.HrSWInstalledEntryTest;
import org.opengoss.snmphibernate.mib.host.HrSWRunEntryTest;
import org.opengoss.snmphibernate.mib.host.HrSWRunPerfEntryTest;
import org.opengoss.snmphibernate.mib.host.HrStorageEntryTest;
import org.opengoss.snmphibernate.mib.host.HrSystemTest;

import junit.framework.Test;
import junit.framework.TestSuite;

public class HostResourceTestSuite {

	public static Test suite() {
		TestSuite suite = new TestSuite(
				"Test for org.opengoss.snmphibernate.mib.host");
		//$JUnit-BEGIN$
		suite.addTestSuite(HrSWInstalledEntryTest.class);
		suite.addTestSuite(HrSWRunEntryTest.class);
		suite.addTestSuite(HrStorageEntryTest.class);
		suite.addTestSuite(HrSWRunPerfEntryTest.class);
		suite.addTestSuite(HrProcessorEntryTest.class);
		suite.addTestSuite(HrSystemTest.class);
		//$JUnit-END$
		return suite;
	}

}
