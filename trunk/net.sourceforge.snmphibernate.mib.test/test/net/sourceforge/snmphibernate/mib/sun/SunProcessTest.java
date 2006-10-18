package net.sourceforge.snmphibernate.mib.sun;

import java.util.List;

import net.sourceforge.snmphibernate.mib.MibTest;
import net.sourceforge.snmphibernate.mib.sun.SunProcess;

public class SunProcessTest extends MibTest {

	public void testSunProcess() {
		try {
			List list = session.getTable(SunProcess.class);
			assertTrue(list.size() > 0);
		} catch (Exception e) {
			e.printStackTrace();
			fail();
		}

	}

}
