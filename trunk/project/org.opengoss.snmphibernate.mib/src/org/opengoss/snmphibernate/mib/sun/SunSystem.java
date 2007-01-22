package org.opengoss.snmphibernate.mib.sun;

import java.io.Serializable;

import org.opengoss.snmphibernate.api.SmiType;
import org.opengoss.snmphibernate.api.annotation.MibObjectType;
import org.opengoss.snmphibernate.api.annotation.MibObjectType.Access;

@SuppressWarnings("serial")
public class SunSystem implements Serializable {

	@MibObjectType(oid = "1.3.6.1.4.1.42.3.1.1.0", smiType = SmiType.DISPLAY_STRING, access = Access.READ)
	private String agentDescr;

	@MibObjectType(oid = "1.3.6.1.4.1.42.3.1.2.0", smiType = SmiType.DISPLAY_STRING, access = Access.READ)
	private String hostId;

	@MibObjectType(oid = "1.3.6.1.4.1.42.3.1.3.0", smiType = SmiType.DISPLAY_STRING, access = Access.READ)
	private String motd;

	@MibObjectType(oid = "1.3.6.1.4.1.42.3.1.4.0", smiType = SmiType.COUNTER32, access = Access.READ)
	private long unixTime;

	public String getAgentDescr() {
		return agentDescr;
	}

	public void setAgentDescr(String agentDescr) {
		this.agentDescr = agentDescr;
	}

	public String getHostId() {
		return hostId;
	}

	public void setHostId(String hostId) {
		this.hostId = hostId;
	}

	public String getMotd() {
		return motd;
	}

	public void setMotd(String motd) {
		this.motd = motd;
	}

	public long getUnixTime() {
		return unixTime;
	}

	public void setUnixTime(long unixTime) {
		this.unixTime = unixTime;
	}

}
