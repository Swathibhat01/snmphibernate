package org.opengoss.snmphibernate.mib.host;

import org.opengoss.snmphibernate.mib.MibTest;
import org.opengoss.snmphibernate.mib.host.HrProcessorEntry;

public class HrProcessorEntryTest extends MibTest {
	public void testGetTable() throws Exception {
		session.getTable(HrProcessorEntry.class);
	}

}
