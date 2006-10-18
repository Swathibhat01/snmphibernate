package net.sourceforge.snmphibernate.mib;

import net.sourceforge.snmphibernate.mib.net.IpRouteEntry;

public class IpRouteEntryTest extends MibTest {

	public void testGetTable() throws Exception {
		session.getTable(IpRouteEntry.class);
	}
}
