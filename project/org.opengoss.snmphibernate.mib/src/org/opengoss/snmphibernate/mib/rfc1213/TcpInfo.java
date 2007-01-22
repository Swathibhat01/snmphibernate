package org.opengoss.snmphibernate.mib.rfc1213;

import java.io.Serializable;

import org.opengoss.snmphibernate.api.SmiType;
import org.opengoss.snmphibernate.api.annotation.MibObjectType;
import org.opengoss.snmphibernate.api.annotation.MibObjectType.Access;

@SuppressWarnings("serial")
public class TcpInfo implements Serializable {

//	1: other(1) 
// 	2: constant(2) 
// 	3: rsre(3) 
// 	4: vanj(4) 
	@MibObjectType(oid = "1.3.6.1.2.1.6.1.0", smiType = SmiType.INTEGER, access = Access.READ)
	private int tcpRtoAlgorithm;

	@MibObjectType(oid = "1.3.6.1.2.1.6.2.0", smiType = SmiType.INTEGER, access = Access.READ)
	private int tcpRtoMin;

	@MibObjectType(oid = "1.3.6.1.2.1.6.3.0", smiType = SmiType.INTEGER, access = Access.READ)
	private int tcpRtoMax;

	@MibObjectType(oid = "1.3.6.1.2.1.6.4.0", smiType = SmiType.INTEGER, access = Access.READ)
	private int tcpMaxConn;

	@MibObjectType(oid = "1.3.6.1.2.1.6.5.0", smiType = SmiType.COUNTER32, access = Access.READ)
	private long tcpActiveOpens;

	@MibObjectType(oid = "1.3.6.1.2.1.6.6.0", smiType = SmiType.COUNTER32, access = Access.READ)
	private long tcpPassiveOpen;

	@MibObjectType(oid = "1.3.6.1.2.1.6.7.0", smiType = SmiType.COUNTER32, access = Access.READ)
	private long tcpAttemptFails;

	@MibObjectType(oid = "1.3.6.1.2.1.6.8.0", smiType = SmiType.COUNTER32, access = Access.READ)
	private long tcpEstabResets;

	@MibObjectType(oid = "1.3.6.1.2.1.6.9.0", smiType = SmiType.GAUGE32, access = Access.READ)
	private long tcpCurrEstab;

	@MibObjectType(oid = "1.3.6.1.2.1.6.10.0", smiType = SmiType.COUNTER32, access = Access.READ)
	private long tcpInSegs;

	@MibObjectType(oid = "1.3.6.1.2.1.6.11.0", smiType = SmiType.COUNTER32, access = Access.READ)
	private long tcpOutSegs;

	@MibObjectType(oid = "1.3.6.1.2.1.6.12.0", smiType = SmiType.COUNTER32, access = Access.READ)
	private long tcpRetransSegs;

	@MibObjectType(oid = "1.3.6.1.2.1.6.14.0", smiType = SmiType.COUNTER32, access = Access.READ)
	private long tcpInErrs;

	@MibObjectType(oid = "1.3.6.1.2.1.6.15.0", smiType = SmiType.COUNTER32, access = Access.READ)
	private long tcpOutRsts;

	public long getTcpActiveOpens() {
		return tcpActiveOpens;
	}

	public void setTcpActiveOpens(long tcpActiveOpens) {
		this.tcpActiveOpens = tcpActiveOpens;
	}

	public long getTcpAttemptFails() {
		return tcpAttemptFails;
	}

	public void setTcpAttemptFails(long tcpAttemptFails) {
		this.tcpAttemptFails = tcpAttemptFails;
	}

	public long getTcpCurrEstab() {
		return tcpCurrEstab;
	}

	public void setTcpCurrEstab(long tcpCurrEstab) {
		this.tcpCurrEstab = tcpCurrEstab;
	}

	public long getTcpEstabResets() {
		return tcpEstabResets;
	}

	public void setTcpEstabResets(long tcpEstabResets) {
		this.tcpEstabResets = tcpEstabResets;
	}

	public long getTcpInErrs() {
		return tcpInErrs;
	}

	public void setTcpInErrs(long tcpInErrs) {
		this.tcpInErrs = tcpInErrs;
	}

	public long getTcpInSegs() {
		return tcpInSegs;
	}

	public void setTcpInSegs(long tcpInSegs) {
		this.tcpInSegs = tcpInSegs;
	}

	public int getTcpMaxConn() {
		return tcpMaxConn;
	}

	public void setTcpMaxConn(int tcpMaxConn) {
		this.tcpMaxConn = tcpMaxConn;
	}

	public long getTcpOutRsts() {
		return tcpOutRsts;
	}

	public void setTcpOutRsts(long tcpOutRsts) {
		this.tcpOutRsts = tcpOutRsts;
	}

	public long getTcpOutSegs() {
		return tcpOutSegs;
	}

	public void setTcpOutSegs(long tcpOutSegs) {
		this.tcpOutSegs = tcpOutSegs;
	}

	public long getTcpPassiveOpen() {
		return tcpPassiveOpen;
	}

	public void setTcpPassiveOpen(long tcpPassiveOpen) {
		this.tcpPassiveOpen = tcpPassiveOpen;
	}

	public long getTcpRetransSegs() {
		return tcpRetransSegs;
	}

	public void setTcpRetransSegs(long tcpRetransSegs) {
		this.tcpRetransSegs = tcpRetransSegs;
	}

	public int getTcpRtoAlgorithm() {
		return tcpRtoAlgorithm;
	}

	public void setTcpRtoAlgorithm(int tcpRtoAlgorithm) {
		this.tcpRtoAlgorithm = tcpRtoAlgorithm;
	}

	public int getTcpRtoMax() {
		return tcpRtoMax;
	}

	public void setTcpRtoMax(int tcpRtoMax) {
		this.tcpRtoMax = tcpRtoMax;
	}

	public int getTcpRtoMin() {
		return tcpRtoMin;
	}

	public void setTcpRtoMin(int tcpRtoMin) {
		this.tcpRtoMin = tcpRtoMin;
	}
}
