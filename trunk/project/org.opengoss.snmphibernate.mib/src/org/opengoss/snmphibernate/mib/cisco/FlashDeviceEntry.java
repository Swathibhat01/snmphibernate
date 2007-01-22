package org.opengoss.snmphibernate.mib.cisco;

import java.io.Serializable;

import org.opengoss.snmphibernate.api.SmiType;
import org.opengoss.snmphibernate.api.annotation.MibIndex;
import org.opengoss.snmphibernate.api.annotation.MibObjectType;
import org.opengoss.snmphibernate.api.annotation.MibTable;
import org.opengoss.snmphibernate.api.annotation.MibObjectType.Access;

@SuppressWarnings("serial")
@MibTable
public class FlashDeviceEntry implements Serializable {

	@MibIndex(no = 0, length = 1)
	@MibObjectType(oid = "1.3.6.1.4.1.9.9.10.1.1.2.1.1", smiType = SmiType.UNSIGNED32, access = Access.READ)
	private long ciscoFlashDeviceIndex;

	@MibObjectType(oid = "1.3.6.1.4.1.9.9.10.1.1.2.1.2", smiType = SmiType.UNSIGNED32, access = Access.READ)
	private long ciscoFlashDeviceSize;// - Unsigned32(66 - gauge32)

	@MibObjectType(oid = "1.3.6.1.4.1.9.9.10.1.1.2.1.3", smiType = SmiType.UNSIGNED32, access = Access.READ)
	private long ciscoFlashDeviceMinPartitionSize;// - Unsigned32(66 -

	@MibObjectType(oid = "1.3.6.1.4.1.9.9.10.1.1.2.1.4", smiType = SmiType.UNSIGNED32, access = Access.READ)
	private long ciscoFlashDeviceMaxPartitions;// - Unsigned32(66 - gauge32)

	@MibObjectType(oid = "1.3.6.1.4.1.9.9.10.1.1.2.1.5", smiType = SmiType.UNSIGNED32, access = Access.READ)
	private long ciscoFlashDevicePartitions;// - Unsigned32(66 - gauge32)

	@MibObjectType(oid = "1.3.6.1.4.1.9.9.10.1.1.2.1.6", smiType = SmiType.INTEGER32, access = Access.READ)
	private int ciscoFlashDeviceChipCount;// Integer32(2 - int, int32)

	@MibObjectType(oid = "1.3.6.1.4.1.9.9.10.1.1.2.1.7", smiType = SmiType.DISPLAY_STRING, access = Access.READ)
	private String ciscoFlashDeviceName;// DisplayString(4 - octets)

	@MibObjectType(oid = "1.3.6.1.4.1.9.9.10.1.1.2.1.8", smiType = SmiType.DISPLAY_STRING, access = Access.READ)
	private String ciscoFlashDeviceDescr;// DisplayString(4 - octets)

	@MibObjectType(oid = "1.3.6.1.4.1.9.9.10.1.1.2.1.9", smiType = SmiType.DISPLAY_STRING, access = Access.READ)
	private String ciscoFlashDeviceController;// DisplayString(4 - octets)

	@MibObjectType(oid = "1.3.6.1.4.1.9.9.10.1.1.2.1.11", smiType = SmiType.INTEGER, access = Access.READ)
	private int ciscoFlashDeviceProgrammingJumper;// INTEGER(2 - int, int32)

	@MibObjectType(oid = "1.3.6.1.4.1.9.9.10.1.1.2.1.12", smiType = SmiType.TIMETICKS, access = Access.READ)
	private long ciscoFlashDeviceInitTime;// TimeStamp(67 - timeticks)

	@MibObjectType(oid = "1.3.6.1.4.1.9.9.10.1.1.2.1.13", smiType = SmiType.INTEGER, access = Access.READ)
	private int ciscoFlashDeviceRemovable;// TruthValue(2 - int, int32)

	@MibObjectType(oid = "1.3.6.1.4.1.9.9.10.1.1.2.1.14", smiType = SmiType.INTEGER, access = Access.READ)
	private int ciscoFlashPhyEntIndex;// PhysicalIndex(2 - int, int32)

	@MibObjectType(oid = "1.3.6.1.4.1.9.9.10.1.1.2.1.15", smiType = SmiType.DISPLAY_STRING, access = Access.READ)
	private String ciscoFlashDeviceNameExtended;// DisplayStr

