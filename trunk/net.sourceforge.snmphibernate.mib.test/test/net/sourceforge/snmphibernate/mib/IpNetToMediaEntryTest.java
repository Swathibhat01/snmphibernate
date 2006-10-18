package net.sourceforge.snmphibernate.mib;

import java.io.Serializable;

import net.sourceforge.snmphibernate.mib.net.IpNetToMediaEntry;

public class IpNetToMediaEntryTest extends MibTest {
	
	public void testGetTable() throws Exception {
		session.getTable(IpNetToMediaEntry.class);
	}
	
	public void testGetByIndex() throws Exception {
		session.getByIndex(IpNetToMediaEntry.class, new Serializable[]{65539, "192.168.0.1"});
	}
	
}
