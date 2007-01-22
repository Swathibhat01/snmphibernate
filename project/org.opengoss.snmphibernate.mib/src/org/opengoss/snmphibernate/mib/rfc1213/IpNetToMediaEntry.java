package org.opengoss.snmphibernate.mib.rfc1213;

import java.io.Serializable;

import org.opengoss.snmphibernate.api.SmiType;
import org.opengoss.snmphibernate.api.annotation.MibIndex;
import org.opengoss.snmphibernate.api.annotation.MibObjectType;
import org.opengoss.snmphibernate.api.annotation.MibTable;
import org.opengoss.snmphibernate.api.annotation.MibObjectType.Access;

@SuppressWarnings("serial")
@MibTable 
public class IpNetToMediaEntry implements Serializable{

	@MibIndex(no = 0, length = 1)
	@MibObjectType(oid = "1.3.6.1.2.1.4.22.1.1", smiType = SmiType.INTEGER, access = Access.READ)
	private int ipNetToMediaIfIndex;

	@MibObjectType(oid = "1.3.6.1.2.1.4.22.1.2", smiType = SmiType.OCTET_STRING, access = Access.READ)
	private byte[] ipNetToMediaPhysAddress;

	@MibIndex(no = 1, length = 4)
	@MibObjectType(oid = "1.3.6.1.2.1.4.22.1.3", smiType = SmiType.IPADDRESS, access = Access.READ)
	private String ipNetToMediaNetAddress;

	@MibObjectType(oid = "1.3.6.1.2.1.4.22.1.1", smiType = SmiType.INTEGER, access = Access.READ)
	private int ipNetToMediaType;

	public int getIpNetToMediaIfIndex() {
		return ipNetToMediaIfIndex;
	}

	public void setIpNetToMediaIfIndex(int ipNetToMediaIfIndex) {
		this.ipNetToMediaIfIndex = ipNetToMediaIfIndex;
	}

	public String getIpNetToMediaNetAddress() {
		return ipNetToMediaNetAddress;
	}

	public void setIpNetToMediaNetAddress(String ipNetToMediaNetAddress) {
		this.ipNetToMediaNetAddress = ipNetToMediaNetAddress;
	}

	public byte[] getIpNetToMediaPhysAddress() {
		return ipNetToMediaPhysAddress;
	}

	public void setIpNetToMediaPhysAddress(byte[] ipNetToMediaPhysAddress) {
		this.ipNetToMediaPhysAddress = ipNetToMediaPhysAddress;
	}

	public int getIpNetToMediaType() {
		return ipNetToMediaType;
	}

	public void setIpNetToMediaType(int ipNetToMediaType) {
		this.ipNetToMediaType = ipNetToMediaType;
	}
	
}
