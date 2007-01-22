package org.opengoss.snmphibernate.mib.rfc1213;

import org.opengoss.snmphibernate.mib.MibTest;
import org.opengoss.snmphibernate.mib.rfc1213.IpRouteEntry;

public class IpRouteEntryTest extends MibTest {

	public void testGetTable() throws Exception {
		session.getTable(IpRouteEntry.class);
	}
}
