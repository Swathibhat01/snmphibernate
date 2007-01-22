package org.opengoss.snmphibernate.mib.cisco;

import java.io.Serializable;

import org.opengoss.snmphibernate.api.SmiType;
import org.opengoss.snmphibernate.api.annotation.MibObjectType;
import org.opengoss.snmphibernate.api.annotation.MibObjectType.Access;

@SuppressWarnings("serial")
public class SysMIB implements Serializable {
	
	@MibObjectType(oid = "1.3.6.1.4.1.9.2.1.3", smiType = SmiType.DISPLAY_STRING, access = Access.READ)
	private String hostName;//	DisplayString
	@MibObjectType(oid = "1.3.6.1.4.1.9.2.1.4", smiType = SmiType.DISPLAY_STRING, access = Access.READ)
	private String domainName;//	DisplayString
	@MibObjectType(oid = "1.3.6.1.4.1.9.2.1.5", smiType = SmiType.IPADDRESS, access = Access.READ)
	private String authAddr;//	IpAddress
	@MibObjectType(oid = "1.3.6.1.4.1.9.2.1.6", smiType = SmiType.IPADDRESS, access = Access.READ)
	private String bootHost;//	IpAddress
	@MibObjectType(oid = "1.3.6.1.4.1.9.2.1.48", smiType = SmiType.IPADDRESS, access = Access.READ)	
	private String netConfigAddr;//	IpAddress
	@MibObjectType(oid = "1.3.6.1.4.1.9.2.1.49", smiType = SmiType.DISPLAY_STRING, access = Access.READ)	
	private String netConfigName;//	DisplayString
	@MibObjectType(oid = "1.3.6.1.4.1.9.2.1.50", smiType = SmiType.DISPLAY_STRING, access = Access.READ)
	private String netConfigSet;//	DisplayString
	@MibObjectType(oid = "1.3.6.1.4.1.9.2.1.51", smiType = SmiType.IPADDRESS, access = Access.READ)
	private String hostConfigAddr;//	IpAddress
	@MibObjectType(oid = "1.3.6.1.4.1.9.2.1.52", smiType = SmiType.DISPLAY_STRING, access = Access.READ)
	private String hostConfigName;//	DisplayString
	public String getAuthAddr() {
		return authAddr;
	}
	public void setAuthAddr(String authAddr) {
		this.authAddr = authAddr;
	}
	public String getBootHost() {
		return bootHost;
	}
	public void setBootHost(String bootHost) {
		this.bootHost = bootHost;
	}
	public String getDomainName() {
		return domainName;
	}
	public void setDomainName(String domainName) {
		this.domainName = domainName;
	}
	public String getHostConfigAddr() {
		return hostConfigAddr;
	}
	public void setHostConfigAddr(String hostConfigAddr) {
		this.hostConfigAddr = hostConfigAddr;
	}
	public String getHostConfigName() {
		return hostConfigName;
	}
	public void setHostConfigName(String hostConfigName) {
		this.hostConfigName = hostConfigName;
	}
	public String getHostName() {
		return hostName;
	}
	public void setHostName(String hostName) {
		this.hostName = hostName;
	}
	public String getNetConfigAddr() {
		return netConfigAddr;
	}
	public void setNetConfigAddr(String netConfigAddr) {
		this.netConfigAddr = netConfigAddr;
	}
	public String getNetConfigName() {
		return netConfigName;
	}
	public void setNetConfigName(String netConfigName) {
		this.netConfigName = netConfigName;
	}
	public String getNetConfigSet() {
		return netConfigSet;
	}
	public void setNetConfigSet(String netConfigSet) {
		this.netConfigSet = netConfigSet;
	}

}
