package org.opengoss.snmphibernate.mib.cisco;

import java.io.Serializable;

import org.opengoss.snmphibernate.api.SmiType;
import org.opengoss.snmphibernate.api.annotation.MibIndex;
import org.opengoss.snmphibernate.api.annotation.MibObjectType;
import org.opengoss.snmphibernate.api.annotation.MibTable;
import org.opengoss.snmphibernate.api.annotation.MibObjectType.Access;

@SuppressWarnings("serial")
@MibTable
public class MemoryPoolUtilizationEntry implements Serializable {

	@MibIndex(no = 0, length = 1)
	@MibObjectType(oid = "1.3.6.1.4.1.9.9.48.1.1.1.1", smiType = SmiType.INTEGER, access = Access.READ)
	private int ciscoMemoryPoolType;// - CiscoMemoryPoolTypes(2 - int, int32)

	@MibObjectType(oid = "1.3.6.1.4.1.9.9.48.1.2.1.1", smiType = SmiType.INTEGER, access = Access.READ)
	private int ciscoMemoryPoolUtilization1Min;// - Percent(2 - int, int32)

	@MibObjectType(oid = "1.3.6.1.4.1.9.9.48.1.2.1.2", smiType = SmiType.INTEGER, access = Access.READ)
	private int ciscoMemoryPoolUtilization5Min;// - Percent(2 - int, int32)

	@MibObjectType(oid = "1.3.6.1.4.1.9.9.48.1.2.1.3", smiType = SmiType.INTEGER, access = Access.READ)
	private int ciscoMemoryPoolUtilization10Min;// - Perce

	public int getCiscoMemoryPoolType() {
		return ciscoMemoryPoolType;
	}

	public void setCiscoMemoryPoolType(int ciscoMemoryPoolType) {
		this.ciscoMemoryPoolType = ciscoMemoryPoolType;
	}

	public int getCiscoMemoryPoolUtilization10Min() {
		return ciscoMemoryPoolUtilization10Min;
	}

	public void setCiscoMemoryPoolUtilization10Min(
			int ciscoMemoryPoolUtilization10Min) {
		this.ciscoMemoryPoolUtilization10Min = ciscoMemoryPoolUtilization10Min;
	}

	public int getCiscoMemoryPoolUtilization1Min() {
		return ciscoMemoryPoolUtilization1Min;
	}

	public void setCiscoMemoryPoolUtilization1Min(
			int ciscoMemoryPoolUtilization1Min) {
		this.ciscoMemoryPoolUtilization1Min = ciscoMemoryPoolUtilization1Min;
	}

	public int getCiscoMemoryPoolUtilization5Min() {
		return ciscoMemoryPoolUtilization5Min;
	}

	public void setCiscoMemoryPoolUtilization5Min(
			int ciscoMemoryPoolUtilization5Min) {
		this.ciscoMemoryPoolUtilization5Min = ciscoMemoryPoolUtilization5Min;
	}
}
