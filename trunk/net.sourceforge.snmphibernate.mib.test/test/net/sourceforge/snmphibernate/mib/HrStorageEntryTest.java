package net.sourceforge.snmphibernate.mib;

import net.sourceforge.snmphibernate.mib.host.HrStorageEntry;

public class HrStorageEntryTest extends MibTest {

	public void testGetTable() throws Exception {
		session.getTable(HrStorageEntry.class);
	}
}
