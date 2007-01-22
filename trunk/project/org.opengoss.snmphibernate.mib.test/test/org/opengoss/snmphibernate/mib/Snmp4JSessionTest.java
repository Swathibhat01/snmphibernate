package org.opengoss.snmphibernate.mib;

import java.util.List;

import org.opengoss.snmphibernate.mib.rfc1213.IfEntry;
import org.opengoss.snmphibernate.mib.rfc1213.SystemInfo;


public class Snmp4JSessionTest extends MibTest {

	/*
	 * Test method for
	 * 'net.sourceforge.snmphibernate.api.Snmp4JSession.get(Class)'
	 */
	public void testGet() {
		try {
			SystemInfo sysMIB = session.get(SystemInfo.class);
			assertNotNull(sysMIB.getSysObjectID());
			sysMIB = (SystemInfo) session.get(SystemInfo.class,
					new String[] { "sysObjectID" });
			assertNull(sysMIB.getSysContact());
			assertNotNull(sysMIB.getSysObjectID());
		} catch (Exception e) {
			e.printStackTrace();
			fail();
		}
	}

	public void testGetTable() {
		try {
			List<IfEntry> list = session.getTable(IfEntry.class);
			assertTrue(list.size() > 0);
			for (Object o : list) {
				java.lang.System.out.println(((IfEntry) o).getIfDescr());
			}
		} catch (Exception e) {
			e.printStackTrace();
			fail();
		}
	}

	public void testGetByIndex() {
		try {
			List<IfEntry> list = session.getTable(IfEntry.class);
			assertTrue(list.size() > 0);
			IfEntry rtIfEntry = (IfEntry) session.getByIndex(IfEntry.class, list.get(0).getIfIndex());
			assertNotNull(rtIfEntry.getIfDescr());
			rtIfEntry = (IfEntry) session.getByIndex(IfEntry.class, 1,
					new String[] { "ifDescr" });
			assertNotNull(rtIfEntry.getIfDescr());
			assertTrue(rtIfEntry.getIfInDiscards() == 0);
		} catch (Exception e) {
			e.printStackTrace();
			fail();
		}
	}

	public void testSet() {
		try {
			SystemInfo system = new SystemInfo();
			system.setSysContact("ery.lee@gmail.com");
			system.setSysLocation("hangzhou");
			system.setSysName("erylee");
			session.set(system);
			assertEquals("erylee", system.getSysName());
		} catch (Exception e) {
			e.printStackTrace();
			fail();
		}
	}

	public void testDelete() {
		try {
			CreateDeleteEntry entry = newCreateDeleteEntry();
			session.delete(entry);
		} catch (Exception e) {
			e.printStackTrace();
			fail();
		}
	}

	public void testCreate() {
		try {
			CreateDeleteEntry entry = newCreateDeleteEntry();
			session.create(entry);
		} catch (Exception e) {
			e.printStackTrace();
			fail();
		}
	}

	private CreateDeleteEntry newCreateDeleteEntry() {
		CreateDeleteEntry entry = new CreateDeleteEntry();
		entry.ifIndex = 1;
		entry.ifDescr = "haha";
		return entry;
	}
}
