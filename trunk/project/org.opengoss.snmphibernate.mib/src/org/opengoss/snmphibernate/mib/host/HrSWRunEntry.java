package org.opengoss.snmphibernate.mib.host;

import java.io.Serializable;

import org.opengoss.snmphibernate.api.SmiType;
import org.opengoss.snmphibernate.api.annotation.MibIndex;
import org.opengoss.snmphibernate.api.annotation.MibObjectType;
import org.opengoss.snmphibernate.api.annotation.MibTable;
import org.opengoss.snmphibernate.api.annotation.MibObjectType.Access;

@SuppressWarnings("serial")
@MibTable
public class HrSWRunEntry implements Serializable {
	
	@MibIndex(no = 0, length = 1)
	@MibObjectType(oid = "1.3.6.1.2.1.25.4.2.1.1", smiType = SmiType.INTEGER, access = Access.READ)
	private int hrSWRunIndex;

	@MibObjectType(oid = "1.3.6.1.2.1.25.4.2.1.2", smiType = SmiType.DISPLAY_STRING, access = Access.READ)
	private String hrSWRunName;

	@MibObjectType(oid = "1.3.6.1.2.1.25.4.2.1.3", smiType = SmiType.OID, access = Access.READ)
	private String hrSWRunID;

	@MibObjectType(oid = "1.3.6.1.2.1.25.4.2.1.4", smiType = SmiType.DISPLAY_STRING, access = Access.READ)
	private String hrSWRunPath;

	@MibObjectType(oid = "1.3.6.1.2.1.25.4.2.1.5", smiType = SmiType.DISPLAY_STRING, access = Access.READ)
	private String hrSWRunParameters;

//	1: unknown(1) 
// 	2: operatingSystem(2) 
// 	3: deviceDriver(3) 
// 	4: application(4) 
	@MibObjectType(oid = "1.3.6.1.2.1.25.4.2.1.6", smiType = SmiType.INTEGER, access = Access.READ)
	private int hrSWRunType;

//	1: running(1) 
// 	2: runnable(2) 
// 	3: notRunnable(3) 
// 	4: invalid(4) 
	@MibObjectType(oid = "1.3.6.1.2.1.25.4.2.1.7", smiType = SmiType.INTEGER, access = Access.READ)
	private int hrSWRunStatus;
	
	public HrSWRunEntry() {};

	public HrSWRunEntry(int index) {
		this.hrSWRunIndex = index;
	}

	public String getHrSWRunID() {
		return hrSWRunID;
	}

	public void setHrSWRunID(String hrSWRunID) {
		this.hrSWRunID = hrSWRunID;
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

	public String getHrSWRunParameters() {
		return hrSWRunParameters;
	}

	public void setHrSWRunParameters(String hrSWRunParameters) {
		this.hrSWRunParameters = hrSWRunParameters;
	}

	public String getHrSWRunPath() {
		return hrSWRunPath;
	}

	public void setHrSWRunPath(String hrSWRunPath) {
		this.hrSWRunPath = hrSWRunPath;
	}

	public int getHrSWRunStatus() {
		return hrSWRunStatus;
	}

	public void setHrSWRunStatus(int hrSWRunStatus) {
		this.hrSWRunStatus = hrSWRunStatus;
	}

	public int getHrSWRunType() {
		return hrSWRunType;
	}

	public void setHrSWRunType(int hrSWRunType) {
		this.hrSWRunType = hrSWRunType;
	}
	
}
