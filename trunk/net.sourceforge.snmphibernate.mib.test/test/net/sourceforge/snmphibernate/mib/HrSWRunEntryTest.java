package net.sourceforge.snmphibernate.mib;

import java.util.List;

import net.sourceforge.snmphibernate.mib.host.HrSWRunEntry;

public class HrSWRunEntryTest extends MibTest {

	public void testGetTable() throws Exception {
		List list = session.getTable(HrSWRunEntry.class);
		for (Object object : list) {
			HrSWRunEntry entry = (HrSWRunEntry)object;
			java.lang.System.out.println(entry.getHrSWRunParameters() + ": " + entry.getHrSWRunStatus());
		}
	}
}
