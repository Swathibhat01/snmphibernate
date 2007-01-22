package org.opengoss.snmphibernate.mib.rfc1213;

import org.opengoss.snmphibernate.mib.MibTest;
import org.opengoss.snmphibernate.mib.rfc1213.IcmpInfo;

public class IcmpInfoTest extends MibTest {

	public void testGet() throws Exception {
		session.get(IcmpInfo.class);
	}
	
}
