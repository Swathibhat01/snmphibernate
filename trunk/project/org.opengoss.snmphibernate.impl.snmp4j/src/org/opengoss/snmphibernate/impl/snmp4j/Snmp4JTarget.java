package org.opengoss.snmphibernate.impl.snmp4j;


import org.opengoss.snmphibernate.api.ISnmpTarget;
import org.snmp4j.CommunityTarget;
import org.snmp4j.Target;
import org.snmp4j.smi.Address;
import org.snmp4j.smi.GenericAddress;
import org.snmp4j.smi.OctetString;

public class Snmp4JTarget implements ISnmpTarget {

	private int port = 161;

	private String ip;
	
	private int version = V2C;
	
	private String community = "public";

	private String writeCommunity = "private";

	public Snmp4JTarget(String ip, int port) {
		this.ip = ip;
		this.port = port;
	}

	public Snmp4JTarget(String ip) {
		this(ip, 161);
	}

	/* (non-Javadoc)
	 * @see org.opengoss.snmphibernate.api.ISnmpTarget#getReadTarget()
	 */
	public Target getReadTarget() {
		return getTarget(community);
	}

	/* (non-Javadoc)
	 * @see org.opengoss.snmphibernate.api.ISnmpTarget#getWriteTarget()
	 */
	public Target getWriteTarget() {
		return getTarget(writeCommunity);
	}

	/* (non-Javadoc)
	 * @see org.opengoss.snmphibernate.api.ISnmpTarget#getCommunity()
	 */
	public String getCommunity() {
		return community;
	}

	/* (non-Javadoc)
	 * @see org.opengoss.snmphibernate.api.ISnmpTarget#setCommunity(java.lang.String)
	 */
	public void setCommunity(String community) {
		this.community = community;
	}

	/* (non-Javadoc)
	 * @see org.opengoss.snmphibernate.api.ISnmpTarget#getIp()
	 */
	public String getIp() {
		return ip;
	}

	/* (non-Javadoc)
	 * @see org.opengoss.snmphibernate.api.ISnmpTarget#setIp(java.lang.String)
	 */
	public void setIp(String ip) {
		this.ip = ip;
	}

	/* (non-Javadoc)
	 * @see org.opengoss.snmphibernate.api.ISnmpTarget#getPort()
	 */
	public int getPort() {
		return port;
	}

	/* (non-Javadoc)
	 * @see org.opengoss.snmphibernate.api.ISnmpTarget#setPort(int)
	 */
	public void setPort(int port) {
		this.port = port;
	}

	/* (non-Javadoc)
	 * @see org.opengoss.snmphibernate.api.ISnmpTarget#getVersion()
	 */
	public int getVersion() {
		return version;
	}

	/* (non-Javadoc)
	 * @see org.opengoss.snmphibernate.api.ISnmpTarget#setVersion(int)
	 */
	public void setVersion(int version) {
		this.version = version;
	}

	/* (non-Javadoc)
	 * @see org.opengoss.snmphibernate.api.ISnmpTarget#getWriteCommunity()
	 */
	public String getWriteCommunity() {
		return writeCommunity;
	}

	/* (non-Javadoc)
	 * @see org.opengoss.snmphibernate.api.ISnmpTarget#setWriteCommunity(java.lang.String)
	 */
	public void setWriteCommunity(String writeCommunity) {
		this.writeCommunity = writeCommunity;
	}
	
	private Target getTarget(String comm) {
		if(version == V1 || version == V2C) {
			Address address = GenericAddress.parse("udp:" + ip + "/" + port);
			CommunityTarget target = new CommunityTarget(address, new OctetString(comm));
			target.setVersion(version);
			return target;
		}
		//TODO: not support snmp v3 now.
		throw new RuntimeException("Do not support snmpv3 now!");		
	}

}
