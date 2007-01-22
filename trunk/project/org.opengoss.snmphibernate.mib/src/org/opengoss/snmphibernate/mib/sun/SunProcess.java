package org.opengoss.snmphibernate.mib.sun;

import java.io.Serializable;

import org.opengoss.snmphibernate.api.SmiType;
import org.opengoss.snmphibernate.api.annotation.MibIndex;
import org.opengoss.snmphibernate.api.annotation.MibObjectType;
import org.opengoss.snmphibernate.api.annotation.MibTable;
import org.opengoss.snmphibernate.api.annotation.MibObjectType.Access;

@SuppressWarnings("serial")
@MibTable
public class SunProcess implements Serializable {

	@MibIndex(no = 0, length = 1)
	@MibObjectType(oid = "1.3.6.1.4.1.42.3.12.1.1.1", smiType = SmiType.INTEGER, access = Access.READ)
	private int psProcessID;

	@MibObjectType(oid = "1.3.6.1.4.1.42.3.12.1.1.2", smiType = SmiType.INTEGER, access = Access.READ)
	private int psParentProcessID;

	@MibObjectType(oid = "1.3.6.1.4.1.42.3.12.1.1.3", smiType = SmiType.INTEGER, access = Access.READ)
	private int psProcessSize;

	@MibObjectType(oid = "1.3.6.1.4.1.42.3.12.1.1.4", smiType = SmiType.INTEGER, access = Access.READ)
	private int psProcessCpuTime;

	/**
	 * R - Runnable T - Stopped P - In page wait D - Non-interruptable wait S -
	 * Sleeping (less than 20 seconds) I - Idle (more than 20 seconds) Z -
	 * Zombie
	 */
	@MibObjectType(oid = "1.3.6.1.4.1.42.3.12.1.1.5", smiType = SmiType.DISPLAY_STRING, access = Access.READ)
	private String psProcessState;

	@MibObjectType(oid = "1.3.6.1.4.1.42.3.12.1.1.6", smiType = SmiType.DISPLAY_STRING, access = Access.READ)
	private String psProcessWaitChannel;

	@MibObjectType(oid = "1.3.6.1.4.1.42.3.12.1.1.7", smiType = SmiType.DISPLAY_STRING, access = Access.READ)
	private String psProcessTTY;

	@MibObjectType(oid = "1.3.6.1.4.1.42.3.12.1.1.8", smiType = SmiType.DISPLAY_STRING, access = Access.READ)
	private String psProcessUserName;

	@MibObjectType(oid = "1.3.6.1.4.1.42.3.12.1.1.9", smiType = SmiType.INTEGER, access = Access.READ)
	private int psProcessUserID;

	@MibObjectType(oid = "1.3.6.1.4.1.42.3.12.1.1.10", smiType = SmiType.DISPLAY_STRING, access = Access.READ)
	private String psProcessName;

	@MibObjectType(oid = "1.3.6.1.4.1.42.3.12.1.1.11", smiType = SmiType.INTEGER, access = Access.READ)
	private int psProcessStatus;

	public int getPsParentProcessID() {
		return psParentProcessID;
	}

	public void setPsParentProcessID(int psParentProcessID) {
		this.psParentProcessID = psParentProcessID;
	}

	public int getPsProcessCpuTime() {
		return psProcessCpuTime;
	}

	public void setPsProcessCpuTime(int psProcessCpuTime) {
		this.psProcessCpuTime = psProcessCpuTime;
	}

	public int getPsProcessID() {
		return psProcessID;
	}

	public void setPsProcessID(int psProcessID) {
		this.psProcessID = psProcessID;
	}

	public String getPsProcessName() {
		return psProcessName;
	}

	public void setPsProcessName(String psProcessName) {
		this.psProcessName = psProcessName;
	}

	public int getPsProcessSize() {
		return psProcessSize;
	}

	public void setPsProcessSize(int psProcessSize) {
		this.psProcessSize = psProcessSize;
	}

	public String getPsProcessState() {
		return psProcessState;
	}

	public void setPsProcessState(String psProcessState) {
		this.psProcessState = psProcessState;
	}

	public int getPsProcessStatus() {
		return psProcessStatus;
	}

	public void setPsProcessStatus(int psProcessStatus) {
		this.psProcessStatus = psProcessStatus;
	}

	public String getPsProcessTTY() {
		return psProcessTTY;
	}

	public void setPsProcessTTY(String psProcessTTY) {
		this.psProcessTTY = psProcessTTY;
	}

	public int getPsProcessUserID() {
		return psProcessUserID;
	}

	public void setPsProcessUserID(int psProcessUserID) {
		this.psProcessUserID = psProcessUserID;
	}

	public String getPsProcessUserName() {
		return psProcessUserName;
	}

	public void setPsProcessUserName(String psProcessUserName) {
		this.psProcessUserName = psProcessUserName;
	}

	public String getPsProcessWaitChannel() {
		return psProcessWaitChannel;
	}

	public void setPsProcessWaitChannel(String psProcessWaitChannel) {
		this.psProcessWaitChannel = psProcessWaitChannel;
	}

}
