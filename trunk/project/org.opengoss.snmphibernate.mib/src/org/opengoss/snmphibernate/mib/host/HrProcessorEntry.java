package org.opengoss.snmphibernate.mib.host;

import java.io.Serializable;

import org.opengoss.snmphibernate.api.SmiType;
import org.opengoss.snmphibernate.api.annotation.MibIndex;
import org.opengoss.snmphibernate.api.annotation.MibObjectType;
import org.opengoss.snmphibernate.api.annotation.MibTable;
import org.opengoss.snmphibernate.api.annotation.MibObjectType.Access;

@SuppressWarnings("serial")
@MibTable
public class HrProcessorEntry implements Serializable {

	@MibIndex(no = 0, length = 1)
	@MibObjectType(oid = "1.3.6.1.2.1.25.3.2.1.1", smiType = SmiType.INTEGER, access = Access.READ)
	private int hrDeviceIndex;

	@MibObjectType(oid = "1.3.6.1.2.1.25.3.3.1.1", smiType = SmiType.OID, access = Access.READ)
	private String hrProcessorFrwID;

	@MibObjectType(oid = "1.3.6.1.2.1.25.3.3.1.2", smiType = SmiType.INTEGER, access = Access.READ)
	private int hrProcessorLoad;
	
	public HrProcessorEntry() {};
	
	public HrProcessorEntry(int deviceIndex) {
		this.hrDeviceIndex = deviceIndex;
	}

	public int getHrDeviceIndex() {
		return hrDeviceIndex;
	}

	public void setHrDeviceIndex(int hrDeviceIndex) {
		this.hrDeviceIndex = hrDeviceIndex;
	}

	public String getHrProcessorFrwID() {
		return hrProcessorFrwID;
	}

	public void setHrProcessorFrwID(String hrProcessorFrwID) {
		this.hrProcessorFrwID = hrProcessorFrwID;
	}

	public int getHrProcessorLoad() {
		return hrProcessorLoad;
	}

	public void setHrProcessorLoad(int hrProcessorLoad) {
		this.hrProcessorLoad = hrProcessorLoad;
	}

}
