package org.opengoss.snmphibernate.mib.rdbms;

import java.io.Serializable;

import org.opengoss.snmphibernate.api.SmiType;
import org.opengoss.snmphibernate.api.annotation.MibIndex;
import org.opengoss.snmphibernate.api.annotation.MibObjectType;
import org.opengoss.snmphibernate.api.annotation.MibTable;
import org.opengoss.snmphibernate.api.annotation.MibObjectType.Access;

@SuppressWarnings("serial")
@MibTable
public class OraDbDataFileEntry implements Serializable {

	@MibIndex(no = 0, length = 1)
	@MibObjectType(oid = "1.3.6.1.2.1.39.1.1.1.1", smiType = SmiType.INTEGER, access = Access.READ)
	private int rdbmsDbIndex;

	@MibIndex(no = 1, length = 1)
	@MibObjectType(oid = "1.3.6.1.4.1.111.4.1.3.1.1", smiType = SmiType.INTEGER, access = Access.READ)
	private int oraDbDataFileIndex;// - INTEGER(2 - integer (32 bit))

	@MibObjectType(oid = "1.3.6.1.4.1.111.4.1.3.1.2", smiType = SmiType.DISPLAY_STRING, access = Access.READ)
	private String oraDbDataFileName;// - DisplayString(4 - octets)

	@MibObjectType(oid = "1.3.6.1.4.1.111.4.1.3.1.3", smiType = SmiType.INTEGER, access = Access.READ)
	private int oraDbDataFileSizeAllocated;// - INTEGER(2 - integer (32 bit))

	@MibObjectType(oid = "1.3.6.1.4.1.111.4.1.3.1.4", smiType = SmiType.COUNTER32, access = Access.READ)
	private long oraDbDataFileDiskReads;// - Counter(65 - counter (32 bit))

	@MibObjectType(oid = "1.3.6.1.4.1.111.4.1.3.1.5", smiType = SmiType.COUNTER32, access = Access.READ)
	private long oraDbDataFileDiskWrites;// - Counter(65 - counter (32 bit))

	@MibObjectType(oid = "1.3.6.1.4.1.111.4.1.3.1.6", smiType = SmiType.COUNTER32, access = Access.READ)
	private long oraDbDataFileDiskReadBlocks;// - Counter(65 - counter (32

	// bit))
	@MibObjectType(oid = "1.3.6.1.4.1.111.4.1.3.1.7", smiType = SmiType.COUNTER32, access = Access.READ)
	private long oraDbDataFileDiskWrittenBlocks;// - Counter(65 - counter (32

	// bit))
	@MibObjectType(oid = "1.3.6.1.4.1.111.4.1.3.1.8", smiType = SmiType.COUNTER32, access = Access.READ)
	private long oraDbDataFileDiskReadTimeTicks;// - Counter(65 - counter (32

	// bit))
	@MibObjectType(oid = "1.3.6.1.4.1.111.4.1.3.1.9", smiType = SmiType.COUNTER32, access = Access.READ)
	private long oraDbDataFileDiskWriteTimeTicks;// - Counter(65 - counter
	// (32 bit))

	public long getOraDbDataFileDiskReadBlocks() {
		return oraDbDataFileDiskReadBlocks;
	}

	public void setOraDbDataFileDiskReadBlocks(long oraDbDataFileDiskReadBlocks) {
		this.oraDbDataFileDiskReadBlocks = oraDbDataFileDiskReadBlocks;
	}

	public long getOraDbDataFileDiskReads() {
		return oraDbDataFileDiskReads;
	}

	public void setOraDbDataFileDiskReads(long oraDbDataFileDiskReads) {
		this.oraDbDataFileDiskReads = oraDbDataFileDiskReads;
	}

	public long getOraDbDataFileDiskReadTimeTicks() {
		return oraDbDataFileDiskReadTimeTicks;
	}

	public void setOraDbDataFileDiskReadTimeTicks(
			long oraDbDataFileDiskReadTimeTicks) {
		this.oraDbDataFileDiskReadTimeTicks = oraDbDataFileDiskReadTimeTicks;
	}

	public long getOraDbDataFileDiskWrites() {
		return oraDbDataFileDiskWrites;
	}

	public void setOraDbDataFileDiskWrites(long oraDbDataFileDiskWrites) {
		this.oraDbDataFileDiskWrites = oraDbDataFileDiskWrites;
	}

	public long getOraDbDataFileDiskWriteTimeTicks() {
		return oraDbDataFileDiskWriteTimeTicks;
	}

	public void setOraDbDataFileDiskWriteTimeTicks(
			long oraDbDataFileDiskWriteTimeTicks) {
		this.oraDbDataFileDiskWriteTimeTicks = oraDbDataFileDiskWriteTimeTicks;
	}

	public long getOraDbDataFileDiskWrittenBlocks() {
		return oraDbDataFileDiskWrittenBlocks;
	}

	public void setOraDbDataFileDiskWrittenBlocks(
			long oraDbDataFileDiskWrittenBlocks) {
		this.oraDbDataFileDiskWrittenBlocks = oraDbDataFileDiskWrittenBlocks;
	}

	public int getOraDbDataFileIndex() {
		return oraDbDataFileIndex;
	}

	public void setOraDbDataFileIndex(int oraDbDataFileIndex) {
		this.oraDbDataFileIndex = oraDbDataFileIndex;
	}

	public String getOraDbDataFileName() {
		return oraDbDataFileName;
	}

	public void setOraDbDataFileName(String oraDbDataFileName) {
		this.oraDbDataFileName = oraDbDataFileName;
	}

	public int getOraDbDataFileSizeAllocated() {
		return oraDbDataFileSizeAllocated;
	}

	public void setOraDbDataFileSizeAllocated(int oraDbDataFileSizeAllocated) {
		this.oraDbDataFileSizeAllocated = oraDbDataFileSizeAllocated;
	}

	public int getRdbmsDbIndex() {
		return rdbmsDbIndex;
	}

	public void setRdbmsDbIndex(int rdbmsDbIndex) {
		this.rdbmsDbIndex = rdbmsDbIndex;
	}

}
