package org.opengoss.snmphibernate.mib.host;

import java.io.Serializable;

import org.opengoss.snmphibernate.api.SmiType;
import org.opengoss.snmphibernate.api.annotation.MibObjectType;
import org.opengoss.snmphibernate.api.annotation.MibObjectType.Access;

@SuppressWarnings("serial")
public class HrSystemInfo implements Serializable {

	@MibObjectType(oid = "1.3.6.1.2.1.25.1.1.0", smiType = SmiType.TIMETICKS, access = Access.READ)
	private long hrSystemUpTime;

	@MibObjectType(oid = "1.3.6.1.2.1.25.1.2.0", smiType = SmiType.OCTET_STRING, access = Access.READ)
	private byte[] hrSystemDate;

	@MibObjectType(oid = "1.3.6.1.2.1.25.1.3.0", smiType = SmiType.INTEGER, access = Access.READ)
	private int hrSystemInitialLoadDevice;

	@MibObjectType(oid = "1.3.6.1.2.1.25.1.4.0", smiType = SmiType.OCTET_STRING, access = Access.READ)
	private byte[] hrSystemInitialLoadParameters;

	@MibObjectType(oid = "1.3.6.1.2.1.25.1.5.0", smiType = SmiType.GAUGE32, access = Access.READ)
	private long hrSystemNumUsers;

	@MibObjectType(oid = "1.3.6.1.2.1.25.1.6.0", smiType = SmiType.GAUGE32, access = Access.READ)
	private long hrSystemPocesses;

	@MibObjectType(oid = "1.3.6.1.2.1.25.1.7.0", smiType = SmiType.INTEGER, access = Access.READ)
	private long hrSystemMaxProcesses;

	public byte[] getHrSystemDate() {
		return hrSystemDate;
	}

	public void setHrSystemDate(byte[] hrSystemDate) {
		this.hrSystemDate = hrSystemDate;
	}

	public int getHrSystemInitialLoadDevice() {
		return hrSystemInitialLoadDevice;
	}

	public void setHrSystemInitialLoadDevice(int hrSystemInitialLoadDevice) {
		this.hrSystemInitialLoadDevice = hrSystemInitialLoadDevice;
	}

	public byte[] getHrSystemInitialLoadParameters() {
		return hrSystemInitialLoadParameters;
	}

	public void setHrSystemInitialLoadParameters(
			byte[] hrSystemInitialLoadParameters) {
		this.hrSystemInitialLoadParameters = hrSystemInitialLoadParameters;
	}

	public long getHrSystemMaxProcesses() {
		return hrSystemMaxProcesses;
	}

	public void setHrSystemMaxProcesses(long hrSystemMaxProcesses) {
		this.hrSystemMaxProcesses = hrSystemMaxProcesses;
	}

	public long getHrSystemNumUsers() {
		return hrSystemNumUsers;
	}

	public void setHrSystemNumUsers(long hrSystemNumUsers) {
		this.hrSystemNumUsers = hrSystemNumUsers;
	}

	public long getHrSystemPocesses() {
		return hrSystemPocesses;
	}

	public void setHrSystemPocesses(long hrSystemPocesses) {
		this.hrSystemPocesses = hrSystemPocesses;
	}

	public long getHrSystemUpTime() {
		return hrSystemUpTime;
	}

	public void setHrSystemUpTime(long hrSystemUpTime) {
		this.hrSystemUpTime = hrSystemUpTime;
	}

}
