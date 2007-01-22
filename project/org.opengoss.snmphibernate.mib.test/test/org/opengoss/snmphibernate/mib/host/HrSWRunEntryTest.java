package org.opengoss.snmphibernate.mib.host;

import java.util.List;

import org.opengoss.snmphibernate.mib.MibTest;


public class HrSWRunEntryTest extends MibTest {

	public void testGetTable() throws Exception {
		List<HrSWRunEntry> list = session.getTable(HrSWRunEntry.class);
		for (HrSWRunEntry entry : list) {
			java.lang.System.out.println(entry.getHrSWRunParameters() + ": " + entry.getHrSWRunStatus());
		}
	}
}
