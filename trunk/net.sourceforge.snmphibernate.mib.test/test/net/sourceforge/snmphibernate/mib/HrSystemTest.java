package net.sourceforge.snmphibernate.mib;

import net.sourceforge.snmphibernate.mib.host.HrSystemInfo;

public class HrSystemTest extends MibTest {

	public void testGet() throws Exception {
		session.get(HrSystemInfo.class);
	}
}
