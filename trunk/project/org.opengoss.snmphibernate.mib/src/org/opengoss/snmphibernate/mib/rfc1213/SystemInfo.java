package org.opengoss.snmphibernate.mib.rfc1213;

import java.io.Serializable;

import org.opengoss.snmphibernate.api.SmiType;
import org.opengoss.snmphibernate.api.annotation.MibObjectType;
import org.opengoss.snmphibernate.api.annotation.MibObjectType.Access;

@SuppressWarnings("serial")
public class SystemInfo implements Serializable {

	@MibObjectType(oid = "1.3.6.1.2.1.1.1.0", smiType = SmiType.DISPLAY_STRING, access = Access.READ)
	private String sysDesc;

	@MibObjectType(oid = "1.3.6.1.2.1.1.2.0", smiType = SmiType.OID, access = Access.READ)
	private String sysObjectID;

	@MibObjectType(oid = "1.3.6.1.2.1.1.3.0", smiType = SmiType.TIMETICKS, access = Access.READ)
	private long sysUpTime;

	@MibObjectType(oid = "1.3.6.1.2.1.1.4.0", smiType = SmiType.DISPLAY_STRING, access = Access.WRITE)
	private String sysContact;

	@MibObjectType(oid = "1.3.6.1.2.1.1.5.0", smiType = SmiType.DISPLAY_STRING, access = Access.WRITE)
	private String sysName;

	@MibObjectType(oid = "1.3.6.1.2.1.1.6.0", smiType = SmiType.DISPLAY_STRING, access = Access.WRITE)
	private String sysLocation;

	public String getSysContact() {
		return sysContact;
	}

	public void setSysContact(String sysContact) {
		this.sysContact = sysContact;
	}

	public String getSysDesc() {
		return sysDesc;
	}

	public void setSysDesc(String sysDesc) {
		this.sysDesc = sysDesc;
	}

	public String getSysLocation() {
		return sysLocation;
	}

	public void setSysLocation(String sysLocation) {
		this.sysLocation = sysLocation;
	}

	public String getSysName() {
		return sysName;
	}

	public void setSysName(String sysName) {
		this.sysName = sysName;
	}

	public String getSysObjectID() {
		return sysObjectID;
	}

	public void setSysObjectID(String sysObjectID) {
		this.sysObjectID = sysObjectID;
	}

	public long getSysUpTime() {
		return sysUpTime;
	}

	public void setSysUpTime(long sysUpTime) {
		this.sysUpTime = sysUpTime;
	}

}
