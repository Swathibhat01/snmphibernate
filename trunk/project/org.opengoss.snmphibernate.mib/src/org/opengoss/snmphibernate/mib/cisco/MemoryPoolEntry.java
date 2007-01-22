package org.opengoss.snmphibernate.mib.cisco;

import java.io.Serializable;

import org.opengoss.snmphibernate.api.SmiType;
import org.opengoss.snmphibernate.api.annotation.MibIndex;
import org.opengoss.snmphibernate.api.annotation.MibObjectType;
import org.opengoss.snmphibernate.api.annotation.MibTable;
import org.opengoss.snmphibernate.api.annotation.MibObjectType.Access;

@SuppressWarnings("serial")
@MibTable
public class MemoryPoolEntry implements Serializable {

	// 1: processor memory
	// 2: i/o memory
	// 3: pci memory
	// 4: fast memory
	// 5: multibus memory
	@MibIndex(no = 0, length = 1)
	@MibObjectType(oid = "1.3.6.1.4.1.9.9.48.1.1.1.1", smiType = SmiType.INTEGER, access = Access.READ)
	private int ciscoMemoryPoolType;// - CiscoMemoryPoolTypes(2 - int, int32)

	@MibObjectType(oid = "1.3.6.1.4.1.9.9.48.1.1.1.2", smiType = SmiType.DISPLAY_STRING, access = Access.READ)
	private String ciscoMemoryPoolName;// - DisplayString(4 - octets)

	@MibObjectType(oid = "1.3.6.1.4.1.9.9.48.1.1.1.3", smiType = SmiType.INTEGER32, access = Access.READ)
	private int ciscoMemoryPoolAlternate;// - Integer32(2 - int, int32)

	@MibObjectType(oid = "1.3.6.1.4.1.9.9.48.1.1.1.4", smiType = SmiType.INTEGER, access = Access.READ)
	private int ciscoMemoryPoolValid;// - TruthValue(2 - int, int32)

	@MibObjectType(oid = "1.3.6.1.4.1.9.9.48.1.1.1.5", smiType = SmiType.GAUGE32, access = Access.READ)
	private long ciscoMemoryPoolUsed;// - Gauge32(66 - gauge32)

	@MibObjectType(oid = "1.3.6.1.4.1.9.9.48.1.1.1.6", smiType = SmiType.GAUGE32, access = Access.READ)
	private long ciscoMemoryPoolFree;// - Gauge32(66 - gauge32)

	@MibObjectType(oid = "1.3.6.1.4.1.9.9.48.1.1.1.7", smiType = SmiType.GAUGE32, access = Access.READ)
	private long ciscoMemoryPoolLargestFree;// - Gauge32(66 - gauge32)

	public int getCiscoMemoryPoolAlternate() {
		return ciscoMemoryPoolAlternate;
	}

	public void setCiscoMemoryPoolAlternate(int ciscoMemoryPoolAlternate) {
		this.ciscoMemoryPoolAlternate = ciscoMemoryPoolAlternate;
	}

	public long getCiscoMemoryPoolFree() {
		return ciscoMemoryPoolFree;
	}

	public void setCiscoMemoryPoolFree(long ciscoMemoryPoolFree) {
		this.ciscoMemoryPoolFree = ciscoMemoryPoolFree;
	}

	public long getCiscoMemoryPoolLargestFree() {
		return ciscoMemoryPoolLargestFree;
	}

	public void setCiscoMemoryPoolLargestFree(long ciscoMemoryPoolLargestFree) {
		this.ciscoMemoryPoolLargestFree = ciscoMemoryPoolLargestFree;
	}

	public String getCiscoMemoryPoolName() {
		return ciscoMemoryPoolName;
	}

	public void setCiscoMemoryPoolName(String ciscoMemoryPoolName) {
		this.ciscoMemoryPoolName = ciscoMemoryPoolName;
	}

	public int getCiscoMemoryPoolType() {
		return ciscoMemoryPoolType;
	}

	public void setCiscoMemoryPoolType(int ciscoMemoryPoolType) {
		this.ciscoMemoryPoolType = ciscoMemoryPoolType;
	}

	public long getCiscoMemoryPoolUsed() {
		return ciscoMemoryPoolUsed;
	}

	public void setCiscoMemoryPoolUsed(long ciscoMemoryPoolUsed) {
		this.ciscoMemoryPoolUsed = ciscoMemoryPoolUsed;
	}

	public int getCiscoMemoryPoolValid() {
		return ciscoMemoryPoolValid;
	}

	public void setCiscoMemoryPoolValid(int ciscoMemoryPoolValid) {
		this.ciscoMemoryPoolValid = ciscoMemoryPoolValid;
	}

}
