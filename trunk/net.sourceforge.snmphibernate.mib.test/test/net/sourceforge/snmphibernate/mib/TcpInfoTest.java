package net.sourceforge.snmphibernate.mib;

import net.sourceforge.snmphibernate.mib.net.TcpInfo;

public class TcpInfoTest extends MibTest {

	public void testGet() throws Exception {
		TcpInfo TcpInfo = (TcpInfo) session.get(TcpInfo.class);
		java.lang.System.out.println(TcpInfo.getTcpActiveOpens());
	}

}
