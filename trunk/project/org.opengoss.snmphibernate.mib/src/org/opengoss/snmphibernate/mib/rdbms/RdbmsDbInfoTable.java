package org.opengoss.snmphibernate.mib.rdbms;

import java.io.Serializable;

import org.opengoss.snmphibernate.api.SmiType;
import org.opengoss.snmphibernate.api.annotation.MibIndex;
import org.opengoss.snmphibernate.api.annotation.MibObjectType;
import org.opengoss.snmphibernate.api.annotation.MibTable;
import org.opengoss.snmphibernate.api.annotation.MibObjectType.Access;

@SuppressWarnings("serial")
@MibTable
public class RdbmsDbInfoTable implements Serializable {
	@MibIndex(no = 0, length = 1)
	@MibObjectType(oid = "1.3.6.1.2.1.39.1.1.1.1", smiType = SmiType.INTEGER, access = Access.READ)
	private int rdbmsDbIndex;

	@MibObjectType(oid = "1.3.6.1.2.1.39.1.2.1.1", smiType = SmiType.DISPLAY_STRING, access=Access.READ)
	private String rdbmsDbInfoProductName;// - DisplayString(4 - octets)

	@MibObjectType(oid="1.3.6.1.2.1.39.1.2.1.2", smiType=SmiType.DISPLAY_STRING, access=Access.READ)
	private String rdbmsDbInfoVersion;// - DisplayString(4 - octets)

	@MibObjectType(oid="1.3.6.1.2.1.39.1.2.1.3", smiType=SmiType.INTEGER, access= Access.READ)
	private int rdbmsDbInfoSizeUnits;// - INTEGER(2 - integer (32 bit))

	@MibObjectType(oid = "1.3.6.1.2.1.39.1.2.1.4", smiType=SmiType.INTEGER, access = Access.READ)
	private int rdbmsDbInfoSizeAllocated;// - INTEGER(2 - integer (32 bit))

	@MibObjectType(oid = "1.3.6.1.2.1.39.1.2.1.5", smiType=SmiType.INTEGER, access= Access.READ)
	private int rdbmsDbInfoSizeUsed;// - INTEGER(2 - integer (32 bit))

	@MibObjectType(oid = "1.3.6.1.2.1.39.1.2.1.6", smiType=SmiType.OCTET_STRING, access=Access.READ)
	private byte[] rdbmsDbInfoLastBackup;// - DateAndTime(4 - octets)

	public int getRdbmsDbIndex() {
		return rdbmsDbIndex;
	}

	public void setRdbmsDbIndex(int rdbmsDbIndex) {
		this.rdbmsDbIndex = rdbmsDbIndex;
	}

	public byte[] getRdbmsDbInfoLastBackup() {
		return rdbmsDbInfoLastBackup;
	}

	public void setRdbmsDbInfoLastBackup(byte[] rdbmsDbInfoLastBackup) {
		this.rdbmsDbInfoLastBackup = rdbmsDbInfoLastBackup;
	}

	public String getRdbmsDbInfoProductName() {
		return rdbmsDbInfoProductName;
	}

	public void setRdbmsDbInfoProductName(String rdbmsDbInfoProductName) {
		this.rdbmsDbInfoProductName = rdbmsDbInfoProductName;
	}

	public int getRdbmsDbInfoSizeAllocated() {
		return rdbmsDbInfoSizeAllocated;
	}

	public void setRdbmsDbInfoSizeAllocated(int rdbmsDbInfoSizeAllocated) {
		this.rdbmsDbInfoSizeAllocated = rdbmsDbInfoSizeAllocated;
	}

	public int getRdbmsDbInfoSizeUnits() {
		return rdbmsDbInfoSizeUnits;
	}

	public void setRdbmsDbInfoSizeUnits(int rdbmsDbInfoSizeUnits) {
		this.rdbmsDbInfoSizeUnits = rdbmsDbInfoSizeUnits;
	}

	public int getRdbmsDbInfoSizeUsed() {
		return rdbmsDbInfoSizeUsed;
	}

	public void setRdbmsDbInfoSizeUsed(int rdbmsDbInfoSizeUsed) {
		this.rdbmsDbInfoSizeUsed = rdbmsDbInfoSizeUsed;
	}

	public String getRdbmsDbInfoVersion() {
		return rdbmsDbInfoVersion;
	}

	public void setRdbmsDbInfoVersion(String rdbmsDbInfoVersion) {
		this.rdbmsDbInfoVersion = rdbmsDbInfoVersion;
	}

}
