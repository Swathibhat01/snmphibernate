package org.opengoss.snmphibernate.mib.cisco;

import java.io.Serializable;

import org.opengoss.snmphibernate.api.SmiType;
import org.opengoss.snmphibernate.api.annotation.MibObjectType;
import org.opengoss.snmphibernate.api.annotation.MibObjectType.Access;

@SuppressWarnings("serial")
public class CpuMIB implements Serializable {

	@MibObjectType(oid = "1.3.6.1.4.1.9.2.1.56.0", smiType = SmiType.INTEGER, access = Access.READ)
	private int busyPer;

	@MibObjectType(oid = "1.3.6.1.4.1.9.2.1.57.0", smiType = SmiType.INTEGER, access = Access.READ)
	private int avgBusy1;

	@MibObjectType(oid = "1.3.6.1.4.1.9.2.1.58.0", smiType = SmiType.INTEGER, access = Access.READ)
	private int avgBusy5;
	
	public int getBusyPer() {
		return busyPer;
	}
	
	public void setBusyPer(int busyPer) {
		this.busyPer = busyPer;
	}

	public int getAvgBusy1() {
		return avgBusy1;
	}

	public void setAvgBusy1(int avgBusy1) {
		this.avgBusy1 = avgBusy1;
	}

	public int getAvgBusy5() {
		return avgBusy5;
	}

	public void setAvgBusy5(int avgBusy5) {
		this.avgBusy5 = avgBusy5;
	}

}
