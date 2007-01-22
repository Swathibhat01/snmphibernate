package org.opengoss.snmphibernate.mib.rfc1213;

import java.io.Serializable;

import org.opengoss.snmphibernate.api.SmiType;
import org.opengoss.snmphibernate.api.annotation.MibObjectType;
import org.opengoss.snmphibernate.api.annotation.MibObjectType.Access;

@SuppressWarnings("serial")
public class IpInfo implements Serializable {
//	1: forwarding(1) 
// 	2: not-forwarding(2) 
	@MibObjectType(oid = "1.3.6.1.2.1.4.1.0", smiType = SmiType.INTEGER, access = Access.READ)
	private int ipForwarding;
	@MibObjectType(oid = "1.3.6.1.2.1.4.2.0", smiType = SmiType.INTEGER, access = Access.READ)
	private int ipDefaultTTL;
	@MibObjectType(oid = "1.3.6.1.2.1.4.3.0", smiType = SmiType.COUNTER32, access = Access.READ)
	private long ipInReceives;
	@MibObjectType(oid = "1.3.6.1.2.1.4.4.0", smiType = SmiType.COUNTER32, access = Access.READ)
	private long ipInHdrErrors;
	@MibObjectType(oid = "1.3.6.1.2.1.4.5.0", smiType = SmiType.COUNTER32, access = Access.READ)
	private long ipInAddrErrors;
	@MibObjectType(oid = "1.3.6.1.2.1.4.6.0", smiType = SmiType.COUNTER32, access = Access.READ)
	private long ipForwDatagrams;
	@MibObjectType(oid = "1.3.6.1.2.1.4.7.0", smiType = SmiType.COUNTER32, access = Access.READ)
	private long ipInUnknownProtos;
	@MibObjectType(oid = "1.3.6.1.2.1.4.8.0", smiType = SmiType.COUNTER32, access = Access.READ)
	private long ipInDiscards;
	@MibObjectType(oid = "1.3.6.1.2.1.4.9.0", smiType = SmiType.COUNTER32, access = Access.READ)
	private long ipInDelivers;
	@MibObjectType(oid = "1.3.6.1.2.1.4.10.0", smiType = SmiType.COUNTER32, access = Access.READ)
	private long ipOutRequests;
	@MibObjectType(oid = "1.3.6.1.2.1.4.11.0", smiType = SmiType.COUNTER32, access = Access.READ)
	private long ipOutDiscards;
	@MibObjectType(oid = "1.3.6.1.2.1.4.12.0", smiType = SmiType.COUNTER32, access = Access.READ)
	private long ipOutNoRoutes;
	@MibObjectType(oid = "1.3.6.1.2.1.4.13.0", smiType = SmiType.INTEGER, access = Access.READ)
	private int ipReasmTimeout;
	@MibObjectType(oid = "1.3.6.1.2.1.4.14.0", smiType = SmiType.COUNTER32, access = Access.READ)
	private long ipReasmReqds;
	@MibObjectType(oid = "1.3.6.1.2.1.4.15.0", smiType = SmiType.COUNTER32, access = Access.READ)
	private long ipReasmOKs;
	@MibObjectType(oid = "1.3.6.1.2.1.4.16.0", smiType = SmiType.COUNTER32, access = Access.READ)
	private long ipReasmFails;
	@MibObjectType(oid = "1.3.6.1.2.1.4.17.0", smiType = SmiType.COUNTER32, access = Access.READ)
	private long ipFragOKs;
	@MibObjectType(oid = "1.3.6.1.2.1.4.18.0", smiType = SmiType.COUNTER32, access = Access.READ)
	private long ipFragFails;
	@MibObjectType(oid = "1.3.6.1.2.1.4.19.0", smiType = SmiType.COUNTER32, access = Access.READ)
	private long ipFragCreates;
	@MibObjectType(oid = "1.3.6.1.2.1.4.23.0", smiType = SmiType.COUNTER32, access = Access.READ)
	private long ipRoutingDiscards;
	public int getIpDefaultTTL() {
		return ipDefaultTTL;
	}
	public void setIpDefaultTTL(int ipDefaultTTL) {
		this.ipDefaultTTL = ipDefaultTTL;
	}
	public int getIpForwarding() {
		return ipForwarding;
	}
	public void setIpForwarding(int ipForwarding) {
		this.ipForwarding = ipForwarding;
	}
	public long getIpForwDatagrams() {
		return ipForwDatagrams;
	}
	public void setIpForwDatagrams(long ipForwDatagrams) {
		this.ipForwDatagrams = ipForwDatagrams;
	}
	public long getIpFragCreates() {
		return ipFragCreates;
	}
	public void setIpFragCreates(long ipFragCreates) {
		this.ipFragCreates = ipFragCreates;
	}
	public long getIpFragFails() {
		return ipFragFails;
	}
	public void setIpFragFails(long ipFragFails) {
		this.ipFragFails = ipFragFails;
	}
	public long getIpFragOKs() {
		return ipFragOKs;
	}
	public void setIpFragOKs(long ipFragOKs) {
		this.ipFragOKs = ipFragOKs;
	}
	public long getIpInAddrErrors() {
		return ipInAddrErrors;
	}
	public void setIpInAddrErrors(long ipInAddrErrors) {
		this.ipInAddrErrors = ipInAddrErrors;
	}
	public long getIpInDelivers() {
		return ipInDelivers;
	}
	public void setIpInDelivers(long ipInDelivers) {
		this.ipInDelivers = ipInDelivers;
	}
	public long getIpInDiscards() {
		return ipInDiscards;
	}
	public void setIpInDiscards(long ipInDiscards) {
		this.ipInDiscards = ipInDiscards;
	}
	public long getIpInHdrErrors() {
		return ipInHdrErrors;
	}
	public void setIpInHdrErrors(long ipInHdrErrors) {
		this.ipInHdrErrors = ipInHdrErrors;
	}
	public long getIpInReceives() {
		return ipInReceives;
	}
	public void setIpInReceives(long ipInReceives) {
		this.ipInReceives = ipInReceives;
	}
	public long getIpInUnknownProtos() {
		return ipInUnknownProtos;
	}
	public void setIpInUnknownProtos(long ipInUnknownProtos) {
		this.ipInUnknownProtos = ipInUnknownProtos;
	}
	public long getIpOutDiscards() {
		return ipOutDiscards;
	}
	public void setIpOutDiscards(long ipOutDiscards) {
		this.ipOutDiscards = ipOutDiscards;
	}
	public long getIpOutNoRoutes() {
		return ipOutNoRoutes;
	}
	public void setIpOutNoRoutes(long ipOutNoRoutes) {
		this.ipOutNoRoutes = ipOutNoRoutes;
	}
	public long getIpOutRequests() {
		return ipOutRequests;
	}
	public void setIpOutRequests(long ipOutRequests) {
		this.ipOutRequests = ipOutRequests;
	}
	public long getIpReasmFails() {
		return ipReasmFails;
	}
	public void setIpReasmFails(long ipReasmFails) {
		this.ipReasmFails = ipReasmFails;
	}
	public long getIpReasmOKs() {
		return ipReasmOKs;
	}
	public void setIpReasmOKs(long ipReasmOKs) {
		this.ipReasmOKs = ipReasmOKs;
	}
	public long getIpReasmReqds() {
		return ipReasmReqds;
	}
	public void setIpReasmReqds(long ipReasmReqds) {
		this.ipReasmReqds = ipReasmReqds;
	}
	public int getIpReasmTimeout() {
		return ipReasmTimeout;
	}
	public void setIpReasmTimeout(int ipReasmTimeout) {
		this.ipReasmTimeout = ipReasmTimeout;
	}
	public long getIpRoutingDiscards() {
		return ipRoutingDiscards;
	}
	public void setIpRoutingDiscards(long ipRoutingDiscards) {
		this.ipRoutingDiscards = ipRoutingDiscards;
	}
}
