package org.opengoss.snmphibernate.mib.rfc1213;

import java.util.List;

import org.opengoss.snmphibernate.mib.MibTest;
import org.opengoss.snmphibernate.mib.rfc1213.TcpConnEntry;

public class TcpConnEntryTest extends MibTest {

	public void testGetTable() throws Exception {
		List<TcpConnEntry> list =  session.getTable(TcpConnEntry.class);
		for (TcpConnEntry tcpConnEntry : list) {
			System.out.println(tcpConnEntry.getTcpConnState());
		}
	}
}
