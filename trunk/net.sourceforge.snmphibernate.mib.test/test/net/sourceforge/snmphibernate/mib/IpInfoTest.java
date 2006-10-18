package net.sourceforge.snmphibernate.mib;

import net.sourceforge.snmphibernate.mib.net.IpInfo;

public class IpInfoTest extends MibTest {

	public void testGet() throws Exception {
		IpInfo ipInfo = (IpInfo)session.get(IpInfo.class);
		java.lang.System.out.println(ipInfo.getIpForwarding());
	}
}
