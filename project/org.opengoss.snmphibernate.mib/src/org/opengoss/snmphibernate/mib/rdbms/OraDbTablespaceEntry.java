package org.opengoss.snmphibernate.mib.rdbms;

import java.io.Serializable;

import org.opengoss.snmphibernate.api.SmiType;
import org.opengoss.snmphibernate.api.annotation.MibIndex;
import org.opengoss.snmphibernate.api.annotation.MibObjectType;
import org.opengoss.snmphibernate.api.annotation.MibTable;
import org.opengoss.snmphibernate.api.annotation.MibObjectType.Access;

@SuppressWarnings("serial")
@MibTable
public class OraDbTablespaceEntry implements Serializable {
	@MibIndex(no = 0, length = 1)
	@MibObjectType(oid = "1.3.6.1.2.1.39.1.1.1.1", smiType = SmiType.INTEGER, access = Access.READ)
	private int rdbmsDbIndex;

	@MibIndex(no = 1, length = 1)
	@MibObjectType(oid = "1.3.6.1.4.1.111.4.1.2.1.1", smiType = SmiType.INTEGER, access = Access.READ)
	private int oraDbTablespaceIndex;// - INTEGER(2 - integer (32 bit))

	@MibObjectType(oid = "1.3.6.1.4.1.111.4.1.2.1.2", smiType = SmiType.DISPLAY_STRING, access = Access.READ)
	private String oraDbTablespaceName;// - DisplayString(4 - octets)

	@MibObjectType(oid = "1.3.6.1.4.1.111.4.1.2.1.3", smiType = SmiType.INTEGER, access = Access.READ)
	private int oraDbTablespaceSizeAllocated;// - INTEGER(2 - integer (32
												// bit))

	@MibObjectType(oid = "1.3.6.1.4.1.111.4.1.2.1.4", smiType = SmiType.INTEGER, access = Access.READ)
	private int oraDbTablespaceSizeUsed;// - INTEGER(2 - integer (32 bit))

	@MibObjectType(oid = "1.3.6.1.4.1.111.4.1.2.1.5", smiType = SmiType.INTEGER, access = Access.READ)
	private int oraDbTablespaceState;// - INTEGER(2 - integer (32 bit))

	@MibObjectType(oid = "1.3.6.1.4.1.111.4.1.2.1.1", smiType = SmiType.INTEGER, access = Access.READ)
	private int oraDbTablespaceLargestAvailableChunk;// - INTEGER(2 - integer
														// (32 bit))

	public int getOraDbTablespaceIndex() {
		return oraDbTablespaceIndex;
	}

	public void setOraDbTablespaceIndex(int oraDbTablespaceIndex) {
		this.oraDbTablespaceIndex = oraDbTablespaceIndex;
	}

	public int getOraDbTablespaceLargestAvailableChunk() {
		return oraDbTablespaceLargestAvailableChunk;
	}

	public void setOraDbTablespaceLargestAvailableChunk(
			int oraDbTablespaceLargestAvailableChunk) {
		this.oraDbTablespaceLargestAvailableChunk = oraDbTablespaceLargestAvailableChunk;
	}

	public String getOraDbTablespaceName() {
		return oraDbTablespaceName;
	}

	public void setOraDbTablespaceName(String oraDbTablespaceName) {
		this.oraDbTablespaceName = oraDbTablespaceName;
	}

	public int getOraDbTablespaceSizeAllocated() {
		return oraDbTablespaceSizeAllocated;
	}

	public void setOraDbTablespaceSizeAllocated(int oraDbTablespaceSizeAllocated) {
		this.oraDbTablespaceSizeAllocated = oraDbTablespaceSizeAllocated;
	}

	public int getOraDbTablespaceSizeUsed() {
		return oraDbTablespaceSizeUsed;
	}

	public void setOraDbTablespaceSizeUsed(int oraDbTablespaceSizeUsed) {
		this.oraDbTablespaceSizeUsed = oraDbTablespaceSizeUsed;
	}

	public int getOraDbTablespaceState() {
		return oraDbTablespaceState;
	}

	public void setOraDbTablespaceState(int oraDbTablespaceState) {
		this.oraDbTablespaceState = oraDbTablespaceState;
	}

	public int getRdbmsDbIndex() {
		return rdbmsDbIndex;
	}

	public void setRdbmsDbIndex(int rdbmsDbIndex) {
		this.rdbmsDbIndex = rdbmsDbIndex;
	}

}
