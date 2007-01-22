package org.opengoss.snmphibernate.mib.sun;

import java.util.List;

import org.opengoss.snmphibernate.mib.MibTest;
import org.opengoss.snmphibernate.mib.sun.SunProcess;


public class SunProcessTest extends MibTest {

	public void testSunProcess() {
		try {
			List<SunProcess> list = session.getTable(SunProcess.class);
			assertTrue(list.size() > 0);
		} catch (Exception e) {
			e.printStackTrace();
			fail();
		}

	}

}
