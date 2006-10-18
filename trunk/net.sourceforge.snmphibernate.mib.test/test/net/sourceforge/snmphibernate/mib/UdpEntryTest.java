package net.sourceforge.snmphibernate.mib;

import java.util.List;

import net.sourceforge.snmphibernate.mib.net.UdpEntry;

public class UdpEntryTest extends MibTest {

	public void testGetTable() throws Exception {
		List list = session.getTable(UdpEntry.class);
		for (Object o : list) {
			java.lang.System.out.println(((UdpEntry) o).getUdpLocalPort());
		}
	}
}
