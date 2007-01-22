package org.opengoss.snmphibernate.mib.rfc1213;

import java.io.Serializable;

import org.opengoss.snmphibernate.api.SmiType;
import org.opengoss.snmphibernate.api.annotation.MibIndex;
import org.opengoss.snmphibernate.api.annotation.MibObjectType;
import org.opengoss.snmphibernate.api.annotation.MibTable;
import org.opengoss.snmphibernate.api.annotation.MibObjectType.Access;

@SuppressWarnings("serial")
@MibTable
public class UdpEntry implements Serializable {

	@MibIndex(no = 0, length = 4)
	@MibObjectType(oid = "1.3.6.1.2.1.7.5.1.1", smiType = SmiType.IPADDRESS, access = Access.READ)
	private String udpLocalAddress;

	@MibIndex(no = 1, length = 1)
	@MibObjectType(oid = "1.3.6.1.2.1.7.5.1.2", smiType = SmiType.INTEGER, access = Access.READ)
	private int udpLocalPort;

	public String getUdpLocalAddress() {
		return udpLocalAddress;
	}

	public void setUdpLocalAddress(String udpLocalAddress) {
		this.udpLocalAddress = udpLocalAddress;
	}

	public int getUdpLocalPort() {
		return udpLocalPort;
	}

	public void setUdpLocalPort(int udpLocalPort) {
		this.udpLocalPort = udpLocalPort;
	}

}
