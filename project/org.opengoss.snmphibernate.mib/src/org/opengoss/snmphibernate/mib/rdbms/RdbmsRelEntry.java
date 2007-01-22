package org.opengoss.snmphibernate.mib.rdbms;

import java.io.Serializable;

import org.opengoss.snmphibernate.api.SmiType;
import org.opengoss.snmphibernate.api.annotation.MibIndex;
import org.opengoss.snmphibernate.api.annotation.MibObjectType;
import org.opengoss.snmphibernate.api.annotation.MibTable;
import org.opengoss.snmphibernate.api.annotation.MibObjectType.Access;

@SuppressWarnings("serial")
@MibTable
public class RdbmsRelEntry implements Serializable {
	@MibIndex(no = 0, length = 1)
	@MibObjectType(oid = "1.3.6.1.2.1.39.1.1.1.1", smiType = SmiType.INTEGER, access = Access.READ)
	private int rdbmsDbIndex;

	@MibIndex(no = 1, length = 1)
	@MibObjectType(oid = "1.3.6.1.2.1.27.1.1.1", smiType = SmiType.INTEGER, access = Access.READ)
	private int applIndex;

	// 1: other(1)
	// 2: active(2)
	// 3: available(3)
	// 4: restricted(4)
	// 5: unavailable(5)
	@MibObjectType(oid = "1.3.6.1.2.1.39.1.9.1.1", smiType = SmiType.INTEGER, access = Access.READ)
	private int rdbmsRelState;// - INTEGER(2 - integer (32 bit))

	@MibObjectType(oid = "1.3.6.1.2.1.39.1.9.1.1", smiType = SmiType.OCTET_STRING, access = Access.READ)
	private byte[] rdbmsRelActiveTime;// - DateAndTime(4 - octets)

	public int getApplIndex() {
		return applIndex;
	}

	public void setApplIndex(int applIndex) {
		this.applIndex = applIndex;
	}

	public int getRdbmsDbIndex() {
		return rdbmsDbIndex;
	}

	public void setRdbmsDbIndex(int rdbmsDbIndex) {
		this.rdbmsDbIndex = rdbmsDbIndex;
	}

	public byte[] getRdbmsRelActiveTime() {
		return rdbmsRelActiveTime;
	}

	public void setRdbmsRelActiveTime(byte[] rdbmsRelActiveTime) {
		this.rdbmsRelActiveTime = rdbmsRelActiveTime;
	}

	public int getRdbmsRelState() {
		return rdbmsRelState;
	}

	public void setRdbmsRelState(int rdbmsRelState) {
		this.rdbmsRelState = rdbmsRelState;
	}

}
