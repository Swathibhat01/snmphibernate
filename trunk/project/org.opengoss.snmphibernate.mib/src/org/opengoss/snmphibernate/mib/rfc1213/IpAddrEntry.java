package org.opengoss.snmphibernate.mib.rfc1213;

import java.io.Serializable;

import org.opengoss.snmphibernate.api.SmiType;
import org.opengoss.snmphibernate.api.annotation.MibIndex;
import org.opengoss.snmphibernate.api.annotation.MibObjectType;
import org.opengoss.snmphibernate.api.annotation.MibTable;
import org.opengoss.snmphibernate.api.annotation.MibObjectType.Access;

@SuppressWarnings("serial")
@MibTable
public class IpAddrEntry implements Serializable {

	@MibIndex(no = 0, length = 4)
	@MibObjectType(oid = "1.3.6.1.2.1.4.20.1.1", smiType = SmiType.IPADDRESS, access = Access.READ)
	private String ipAdEntAddr;

	@MibObjectType(oid = "1.3.6.1.2.1.4.20.1.2", smiType = SmiType.INTEGER, access = Access.READ)
	private int ipAdEntIfIndex;

	@MibObjectType(oid = "1.3.6.1.2.1.4.20.1.3", smiType = SmiType.IPADDRESS, access = Access.READ)
	private String ipAdEntNetMask;

	@MibObjectType(oid = "1.3.6.1.2.1.4.20.1.4", smiType = SmiType.INTEGER, access = Access.READ)
	private int ipAdEntBcastAddr;

	@MibObjectType(oid = "1.3.6.1.2.1.4.20.1.5", smiType = SmiType.INTEGER, access = Access.READ)
	private int ipAdEntReasmMaxSize;
	
	public IpAddrEntry() {}
	
	public IpAddrEntry(String ipAdEntAddr) {
		this.ipAdEntAddr = ipAdEntAddr;
	}

	public String getIpAdEntAddr() {
		return ipAdEntAddr;
	}

	public void setIpAdEntAddr(String ipAdEntAddr) {
		this.ipAdEntAddr = ipAdEntAddr;
	}

	public int getIpAdEntBcastAddr() {
		return ipAdEntBcastAddr;
	}

	public void setIpAdEntBcastAddr(int ipAdEntBcastAddr) {
		this.ipAdEntBcastAddr = ipAdEntBcastAddr;
	}

	public int getIpAdEntIfIndex() {
		return ipAdEntIfIndex;
	}

	public void setIpAdEntIfIndex(int ipAdEntIfIndex) {
		this.ipAdEntIfIndex = ipAdEntIfIndex;
	}

	public String getIpAdEntNetMask() {
		return ipAdEntNetMask;
	}

	public void setIpAdEntNetMask(String ipAdEntNetMask) {
		this.ipAdEntNetMask = ipAdEntNetMask;
	}

	public int getIpAdEntReasmMaxSize() {
		return ipAdEntReasmMaxSize;
	}

	public void setIpAdEntReasmMaxSize(int ipAdEntReasmMaxSize) {
		this.ipAdEntReasmMaxSize = ipAdEntReasmMaxSize;
	}

}
