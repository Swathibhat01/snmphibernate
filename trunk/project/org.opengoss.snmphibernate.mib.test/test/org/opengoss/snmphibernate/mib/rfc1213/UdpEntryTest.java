package org.opengoss.snmphibernate.mib.rfc1213;

import java.util.List;

import org.opengoss.snmphibernate.mib.MibTest;
import org.opengoss.snmphibernate.mib.rfc1213.UdpEntry;


public class UdpEntryTest extends MibTest {

	public void testGetTable() throws Exception {
		List<UdpEntry> list = session.getTable(UdpEntry.class);
		for (Object o : list) {
			System.out.println(((UdpEntry) o).getUdpLocalPort());
		}
	}
}
