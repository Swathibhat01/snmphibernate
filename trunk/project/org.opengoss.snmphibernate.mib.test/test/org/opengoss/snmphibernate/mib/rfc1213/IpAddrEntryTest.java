package org.opengoss.snmphibernate.mib.rfc1213;

import org.opengoss.snmphibernate.mib.MibTest;
import org.opengoss.snmphibernate.mib.rfc1213.IpAddrEntry;

public class IpAddrEntryTest extends MibTest {

	public void testGetTable() throws Exception {
		session.getTable(IpAddrEntry.class);
	}
}
