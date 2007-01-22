package org.opengoss.snmphibernate.mib.rfc1213;

import org.opengoss.snmphibernate.mib.MibTest;
import org.opengoss.snmphibernate.mib.rfc1213.TcpInfo;

public class TcpInfoTest extends MibTest {

	public void testGet() throws Exception {
		TcpInfo TcpInfo = (TcpInfo) session.get(TcpInfo.class);
		System.out.println(TcpInfo.getTcpActiveOpens());
	}

}
