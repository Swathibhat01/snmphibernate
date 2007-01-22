package org.opengoss.snmphibernate.mib.host;

import java.io.Serializable;

import org.opengoss.snmphibernate.api.SmiType;
import org.opengoss.snmphibernate.api.annotation.MibIndex;
import org.opengoss.snmphibernate.api.annotation.MibObjectType;
import org.opengoss.snmphibernate.api.annotation.MibTable;
import org.opengoss.snmphibernate.api.annotation.MibObjectType.Access;

@SuppressWarnings("serial")
@MibTable
public class HrSWInstalledEntry implements Serializable {

	@MibIndex(no = 0, length = 1)
	@MibObjectType(oid = "1.3.6.1.2.1.25.6.3.1.1", smiType = SmiType.INTEGER, access = Access.READ)
	private int hrSWInstalledIndex;

	@MibObjectType(oid = "1.3.6.1.2.1.25.6.3.1.2", smiType = SmiType.DISPLAY_STRING, access = Access.READ)
	private String hrSWInstalledName;

	@MibObjectType(oid = "1.3.6.1.2.1.25.6.3.1.3", smiType = SmiType.OID, access = Access.READ)
	private String hrSWInstalledID;

	@MibObjectType(oid = "1.3.6.1.2.1.25.6.3.1.4", smiType = SmiType.INTEGER, access = Access.READ)
	private int hrSWInstalledType;

	@MibObjectType(oid = "1.3.6.1.2.1.25.6.3.1.5", smiType = SmiType.OCTET_STRING, access = Access.READ)
	private byte[] hrSWInstalledDate;

	public HrSWInstalledEntry() {}
	
	public HrSWInstalledEntry(int index) {
		this.hrSWInstalledIndex = index;
	}
	public byte[] getHrSWInstalledDate() {
		return hrSWInstalledDate;
	}

	public void setHrSWInstalledDate(byte[] hrSWInstalledDate) {
		this.hrSWInstalledDate = hrSWInstalledDate;
	}

	public String getHrSWInstalledID() {
		return hrSWInstalledID;
	}

	public void setHrSWInstalledID(String hrSWInstalledID) {
		this.hrSWInstalledID = hrSWInstalledID;
	}

	public int getHrSWInstalledIndex() {
		return hrSWInstalledIndex;
	}

	public void setHrSWInstalledIndex(int hrSWInstalledIndex) {
		this.hrSWInstalledIndex = hrSWInstalledIndex;
	}

	public String getHrSWInstalledName() {
		return hrSWInstalledName;
	}

	public void setHrSWInstalledName(String hrSWInstalledName) {
		this.hrSWInstalledName = hrSWInstalledName;
	}

	public int getHrSWInstalledType() {
		return hrSWInstalledType;
	}

	public void setHrSWInstalledType(int hrSWInstalledType) {
		this.hrSWInstalledType = hrSWInstalledType;
	}

}