	public int getCiscoFlashDeviceChipCount() {
		return ciscoFlashDeviceChipCount;
	}

	public void setCiscoFlashDeviceChipCount(int ciscoFlashDeviceChipCount) {
		this.ciscoFlashDeviceChipCount = ciscoFlashDeviceChipCount;
	}

	public String getCiscoFlashDeviceController() {
		return ciscoFlashDeviceController;
	}

	public void setCiscoFlashDeviceController(String ciscoFlashDeviceController) {
		this.ciscoFlashDeviceController = ciscoFlashDeviceController;
	}

	public String getCiscoFlashDeviceDescr() {
		return ciscoFlashDeviceDescr;
	}

	public void setCiscoFlashDeviceDescr(String ciscoFlashDeviceDescr) {
		this.ciscoFlashDeviceDescr = ciscoFlashDeviceDescr;
	}

	public long getCiscoFlashDeviceIndex() {
		return ciscoFlashDeviceIndex;
	}

	public void setCiscoFlashDeviceIndex(long ciscoFlashDeviceIndex) {
		this.ciscoFlashDeviceIndex = ciscoFlashDeviceIndex;
	}

	public long getCiscoFlashDeviceInitTime() {
		return ciscoFlashDeviceInitTime;
	}

	public void setCiscoFlashDeviceInitTime(long ciscoFlashDeviceInitTime) {
		this.ciscoFlashDeviceInitTime = ciscoFlashDeviceInitTime;
	}

	public long getCiscoFlashDeviceMaxPartitions() {
		return ciscoFlashDeviceMaxPartitions;
	}

	public void setCiscoFlashDeviceMaxPartitions(
			long ciscoFlashDeviceMaxPartitions) {
		this.ciscoFlashDeviceMaxPartitions = ciscoFlashDeviceMaxPartitions;
	}

	public long getCiscoFlashDeviceMinPartitionSize() {
		return ciscoFlashDeviceMinPartitionSize;
	}

	public void setCiscoFlashDeviceMinPartitionSize(
			long ciscoFlashDeviceMinPartitionSize) {
		this.ciscoFlashDeviceMinPartitionSize = ciscoFlashDeviceMinPartitionSize;
	}

	public String getCiscoFlashDeviceName() {
		return ciscoFlashDeviceName;
	}

	public void setCiscoFlashDeviceName(String ciscoFlashDeviceName) {
		this.ciscoFlashDeviceName = ciscoFlashDeviceName;
	}

	public String getCiscoFlashDeviceNameExtended() {
		return ciscoFlashDeviceNameExtended;
	}

	public void setCiscoFlashDeviceNameExtended(
			String ciscoFlashDeviceNameExtended) {
		this.ciscoFlashDeviceNameExtended = ciscoFlashDeviceNameExtended;
	}

	public long getCiscoFlashDevicePartitions() {
		return ciscoFlashDevicePartitions;
	}

	public void setCiscoFlashDevicePartitions(long ciscoFlashDevicePartitions) {
		this.ciscoFlashDevicePartitions = ciscoFlashDevicePartitions;
	}

	public int getCiscoFlashDeviceProgrammingJumper() {
		return ciscoFlashDeviceProgrammingJumper;
	}

	public void setCiscoFlashDeviceProgrammingJumper(
			int ciscoFlashDeviceProgrammingJumper) {
		this.ciscoFlashDeviceProgrammingJumper = ciscoFlashDeviceProgrammingJumper;
	}

	public int getCiscoFlashDeviceRemovable() {
		return ciscoFlashDeviceRemovable;
	}

	public void setCiscoFlashDeviceRemovable(int ciscoFlashDeviceRemovable) {
		this.ciscoFlashDeviceRemovable = ciscoFlashDeviceRemovable;
	}

	public long getCiscoFlashDeviceSize() {
		return ciscoFlashDeviceSize;
	}

	public void setCiscoFlashDeviceSize(long ciscoFlashDeviceSize) {
		this.ciscoFlashDeviceSize = ciscoFlashDeviceSize;
	}

	public int getCiscoFlashPhyEntIndex() {
		return ciscoFlashPhyEntIndex;
	}

	public void setCiscoFlashPhyEntIndex(int ciscoFlashPhyEntIndex) {
		this.ciscoFlashPhyEntIndex = ciscoFlashPhyEntIndex;
	}
}
