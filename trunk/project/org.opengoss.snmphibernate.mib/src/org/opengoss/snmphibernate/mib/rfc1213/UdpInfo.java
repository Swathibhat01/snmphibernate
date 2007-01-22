package org.opengoss.snmphibernate.mib.rfc1213;

import java.io.Serializable;

import org.opengoss.snmphibernate.api.SmiType;
import org.opengoss.snmphibernate.api.annotation.MibObjectType;
import org.opengoss.snmphibernate.api.annotation.MibObjectType.Access;

@SuppressWarnings("serial")
public class UdpInfo implements Serializable {

	@MibObjectType(oid = "1.3.6.1.2.1.7.1.0", smiType = SmiType.COUNTER32, access = Access.READ)
	private long udpInDatagrams;

	@MibObjectType(oid = "1.3.6.1.2.1.7.2.0", smiType = SmiType.COUNTER32, access = Access.READ)
	private long udpNoPorts;

	@MibObjectType(oid = "1.3.6.1.2.1.7.3.0", smiType = SmiType.COUNTER32, access = Access.READ)
	private long udpInErrors;

	@MibObjectType(oid = "1.3.6.1.2.1.7.4.0", smiType = SmiType.COUNTER32, access = Access.READ)
	private long udpOutDatagrams;

	public long getUdpInDatagrams() {
		return udpInDatagrams;
	}

	public void setUdpInDatagrams(long udpInDatagrams) {
		this.udpInDatagrams = udpInDatagrams;
	}

	public long getUdpInErrors() {
		return udpInErrors;
	}

	public void setUdpInErrors(long udpInErrors) {
		this.udpInErrors = udpInErrors;
	}

	public long getUdpNoPorts() {
		return udpNoPorts;
	}

	public void setUdpNoPorts(long udpNoPorts) {
		this.udpNoPorts = udpNoPorts;
	}

	public long getUdpOutDatagrams() {
		return udpOutDatagrams;
	}

	public void setUdpOutDatagrams(long udpOutDatagrams) {
		this.udpOutDatagrams = udpOutDatagrams;
	}

}
