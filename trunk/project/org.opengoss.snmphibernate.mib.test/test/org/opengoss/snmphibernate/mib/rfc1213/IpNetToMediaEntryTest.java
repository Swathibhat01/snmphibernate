package org.opengoss.snmphibernate.mib.rfc1213;

import java.io.Serializable;
import java.util.List;

import org.opengoss.snmphibernate.mib.MibTest;
import org.opengoss.snmphibernate.mib.rfc1213.IpNetToMediaEntry;

public class IpNetToMediaEntryTest extends MibTest {

	public void testGetTable() throws Exception {
		session.getTable(IpNetToMediaEntry.class);
	}

	public void testGetByIndex() throws Exception {
		List<IpNetToMediaEntry> list = session
				.getTable(IpNetToMediaEntry.class);
		assertTrue(list.size() > 0);
		IpNetToMediaEntry entry = list.get(0);
		session.getByIndex(IpNetToMediaEntry.class, new Serializable[] {
				entry.getIpNetToMediaIfIndex(),
				entry.getIpNetToMediaNetAddress() });
	}

}
