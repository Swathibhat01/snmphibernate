package org.opengoss.snmphibernate.mib.rfc1213;

import org.opengoss.snmphibernate.mib.MibTest;
import org.opengoss.snmphibernate.mib.rfc1213.UdpInfo;

public class UdpInfoTest extends MibTest {

	public void testGet() throws Exception {
		UdpInfo udpMIB = (UdpInfo)session.get(UdpInfo.class);
		System.out.println(udpMIB.getUdpInDatagrams());
	}
}
