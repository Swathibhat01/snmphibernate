package org.opengoss.snmphibernate.mib.rfc1213;

import org.opengoss.snmphibernate.mib.MibTest;
import org.opengoss.snmphibernate.mib.rfc1213.IpInfo;

public class IpInfoTest extends MibTest {

	public void testGet() throws Exception {
		IpInfo ipInfo = (IpInfo)session.get(IpInfo.class);
		java.lang.System.out.println(ipInfo.getIpForwarding());
	}
}
