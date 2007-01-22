package org.opengoss.snmphibernate.mib.rfc1213;

import java.io.Serializable;

import org.opengoss.snmphibernate.api.SmiType;
import org.opengoss.snmphibernate.api.annotation.MibIndex;
import org.opengoss.snmphibernate.api.annotation.MibObjectType;
import org.opengoss.snmphibernate.api.annotation.MibTable;
import org.opengoss.snmphibernate.api.annotation.MibObjectType.Access;

@SuppressWarnings("serial")
@MibTable
public class IpRouteEntry implements Serializable {

	@MibIndex(no = 0, length = 4)
	@MibObjectType(oid = "1.3.6.1.2.1.4.21.1.1", smiType = SmiType.IPADDRESS, access = Access.READ)
	private String ipRouteDest;

	@MibObjectType(oid = "1.3.6.1.2.1.4.21.1.2", smiType = SmiType.INTEGER, access = Access.READ)
	private int ipRouteIfIndex;

	@MibObjectType(oid = "1.3.6.1.2.1.4.21.1.3", smiType = SmiType.INTEGER, access = Access.READ)
	private int ipRouteMetric1;

	@MibObjectType(oid = "1.3.6.1.2.1.4.21.1.4", smiType = SmiType.INTEGER, access = Access.READ)
	private int ipRouteMetric2;

	@MibObjectType(oid = "1.3.6.1.2.1.4.21.1.5", smiType = SmiType.INTEGER, access = Access.READ)
	private int ipRouteMetric3;

	@MibObjectType(oid = "1.3.6.1.2.1.4.21.1.6", smiType = SmiType.INTEGER, access = Access.READ)
	private int ipRouteMetric4;

	@MibObjectType(oid = "1.3.6.1.2.1.4.21.1.7", smiType = SmiType.IPADDRESS, access = Access.READ)
	private String ipRouteNextHop;

	@MibObjectType(oid = "1.3.6.1.2.1.4.21.1.8", smiType = SmiType.INTEGER, access = Access.READ)
	private int ipRouteType;

	@MibObjectType(oid = "1.3.6.1.2.1.4.21.1.9", smiType = SmiType.INTEGER, access = Access.READ)
	private int ipRouteProto;

	@MibObjectType(oid = "1.3.6.1.2.1.4.21.1.10", smiType = SmiType.INTEGER, access = Access.READ)
	private int ipRouteAge;

	@MibObjectType(oid = "1.3.6.1.2.1.4.21.1.11", smiType = SmiType.IPADDRESS, access = Access.READ)
	private String ipRouteMask;

	@MibObjectType(oid = "1.3.6.1.2.1.4.21.1.12", smiType = SmiType.INTEGER, access = Access.READ)
	private int ipRouteMetric5;

	@MibObjectType(oid = "1.3.6.1.2.1.4.21.1.13", smiType = SmiType.OID, access = Access.READ)
	private String ipRouteInfo;

	public int getIpRouteAge() {
		return ipRouteAge;
	}

	public void setIpRouteAge(int ipRouteAge) {
		this.ipRouteAge = ipRouteAge;
	}

	public String getIpRouteDest() {
		return ipRouteDest;
	}

	public void setIpRouteDest(String ipRouteDest) {
		this.ipRouteDest = ipRouteDest;
	}

	public int getIpRouteIfIndex() {
		return ipRouteIfIndex;
	}

	public void setIpRouteIfIndex(int ipRouteIfIndex) {
		this.ipRouteIfIndex = ipRouteIfIndex;
	}

	public String getIpRouteInfo() {
		return ipRouteInfo;
	}

	public void setIpRouteInfo(String ipRouteInfo) {
		this.ipRouteInfo = ipRouteInfo;
	}

	public String getIpRouteMask() {
		return ipRouteMask;
	}

	public void setIpRouteMask(String ipRouteMask) {
		this.ipRouteMask = ipRouteMask;
	}

	public int getIpRouteMetric1() {
		return ipRouteMetric1;
	}

	public void setIpRouteMetric1(int ipRouteMetric1) {
		this.ipRouteMetric1 = ipRouteMetric1;
	}

	public int getIpRouteMetric2() {
		return ipRouteMetric2;
	}

	public void setIpRouteMetric2(int ipRouteMetric2) {
		this.ipRouteMetric2 = ipRouteMetric2;
	}

	public int getIpRouteMetric3() {
		return ipRouteMetric3;
	}

	public void setIpRouteMetric3(int ipRouteMetric3) {
		this.ipRouteMetric3 = ipRouteMetric3;
	}

	public int getIpRouteMetric4() {
		return ipRouteMetric4;
	}

	public void setIpRouteMetric4(int ipRouteMetric4) {
		this.ipRouteMetric4 = ipRouteMetric4;
	}

	public int getIpRouteMetric5() {
		return ipRouteMetric5;
	}

	public void setIpRouteMetric5(int ipRouteMetric5) {
		this.ipRouteMetric5 = ipRouteMetric5;
	}

	public String getIpRouteNextHop() {
		return ipRouteNextHop;
	}

	public void setIpRouteNextHop(String ipRouteNextHop) {
		this.ipRouteNextHop = ipRouteNextHop;
	}

	public int getIpRouteProto() {
		return ipRouteProto;
	}

	public void setIpRouteProto(int ipRouteProto) {
		this.ipRouteProto = ipRouteProto;
	}

	public int getIpRouteType() {
		return ipRouteType;
	}

	public void setIpRouteType(int ipRouteType) {
		this.ipRouteType = ipRouteType;
	}

}
