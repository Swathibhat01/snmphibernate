package org.opengoss.snmphibernate.mib.cisco;

import java.io.Serializable;

import org.opengoss.snmphibernate.api.SmiType;
import org.opengoss.snmphibernate.api.annotation.MibIndex;
import org.opengoss.snmphibernate.api.annotation.MibObjectType;
import org.opengoss.snmphibernate.api.annotation.MibTable;
import org.opengoss.snmphibernate.api.annotation.MibObjectType.Access;

@SuppressWarnings("serial")
@MibTable
public class FlashFileEntry implements Serializable {
	
	@MibIndex(no = 0, length = 1)
	@MibObjectType(oid = "1.3.6.1.4.1.9.9.10.1.1.2.1.1", smiType = SmiType.UNSIGNED32, access = Access.READ)
	private long ciscoFlashDeviceIndex;

	@MibIndex(no = 1, length = 2)
	@MibObjectType(oid = "1.3.6.1.4.1.9.9.10.1.1.4.1.1.1", smiType = SmiType.UNSIGNED32, access = Access.READ)
	private long ciscoFlashPartitionIndex;

	@MibIndex(no = 2, length = 3)
	@MibObjectType(oid = "1.3.6.1.4.1.9.9.10.1.1.4.2.1.1.1", smiType = SmiType.UNSIGNED32, access = Access.READ)
	private long ciscoFlashFileIndex;// - Unsigned32(66 - gauge32)

	@MibObjectType(oid = "1.3.6.1.4.1.9.9.10.1.1.4.2.1.1.2", smiType = SmiType.UNSIGNED32, access = Access.READ)
	private long ciscoFlashFileSize;// - Unsigned32(66 - gauge32)

	@MibObjectType(oid = "1.3.6.1.4.1.9.9.10.1.1.4.2.1.1.3", smiType = SmiType.OCTET_STRING, access = Access.READ)
	private byte[] ciscoFlashFileChecksum;// - ChecksumString(4 - octets)

	@MibObjectType(oid = "1.3.6.1.4.1.9.9.10.1.1.4.2.1.1.4", smiType = SmiType.INTEGER, access = Access.READ)
	private int ciscoFlashFileStatus;// - INTEGER(2 - int, int32)

	@MibObjectType(oid = "1.3.6.1.4.1.9.9.10.1.1.4.2.1.1.5", smiType = SmiType.DISPLAY_STRING, access = Access.READ)
	private String ciscoFlashFileName;// - DisplayString(4 - octets)

	@MibObjectType(oid = "1.3.6.1.4.1.9.9.10.1.1.4.2.1.1.6", smiType = SmiType.INTEGER, access = Access.READ)
	private int ciscoFlashFileType;// - FlashFileType(2 - int, int32)

	@MibObjectType(oid = "1.3.6.1.4.1.9.9.10.1.1.4.2.1.1.7", smiType = SmiType.OCTET_STRING, access = Access.READ)
	private byte[] ciscoFlashFileDate;// - DateAndTime(4 - octets)

	public long getCiscoFlashDeviceIndex() {
		return ciscoFlashDeviceIndex;
	}

	public void setCiscoFlashDeviceIndex(long ciscoFlashDeviceIndex) {
		this.ciscoFlashDeviceIndex = ciscoFlashDeviceIndex;
	}

	public byte[] getCiscoFlashFileChecksum() {
		return ciscoFlashFileChecksum;
	}

	public void setCiscoFlashFileChecksum(byte[] ciscoFlashFileChecksum) {
		this.ciscoFlashFileChecksum = ciscoFlashFileChecksum;
	}

	public byte[] getCiscoFlashFileDate() {
		return ciscoFlashFileDate;
	}

	public void setCiscoFlashFileDate(byte[] ciscoFlashFileDate) {
		this.ciscoFlashFileDate = ciscoFlashFileDate;
	}

	public long getCiscoFlashFileIndex() {
		return ciscoFlashFileIndex;
	}

	public void setCiscoFlashFileIndex(long ciscoFlashFileIndex) {
		this.ciscoFlashFileIndex = ciscoFlashFileIndex;
	}

	public String getCiscoFlashFileName() {
		return ciscoFlashFileName;
	}

	public void setCiscoFlashFileName(String ciscoFlashFileName) {
		this.ciscoFlashFileName = ciscoFlashFileName;
	}

	public long getCiscoFlashFileSize() {
		return ciscoFlashFileSize;
	}

	public void setCiscoFlashFileSize(long ciscoFlashFileSize) {
		this.ciscoFlashFileSize = ciscoFlashFileSize;
	}

	public int getCiscoFlashFileStatus() {
		return ciscoFlashFileStatus;
	}

	public void setCiscoFlashFileStatus(int ciscoFlashFileStatus) {
		this.ciscoFlashFileStatus = ciscoFlashFileStatus;
	}

	public int getCiscoFlashFileType() {
		return ciscoFlashFileType;
	}

	public void setCiscoFlashFileType(int ciscoFlashFileType) {
		this.ciscoFlashFileType = ciscoFlashFileType;
	}

	public long getCiscoFlashPartitionIndex() {
		return ciscoFlashPartitionIndex;
	}

	public void setCiscoFlashPartitionIndex(long ciscoFlashPartitionIndex) {
		this.ciscoFlashPartitionIndex = ciscoFlashPartitionIndex;
	}

}
