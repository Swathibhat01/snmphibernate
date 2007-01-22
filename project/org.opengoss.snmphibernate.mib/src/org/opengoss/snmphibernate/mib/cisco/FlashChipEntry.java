package org.opengoss.snmphibernate.mib.cisco;

import java.io.Serializable;

import org.opengoss.snmphibernate.api.SmiType;
import org.opengoss.snmphibernate.api.annotation.MibIndex;
import org.opengoss.snmphibernate.api.annotation.MibObjectType;
import org.opengoss.snmphibernate.api.annotation.MibTable;
import org.opengoss.snmphibernate.api.annotation.MibObjectType.Access;

@SuppressWarnings("serial")
@MibTable
public class FlashChipEntry implements Serializable {
	@MibIndex(no = 0, length = 1)
	@MibObjectType(oid = "1.3.6.1.4.1.9.9.10.1.1.2.1.1", smiType = SmiType.UNSIGNED32, access = Access.READ)
	private long ciscoFlashDeviceIndex;

	@MibIndex(no = 1, length = 1)
	@MibObjectType(oid = "1.3.6.1.4.1.9.9.10.1.1.3.1.1.1", smiType = SmiType.INTEGER32, access = Access.READ)
	private int ciscoFlashChipIndex;// - Integer32(2 - int, int32)

	@MibObjectType(oid = "1.3.6.1.4.1.9.9.10.1.1.3.1.1.2", smiType = SmiType.DISPLAY_STRING, access = Access.READ)
	private String ciscoFlashChipCode;// - DisplayString(4 - octets)

	@MibObjectType(oid = "1.3.6.1.4.1.9.9.10.1.1.3.1.1.3", smiType = SmiType.DISPLAY_STRING, access = Access.READ)
	private String ciscoFlashChipDescr;// - DisplayString(4 - octets)

	@MibObjectType(oid = "1.3.6.1.4.1.9.9.10.1.1.3.1.1.4", smiType = SmiType.COUNTER32, access = Access.READ)
	private long ciscoFlashChipWriteRetries;// - Counter32(65 - cntr32)

	@MibObjectType(oid = "1.3.6.1.4.1.9.9.10.1.1.3.1.1.5", smiType = SmiType.COUNTER32, access = Access.READ)
	private long ciscoFlashChipEraseRetries;// - Counter32(65 - cntr32)

	@MibObjectType(oid = "1.3.6.1.4.1.9.9.10.1.1.3.1.1.6", smiType = SmiType.UNSIGNED32, access = Access.READ)
	private long ciscoFlashChipMaxWriteRetries;// - Unsigned32(66 - gauge32)

	@MibObjectType(oid = "1.3.6.1.4.1.9.9.10.1.1.3.1.1.7", smiType = SmiType.UNSIGNED32, access = Access.READ)
	private long ciscoFlashChipMaxEraseRetries;// - Unsigned32(66 - gauge32)

	public String getCiscoFlashChipCode() {
		return ciscoFlashChipCode;
	}

	public void setCiscoFlashChipCode(String ciscoFlashChipCode) {
		this.ciscoFlashChipCode = ciscoFlashChipCode;
	}

	public String getCiscoFlashChipDescr() {
		return ciscoFlashChipDescr;
	}

	public void setCiscoFlashChipDescr(String ciscoFlashChipDescr) {
		this.ciscoFlashChipDescr = ciscoFlashChipDescr;
	}

	public long getCiscoFlashChipEraseRetries() {
		return ciscoFlashChipEraseRetries;
	}

	public void setCiscoFlashChipEraseRetries(long ciscoFlashChipEraseRetries) {
		this.ciscoFlashChipEraseRetries = ciscoFlashChipEraseRetries;
	}

	public int getCiscoFlashChipIndex() {
		return ciscoFlashChipIndex;
	}

	public void setCiscoFlashChipIndex(int ciscoFlashChipIndex) {
		this.ciscoFlashChipIndex = ciscoFlashChipIndex;
	}

	public long getCiscoFlashChipMaxEraseRetries() {
		return ciscoFlashChipMaxEraseRetries;
	}

	public void setCiscoFlashChipMaxEraseRetries(
			long ciscoFlashChipMaxEraseRetries) {
		this.ciscoFlashChipMaxEraseRetries = ciscoFlashChipMaxEraseRetries;
	}

	public long getCiscoFlashChipMaxWriteRetries() {
		return ciscoFlashChipMaxWriteRetries;
	}

	public void setCiscoFlashChipMaxWriteRetries(
			long ciscoFlashChipMaxWriteRetries) {
		this.ciscoFlashChipMaxWriteRetries = ciscoFlashChipMaxWriteRetries;
	}

	public long getCiscoFlashChipWriteRetries() {
		return ciscoFlashChipWriteRetries;
	}

	public void setCiscoFlashChipWriteRetries(long ciscoFlashChipWriteRetries) {
		this.ciscoFlashChipWriteRetries = ciscoFlashChipWriteRetries;
	}

	public long getCiscoFlashDeviceIndex() {
		return ciscoFlashDeviceIndex;
	}

	public void setCiscoFlashDeviceIndex(long ciscoFlashDeviceIndex) {
		this.ciscoFlashDeviceIndex = ciscoFlashDeviceIndex;
	}

}
