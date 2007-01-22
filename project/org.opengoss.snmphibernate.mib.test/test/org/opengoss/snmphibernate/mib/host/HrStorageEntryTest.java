package org.opengoss.snmphibernate.mib.host;

import org.opengoss.snmphibernate.mib.MibTest;
import org.opengoss.snmphibernate.mib.host.HrStorageEntry;

public class HrStorageEntryTest extends MibTest {

	public void testGetTable() throws Exception {
		session.getTable(HrStorageEntry.class);
	}
}
