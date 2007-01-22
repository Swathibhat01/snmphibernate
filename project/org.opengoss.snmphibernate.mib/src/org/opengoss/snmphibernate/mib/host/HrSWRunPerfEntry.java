package org.opengoss.snmphibernate.mib.host;

import java.io.Serializable;

import org.opengoss.snmphibernate.api.SmiType;
import org.opengoss.snmphibernate.api.annotation.MibIndex;
import org.opengoss.snmphibernate.api.annotation.MibObjectType;
import org.opengoss.snmphibernate.api.annotation.MibTable;
import org.opengoss.snmphibernate.api.annotation.MibObjectType.Access;

@SuppressWarnings("serial")
@MibTable
public class HrSWRunPerfEntry implements Serializable {

	@MibIndex(no = 0, length = 1)
	@MibObjectType(oid = "1.3.6.1.2.1.25.4.2.1.1", smiType = SmiType.INTEGER, access = Access.READ)
	private int hrSWRunIndex;

	@MibObjectType(oid = "1.3.6.1.2.1.25.4.2.1.2", smiType = SmiType.DISPLAY_STRING, access = Access.READ)
	private String hrSWRunName;

	// centi-seconds
	@MibObjectType(oid = "1.3.6.1.2.1.25.5.1.1.1", smiType = SmiType.INTEGER, access = Access.READ)
	private int hrSWRunPerfCPU;

	// Unit: KBytes
	@MibObjectType(oid = "1.3.6.1.2.1.25.5.1.1.2", smiType = SmiType.INTEGER, access = Access.READ)
	private int hrSWRunPerfMem;

	public HrSWRunPerfEntry() {
	}

	public HrSWRunPerfEntry(int pid) {
		this.hrSWRunIndex = pid;
	}

	public int getHrSWRunIndex() {
		return hrSWRunIndex;
	}

	public void setHrSWRunIndex(int hrSWRunIndex) {
		this.hrSWRunIndex = hrSWRunIndex;
	}

	public String getHrSWRunName() {
		return hrSWRunName;
	}

	public void setHrSWRunName(String hrSWRunName) {
		this.hrSWRunName = hrSWRunName;
	}

	public int getHrSWRunPerfCPU() {
		return hrSWRunPerfCPU;
	}

	public void setHrSWRunPerfCPU(int hrSWRunPerfCPU) {
		this.hrSWRunPerfCPU = hrSWRunPerfCPU;
	}

	public int getHrSWRunPerfMem() {
		return hrSWRunPerfMem;
	}

	public void setHrSWRunPerfMem(int hrSWRunPerfMem) {
		this.hrSWRunPerfMem = hrSWRunPerfMem;
	}

}
