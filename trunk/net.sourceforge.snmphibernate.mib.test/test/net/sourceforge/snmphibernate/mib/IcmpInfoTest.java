package net.sourceforge.snmphibernate.mib;

import net.sourceforge.snmphibernate.mib.net.IcmpInfo;

public class IcmpInfoTest extends MibTest {

	public void testGet() throws Exception {
		session.get(IcmpInfo.class);
	}
	
}
