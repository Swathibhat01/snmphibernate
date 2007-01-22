package org.opengoss.snmphibernate.mib.cisco;

import java.io.Serializable;

import org.opengoss.snmphibernate.api.SmiType;
import org.opengoss.snmphibernate.api.annotation.MibIndex;
import org.opengoss.snmphibernate.api.annotation.MibObjectType;
import org.opengoss.snmphibernate.api.annotation.MibTable;
import org.opengoss.snmphibernate.api.annotation.MibObjectType.Access;

@SuppressWarnings("serial")
@MibTable
public class FlashPartitionEntry implements Serializable {
	@MibIndex(no = 0, length = 1)
	@MibObjectType(oid = "1.3.6.1.4.1.9.9.10.1.1.2.1.1", smiType = SmiType.UNSIGNED32, access = Access.READ)
	private long ciscoFlashDeviceIndex;

	@MibIndex(no = 1, length = 2)
	@MibObjectType(oid = "1.3.6.1.4.1.9.9.10.1.1.4.1.1.1", smiType = SmiType.UNSIGNED32, access = Access.READ)
	private long ciscoFlashPartitionIndex;

	@MibObjectType(oid = "1.3.6.1.4.1.9.9.10.1.1.4.1.1.2", smiType = SmiType.INTEGER, access = Access.READ)
	private int ciscoFlashPartitionStartChip;// - Integer32(2 - int, int32)

	@MibObjectType(oid = "1.3.6.1.4.1.9.9.10.1.1.4.1.1.3", smiType = SmiType.INTEGER, access = Access.READ)
	private int ciscoFlashPartitionEndChip;// - Integer32(2 - int, int32)

	@MibObjectType(oid = "1.3.6.1.4.1.9.9.10.1.1.4.1.1.4", smiType = SmiType.UNSIGNED32, access = Access.READ)
	private long ciscoFlashPartitionSize;// - Unsigned32(66 - gauge32)

	@MibObjectType(oid = "1.3.6.1.4.1.9.9.10.1.1.4.1.1.5", smiType = SmiType.GAUGE32, access = Access.READ)
	private long ciscoFlashPartitionFreeSpace;// - Gauge32(66 - gauge32)

	@MibObjectType(oid = "1.3.6.1.4.1.9.9.10.1.1.4.1.1.6", smiType = SmiType.GAUGE32, access = Access.READ)
	private long ciscoFlashPartitionFileCount;// - Gauge32(66 - gauge32)
	// 1: simpleChecksum(1)
	// 2: undefined(2)
	// 3: simpleCRC(3)

	@MibObjectType(oid = "1.3.6.1.4.1.9.9.10.1.1.4.1.1.7", smiType = SmiType.INTEGER, access = Access.READ)
	private int ciscoFlashPartitionChecksumAlgorithm;// - INTEGER(2 - int,
														// int32)

	// 1: readOnly(1)
	// 2: runFromFlash(2)
	// 3: readWrite(3)
	@MibObjectType(oid = "1.3.6.1.4.1.9.9.10.1.1.4.1.1.8", smiType = SmiType.INTEGER, access = Access.READ)
	private int ciscoFlashPartitionStatus;// - INTEGER(2 - int, int32)

	@MibObjectType(oid = "1.3.6.1.4.1.9.9.10.1.1.4.1.1.9", smiType = SmiType.INTEGER, access = Access.READ)
	private int ciscoFlashPartitionUpgradeMethod;// - INTEGER(2 - int, int32)

	@MibObjectType(oid = "1.3.6.1.4.1.9.9.10.1.1.4.1.1.10", smiType = SmiType.DISPLAY_STRING, access = Access.READ)
	private String ciscoFlashPartitionName;// - DisplayString(4 - octets)

	@MibObjectType(oid = "1.3.6.1.4.1.9.9.10.1.1.4.1.1.11", smiType = SmiType.INTEGER, access = Access.READ)
	private int ciscoFlashPartitionNeedErasure;// - TruthValue(2 - int, int32)

	@MibObjectType(oid = "1.3.6.1.4.1.9.9.10.1.1.4.1.1.12", smiType = SmiType.INTEGER, access = Access.READ)
	private int ciscoFlashPartitionFileNameLength;// - Integer32(2

