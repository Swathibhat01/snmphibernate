package org.opengoss.snmphibernate.mib.host;

import org.opengoss.snmphibernate.mib.MibTest;
import org.opengoss.snmphibernate.mib.host.HrSWRunPerfEntry;

public class HrSWRunPerfEntryTest extends MibTest {

	public void testGetTable() throws Exception {
		session.getTable(HrSWRunPerfEntry.class);
	}
}
