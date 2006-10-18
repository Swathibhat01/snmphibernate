package net.sourceforge.snmphibernate.mib;

import net.sourceforge.snmphibernate.mib.IpAddrEntry;

public class IpAddrEntryTest extends MibTest {

	public void testGetTable() throws Exception {
		session.getTable(IpAddrEntry.class);
	}
}
