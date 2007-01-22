/*
 * Copyright 2005-2006 the original authors and www.opengoss.org community.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package org.opengoss.snmphibernate.api;

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
	 * @see org.opengoss.snmphibernate.api.ISnmpTarget#getCommunity()
	 */
	public String getCommunity() {
		return community;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see org.opengoss.snmphibernate.api.ISnmpTarget#setCommunity(java.lang.String)
	 */
	public void setCommunity(String community) {
		this.community = community;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see org.opengoss.snmphibernate.api.ISnmpTarget#getIp()
	 */
	public String getIp() {
		return ip;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see org.opengoss.snmphibernate.api.ISnmpTarget#setIp(java.lang.String)
	 */
	public void setIp(String ip) {
		this.ip = ip;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see org.opengoss.snmphibernate.api.ISnmpTarget#getPort()
	 */
	public int getPort() {
		return port;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see org.opengoss.snmphibernate.api.ISnmpTarget#setPort(int)
	 */
	public void setPort(int port) {
		this.port = port;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see org.opengoss.snmphibernate.api.ISnmpTarget#getVersion()
	 */
	public int getVersion() {
		return version;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see org.opengoss.snmphibernate.api.ISnmpTarget#setVersion(int)
	 */
	public void setVersion(int version) {
		this.version = version;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see org.opengoss.snmphibernate.api.ISnmpTarget#getWriteCommunity()
	 */
	public String getWriteCommunity() {
		return writeCommunity;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see org.opengoss.snmphibernate.api.ISnmpTarget#setWriteCommunity(java.lang.String)
	 */
	public void setWriteCommunity(String writeCommunity) {
		this.writeCommunity = writeCommunity;
	}
}
