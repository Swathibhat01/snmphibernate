package org.opengoss.snmphibernate.mib.host;

import org.opengoss.snmphibernate.mib.MibTest;
import org.opengoss.snmphibernate.mib.host.HrSystemInfo;

public class HrSystemTest extends MibTest {

	public void testGet() throws Exception {
		session.get(HrSystemInfo.class);
	}
}
