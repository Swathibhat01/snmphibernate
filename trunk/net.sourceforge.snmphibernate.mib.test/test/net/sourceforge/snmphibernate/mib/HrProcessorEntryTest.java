package net.sourceforge.snmphibernate.mib;

import net.sourceforge.snmphibernate.mib.host.HrProcessorEntry;

public class HrProcessorEntryTest extends MibTest {
	public void testGetTable() throws Exception {
		session.getTable(HrProcessorEntry.class);
	}

}
