package net.sourceforge.snmphibernate.mib;

import net.sourceforge.snmphibernate.mib.host.HrSWInstalledEntry;

public class HrSWInstalledEntryTest extends MibTest {

	public void testGetTable() throws Exception {
		session.getTable(HrSWInstalledEntry.class);
	}
}
