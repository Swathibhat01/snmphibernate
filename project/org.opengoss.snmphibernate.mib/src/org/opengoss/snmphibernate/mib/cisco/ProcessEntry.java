package org.opengoss.snmphibernate.mib.cisco;

import java.io.Serializable;

import org.opengoss.snmphibernate.api.SmiType;
import org.opengoss.snmphibernate.api.annotation.MibIndex;
import org.opengoss.snmphibernate.api.annotation.MibObjectType;
import org.opengoss.snmphibernate.api.annotation.MibTable;
import org.opengoss.snmphibernate.api.annotation.MibObjectType.Access;

@SuppressWarnings("serial")
@MibTable
public class ProcessEntry implements Serializable {
	@MibIndex(no = 0, length = 1)
	@MibObjectType(oid = "1.3.6.1.4.1.9.9.109.1.1.1.1.1", smiType = SmiType.UNSIGNED32, access = Access.READ)
	private long cpmCPUTotalIndex;

	@MibIndex(no = 1, length = 1)
	@MibObjectType(oid = "1.3.6.1.4.1.9.9.109.1.2.1.1.1", smiType = SmiType.UNSIGNED32, access = Access.READ)
	private long cpmProcessPID;

	@MibObjectType(oid = "1.3.6.1.4.1.9.9.109.1.2.1.1.2", smiType = SmiType.DISPLAY_STRING, access = Access.READ)
	private String cpmProcessName;// - DisplayString(4 - octets)

	@MibObjectType(oid = "1.3.6.1.4.1.9.9.109.1.2.1.1.5", smiType = SmiType.TIMETICKS, access = Access.READ)
	private long cpmProcessTimeCreated;// - TimeStamp(67 - timeticks)

	@MibObjectType(oid = "1.3.6.1.4.1.9.9.109.1.2.1.1.6", smiType = SmiType.UNSIGNED32, access = Access.READ)
	private long cpmProcessAverageUSecs;// - Unsigned32(66 - gauge32)

	@MibObjectType(oid = "1.3.6.1.4.1.9.9.109.1.2.2.1.1", smiType = SmiType.GAUGE32, access = Access.READ)
	private long cpmProcExtMemAllocated;

	@MibObjectType(oid = "1.3.6.1.4.1.9.9.109.1.2.2.1.2", smiType = SmiType.GAUGE32, access = Access.READ)
	private long cpmProcExtMemFreed;

	@MibObjectType(oid = "1.3.6.1.4.1.9.9.109.1.2.2.1.3", smiType = SmiType.COUNTER32, access = Access.READ)
	private long cpmProcExtInvoked;

	@MibObjectType(oid = "1.3.6.1.4.1.9.9.109.1.2.2.1.8", smiType = SmiType.INTEGER, access = Access.READ)
	private int cpmProcExtPriority;

	public long getCpmCPUTotalIndex() {
		return cpmCPUTotalIndex;
	}

	public void setCpmCPUTotalIndex(long cpmCPUTotalIndex) {
		this.cpmCPUTotalIndex = cpmCPUTotalIndex;
	}

	public long getCpmProcessAverageUSecs() {
		return cpmProcessAverageUSecs;
	}

	public void setCpmProcessAverageUSecs(long cpmProcessAverageUSecs) {
		this.cpmProcessAverageUSecs = cpmProcessAverageUSecs;
	}

	public String getCpmProcessName() {
		return cpmProcessName;
	}

	public void setCpmProcessName(String cpmProcessName) {
		this.cpmProcessName = cpmProcessName;
	}

	public long getCpmProcessPID() {
		return cpmProcessPID;
	}

	public void setCpmProcessPID(long cpmProcessPID) {
		this.cpmProcessPID = cpmProcessPID;
	}

	public long getCpmProcessTimeCreated() {
		return cpmProcessTimeCreated;
	}

	public void setCpmProcessTimeCreated(long cpmProcessTimeCreated) {
		this.cpmProcessTimeCreated = cpmProcessTimeCreated;
	}

	public long getCpmProcExtInvoked() {
		return cpmProcExtInvoked;
	}

	public void setCpmProcExtInvoked(long cpmProcExtInvoked) {
		this.cpmProcExtInvoked = cpmProcExtInvoked;
	}

	public long getCpmProcExtMemAllocated() {
		return cpmProcExtMemAllocated;
	}

	public void setCpmProcExtMemAllocated(long cpmProcExtMemAllocated) {
		this.cpmProcExtMemAllocated = cpmProcExtMemAllocated;
	}

	public long getCpmProcExtMemFreed() {
		return cpmProcExtMemFreed;
	}

	public void setCpmProcExtMemFreed(long cpmProcExtMemFreed) {
		this.cpmProcExtMemFreed = cpmProcExtMemFreed;
	}

	public int getCpmProcExtPriority() {
		return cpmProcExtPriority;
	}

	public void setCpmProcExtPriority(int cpmProcExtPriority) {
		this.cpmProcExtPriority = cpmProcExtPriority;
	}

}
