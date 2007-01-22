package org.opengoss.snmphibernate.mib.host;

import org.opengoss.snmphibernate.mib.MibTest;
import org.opengoss.snmphibernate.mib.host.HrSWInstalledEntry;

public class HrSWInstalledEntryTest extends MibTest {

	public void testGetTable() throws Exception {
		session.getTable(HrSWInstalledEntry.class);
	}
}
