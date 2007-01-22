package org.opengoss.snmphibernate.mib.rdbms;

import java.io.Serializable;

import org.opengoss.snmphibernate.api.SmiType;
import org.opengoss.snmphibernate.api.annotation.MibIndex;
import org.opengoss.snmphibernate.api.annotation.MibObjectType;
import org.opengoss.snmphibernate.api.annotation.MibTable;
import org.opengoss.snmphibernate.api.annotation.MibObjectType.Access;

@SuppressWarnings("serial")
@MibTable
public class RdbmsDbEntry implements Serializable {
	@MibIndex(no = 0, length = 1)
	@MibObjectType(oid = "1.3.6.1.2.1.39.1.1.1.1", smiType = SmiType.INTEGER, access = Access.READ)
	private int rdbmsDbIndex;

	@MibObjectType(oid = "1.3.6.1.2.1.39.1.1.1.2", smiType = SmiType.OID, access = Access.READ)
	private String rdbmsDbPrivateMibOID;// - OBJECT IDENTIFIER(6 - object identifier)

	@MibObjectType(oid = "1.3.6.1.2.1.39.1.1.1.3", smiType = SmiType.DISPLAY_STRING, access = Access.READ)
	private String rdbmsDbVendorName;// - DisplayString(4 - octets)

	@MibObjectType(oid = "1.3.6.1.2.1.39.1.1.1.4", smiType = SmiType.DISPLAY_STRING, access = Access.READ)
	private String rdbmsDbName;// - DisplayString(4 - octets)

	@MibObjectType(oid = "1.3.6.1.2.1.39.1.1.1.5", smiType = SmiType.DISPLAY_STRING, access = Access.READ)
	private String rdbmsDbContact;// - DisplayString(4 - octets)

	public String getRdbmsDbContact() {
		return rdbmsDbContact;
	}

	public void setRdbmsDbContact(String rdbmsDbContact) {
		this.rdbmsDbContact = rdbmsDbContact;
	}

	public int getRdbmsDbIndex() {
		return rdbmsDbIndex;
	}

	public void setRdbmsDbIndex(int rdbmsDbIndex) {
		this.rdbmsDbIndex = rdbmsDbIndex;
	}

	public String getRdbmsDbName() {
		return rdbmsDbName;
	}

	public void setRdbmsDbName(String rdbmsDbName) {
		this.rdbmsDbName = rdbmsDbName;
	}

	public String getRdbmsDbPrivateMibOID() {
		return rdbmsDbPrivateMibOID;
	}

	public void setRdbmsDbPrivateMibOID(String rdbmsDbPrivateMibOID) {
		this.rdbmsDbPrivateMibOID = rdbmsDbPrivateMibOID;
	}

	public String getRdbmsDbVendorName() {
		return rdbmsDbVendorName;
	}

	public void setRdbmsDbVendorName(String rdbmsDbVendorName) {
		this.rdbmsDbVendorName = rdbmsDbVendorName;
	}

}