	public long getCiscoFlashDeviceIndex() {
		return ciscoFlashDeviceIndex;
	}

	public void setCiscoFlashDeviceIndex(long ciscoFlashDeviceIndex) {
		this.ciscoFlashDeviceIndex = ciscoFlashDeviceIndex;
	}

	public int getCiscoFlashPartitionChecksumAlgorithm() {
		return ciscoFlashPartitionChecksumAlgorithm;
	}

	public void setCiscoFlashPartitionChecksumAlgorithm(
			int ciscoFlashPartitionChecksumAlgorithm) {
		this.ciscoFlashPartitionChecksumAlgorithm = ciscoFlashPartitionChecksumAlgorithm;
	}

	public int getCiscoFlashPartitionEndChip() {
		return ciscoFlashPartitionEndChip;
	}

	public void setCiscoFlashPartitionEndChip(int ciscoFlashPartitionEndChip) {
		this.ciscoFlashPartitionEndChip = ciscoFlashPartitionEndChip;
	}

	public long getCiscoFlashPartitionFileCount() {
		return ciscoFlashPartitionFileCount;
	}

	public void setCiscoFlashPartitionFileCount(
			long ciscoFlashPartitionFileCount) {
		this.ciscoFlashPartitionFileCount = ciscoFlashPartitionFileCount;
	}

	public int getCiscoFlashPartitionFileNameLength() {
		return ciscoFlashPartitionFileNameLength;
	}

	public void setCiscoFlashPartitionFileNameLength(
			int ciscoFlashPartitionFileNameLength) {
		this.ciscoFlashPartitionFileNameLength = ciscoFlashPartitionFileNameLength;
	}

	public long getCiscoFlashPartitionFreeSpace() {
		return ciscoFlashPartitionFreeSpace;
	}

	public void setCiscoFlashPartitionFreeSpace(
			long ciscoFlashPartitionFreeSpace) {
		this.ciscoFlashPartitionFreeSpace = ciscoFlashPartitionFreeSpace;
	}

	public long getCiscoFlashPartitionIndex() {
		return ciscoFlashPartitionIndex;
	}

	public void setCiscoFlashPartitionIndex(long ciscoFlashPartitionIndex) {
		this.ciscoFlashPartitionIndex = ciscoFlashPartitionIndex;
	}

	public String getCiscoFlashPartitionName() {
		return ciscoFlashPartitionName;
	}

	public void setCiscoFlashPartitionName(String ciscoFlashPartitionName) {
		this.ciscoFlashPartitionName = ciscoFlashPartitionName;
	}

	public int getCiscoFlashPartitionNeedErasure() {
		return ciscoFlashPartitionNeedErasure;
	}

	public void setCiscoFlashPartitionNeedErasure(
			int ciscoFlashPartitionNeedErasure) {
		this.ciscoFlashPartitionNeedErasure = ciscoFlashPartitionNeedErasure;
	}

	public long getCiscoFlashPartitionSize() {
		return ciscoFlashPartitionSize;
	}

	public void setCiscoFlashPartitionSize(long ciscoFlashPartitionSize) {
		this.ciscoFlashPartitionSize = ciscoFlashPartitionSize;
	}

	public int getCiscoFlashPartitionStartChip() {
		return ciscoFlashPartitionStartChip;
	}

	public void setCiscoFlashPartitionStartChip(int ciscoFlashPartitionStartChip) {
		this.ciscoFlashPartitionStartChip = ciscoFlashPartitionStartChip;
	}

	public int getCiscoFlashPartitionStatus() {
		return ciscoFlashPartitionStatus;
	}

	public void setCiscoFlashPartitionStatus(int ciscoFlashPartitionStatus) {
		this.ciscoFlashPartitionStatus = ciscoFlashPartitionStatus;
	}

	public int getCiscoFlashPartitionUpgradeMethod() {
		return ciscoFlashPartitionUpgradeMethod;
	}

	public void setCiscoFlashPartitionUpgradeMethod(
			int ciscoFlashPartitionUpgradeMethod) {
		this.ciscoFlashPartitionUpgradeMethod = ciscoFlashPartitionUpgradeMethod;
	}
}
