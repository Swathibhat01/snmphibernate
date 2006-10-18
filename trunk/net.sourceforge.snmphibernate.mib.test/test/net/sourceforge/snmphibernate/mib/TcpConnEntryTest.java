package net.sourceforge.snmphibernate.mib;

import java.util.Iterator;
import java.util.List;

import net.sourceforge.snmphibernate.mib.net.TcpConnEntry;

public class TcpConnEntryTest extends MibTest {

	public void testGetTable() throws Exception {
		List list =  session.getTable(TcpConnEntry.class);
		for (Iterator it = list.iterator(); it.hasNext();) {
			TcpConnEntry entry = (TcpConnEntry) it.next();
			java.lang.System.out.println(entry.getTcpConnState());
		}
	}
}
