package net.sourceforge.snmphibernate.mib;

import net.sourceforge.snmphibernate.mib.net.UdpInfo;

public class UdpInfoTest extends MibTest {

	public void testGet() throws Exception {
		UdpInfo udpMIB = (UdpInfo)session.get(UdpInfo.class);
		java.lang.System.out.println(udpMIB.getUdpInDatagrams());
	}
}
