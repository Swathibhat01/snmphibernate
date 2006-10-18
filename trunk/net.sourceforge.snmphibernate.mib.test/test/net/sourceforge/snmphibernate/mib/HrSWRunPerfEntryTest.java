package net.sourceforge.snmphibernate.mib;

import net.sourceforge.snmphibernate.mib.host.HrSWRunPerfEntry;

public class HrSWRunPerfEntryTest extends MibTest {

	public void testGetTable() throws Exception {
		session.getTable(HrSWRunPerfEntry.class);
	}
}
