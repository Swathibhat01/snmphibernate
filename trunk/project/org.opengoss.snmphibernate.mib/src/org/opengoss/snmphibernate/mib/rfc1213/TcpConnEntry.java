package org.opengoss.snmphibernate.mib.rfc1213;

import java.io.Serializable;

import org.opengoss.snmphibernate.api.SmiType;
import org.opengoss.snmphibernate.api.annotation.MibIndex;
import org.opengoss.snmphibernate.api.annotation.MibObjectType;
import org.opengoss.snmphibernate.api.annotation.MibTable;
import org.opengoss.snmphibernate.api.annotation.MibObjectType.Access;

@SuppressWarnings("serial")
@MibTable
public class TcpConnEntry implements Serializable {

	// 1: closed(1)
	// 2: listen(2)
	// 3: synSent(3)
	// 4: synReceived(4)
	// 5: established(5)
	// 6: finWait1(6)
	// 7: finWait2(7)
	// 8: closeWait(8)
	// 9: lastAck(9)
	// 10: closing(10)
	// 11: timeWait(11)
	// 12: deleteTCB(12)
	@MibObjectType(oid = "1.3.6.1.2.1.6.13.1.1", smiType = SmiType.INTEGER, access = Access.READ)
	private int tcpConnState;

	@MibIndex(no = 0, length = 4)
	@MibObjectType(oid = "1.3.6.1.2.1.6.13.1.2", smiType = SmiType.IPADDRESS, access = Access.READ)
	private String tcpConnLocalAddress;

	@MibIndex(no = 1, length = 1)
	@MibObjectType(oid = "1.3.6.1.2.1.6.13.1.3", smiType = SmiType.INTEGER, access = Access.READ)
	private int tcpConnLocalPort;

	@MibIndex(no = 2, length = 4)
	@MibObjectType(oid = "1.3.6.1.2.1.6.13.1.4", smiType = SmiType.IPADDRESS, access = Access.READ)
	private String tcpConnRemAddress;

	@MibIndex(no = 3, length = 1)
	@MibObjectType(oid = "1.3.6.1.2.1.6.13.1.5", smiType = SmiType.INTEGER, access = Access.READ)
	private int tcpConnRemPort;

	public String getTcpConnLocalAddress() {
		return tcpConnLocalAddress;
	}

	public void setTcpConnLocalAddress(String tcpConnLocalAddress) {
		this.tcpConnLocalAddress = tcpConnLocalAddress;
	}

	public int getTcpConnLocalPort() {
		return tcpConnLocalPort;
	}

	public void setTcpConnLocalPort(int tcpConnLocalPort) {
		this.tcpConnLocalPort = tcpConnLocalPort;
	}

	public String getTcpConnRemAddress() {
		return tcpConnRemAddress;
	}

	public void setTcpConnRemAddress(String tcpConnRemAddress) {
		this.tcpConnRemAddress = tcpConnRemAddress;
	}

	public int getTcpConnRemPort() {
		return tcpConnRemPort;
	}

	public void setTcpConnRemPort(int tcpConnRemPort) {
		this.tcpConnRemPort = tcpConnRemPort;
	}

	public int getTcpConnState() {
		return tcpConnState;
	}

	public void setTcpConnState(int tcpConnState) {
		this.tcpConnState = tcpConnState;
	}

}
