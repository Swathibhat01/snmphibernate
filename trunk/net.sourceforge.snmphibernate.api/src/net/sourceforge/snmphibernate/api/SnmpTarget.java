package net.sourceforge.snmphibernate.api;

public class SnmpTarget implements ISnmpTarget {
	
	private int port = 161;

	private String ip;

	private int version = V2C;

	private String community = "public";

	private String writeCommunity = "private";

	public SnmpTarget(String ip, int port) {
		this.ip = ip;
		this.port = port;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see net.sourceforge.snmphibernate.api.ISnmpTarget#getCommunity()
	 */
	public String getCommunity() {
		return community;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see net.sourceforge.snmphibernate.api.ISnmpTarget#setCommunity(java.lang.String)
	 */
	public void setCommunity(String community) {
		this.community = community;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see net.sourceforge.snmphibernate.api.ISnmpTarget#getIp()
	 */
	public String getIp() {
		return ip;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see net.sourceforge.snmphibernate.api.ISnmpTarget#setIp(java.lang.String)
	 */
	public void setIp(String ip) {
		this.ip = ip;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see net.sourceforge.snmphibernate.api.ISnmpTarget#getPort()
	 */
	public int getPort() {
		return port;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see net.sourceforge.snmphibernate.api.ISnmpTarget#setPort(int)
	 */
	public void setPort(int port) {
		this.port = port;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see net.sourceforge.snmphibernate.api.ISnmpTarget#getVersion()
	 */
	public int getVersion() {
		return version;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see net.sourceforge.snmphibernate.api.ISnmpTarget#setVersion(int)
	 */
	public void setVersion(int version) {
		this.version = version;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see net.sourceforge.snmphibernate.api.ISnmpTarget#getWriteCommunity()
	 */
	public String getWriteCommunity() {
		return writeCommunity;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see net.sourceforge.snmphibernate.api.ISnmpTarget#setWriteCommunity(java.lang.String)
	 */
	public void setWriteCommunity(String writeCommunity) {
		this.writeCommunity = writeCommunity;
	}
}
