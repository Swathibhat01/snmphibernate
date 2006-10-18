package net.sourceforge.snmphibernate.mib.db;

import java.io.Serializable;

import net.sourceforge.snmphibernate.api.SmiType;
import net.sourceforge.snmphibernate.api.annotation.MibIndex;
import net.sourceforge.snmphibernate.api.annotation.MibObjectType;
import net.sourceforge.snmphibernate.api.annotation.MibTable;
import net.sourceforge.snmphibernate.api.annotation.MibObjectType.Access;

@SuppressWarnings("serial")
@MibTable
public class RdbmsSrvEntry implements Serializable {
	@MibIndex(no = 0, length = 1)
	@MibObjectType(oid = "1.3.6.1.2.1.27.1.1.1", smiType = SmiType.INTEGER, access = Access.READ)
	private int applIndex;

	@MibObjectType(oid = "1.3.6.1.2.1.39.1.5.1.1", smiType = SmiType.OID, access = Access.READ)
	private String rdbmsSrvPrivateMibOID;// - OBJECT IDENTIFIER(6 - object identifier)

	@MibObjectType(oid = "1.3.6.1.2.1.39.1.5.1.2", smiType = SmiType.DISPLAY_STRING, access = Access.READ)
	private String rdbmsSrvVendorName;// - DisplayString(4 - octets)

	@MibObjectType(oid = "1.3.6.1.2.1.39.1.5.1.3", smiType = SmiType.DISPLAY_STRING, access = Access.READ)
	private String rdbmsSrvProductName;// - DisplayString(4 - octets)

	@MibObjectType(oid = "1.3.6.1.2.1.39.1.5.1.4", smiType = SmiType.DISPLAY_STRING, access = Access.READ)
	private String rdbmsSrvContact;// - DisplayString(4 - octets)

	public int getApplIndex() {
		return applIndex;
	}

	public void setApplIndex(int applIndex) {
		this.applIndex = applIndex;
	}

	public String getRdbmsSrvContact() {
		return rdbmsSrvContact;
	}

	public void setRdbmsSrvContact(String rdbmsSrvContact) {
		this.rdbmsSrvContact = rdbmsSrvContact;
	}

	public String getRdbmsSrvPrivateMibOID() {
		return rdbmsSrvPrivateMibOID;
	}

	public void setRdbmsSrvPrivateMibOID(String rdbmsSrvPrivateMibOID) {
		this.rdbmsSrvPrivateMibOID = rdbmsSrvPrivateMibOID;
	}

	public String getRdbmsSrvProductName() {
		return rdbmsSrvProductName;
	}

	public void setRdbmsSrvProductName(String rdbmsSrvProductName) {
		this.rdbmsSrvProductName = rdbmsSrvProductName;
	}

	public String getRdbmsSrvVendorName() {
		return rdbmsSrvVendorName;
	}

	public void setRdbmsSrvVendorName(String rdbmsSrvVendorName) {
		this.rdbmsSrvVendorName = rdbmsSrvVendorName;
	}

}
