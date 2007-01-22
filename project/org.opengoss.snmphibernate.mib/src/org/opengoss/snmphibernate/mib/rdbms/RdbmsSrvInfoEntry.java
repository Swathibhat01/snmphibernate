package org.opengoss.snmphibernate.mib.rdbms;

import java.io.Serializable;

import org.opengoss.snmphibernate.api.SmiType;
import org.opengoss.snmphibernate.api.annotation.MibIndex;
import org.opengoss.snmphibernate.api.annotation.MibObjectType;
import org.opengoss.snmphibernate.api.annotation.MibTable;
import org.opengoss.snmphibernate.api.annotation.MibObjectType.Access;

@SuppressWarnings("serial")
@MibTable
public class RdbmsSrvInfoEntry implements Serializable {
	@MibIndex(no = 0, length = 1)
	@MibObjectType(oid = "1.3.6.1.2.1.27.1.1.1", smiType = SmiType.INTEGER, access = Access.READ)
	private long applIndex;

	@MibObjectType(oid="1.3.6.1.2.1.39.1.6.1.1", smiType=SmiType.OCTET_STRING, access=Access.READ)
	private byte[] rdbmsSrvInfoStartupTime;// - DateAndTime(4 - octets)

	@MibObjectType(oid="1.3.6.1.2.1.39.1.6.1.2", smiType=SmiType.GAUGE32, access=Access.READ)
	private long rdbmsSrvInfoFinishedTransactions;// - Gauge(66 - gauge (32 bit))

	@MibObjectType(oid="1.3.6.1.2.1.39.1.6.1.3", smiType=SmiType.COUNTER32, access = Access.READ)
	private long rdbmsSrvInfoDiskReads;// Counter(65;//counter (32 bit))

	@MibObjectType(oid="1.3.6.1.2.1.39.1.6.1.4", smiType=SmiType.COUNTER32, access = Access.READ)
	private long rdbmsSrvInfoDiskWrites;// Counter(65 - counter (32 bit))

	@MibObjectType(oid="1.3.6.1.2.1.39.1.6.1.5", smiType=SmiType.COUNTER32, access = Access.READ)
	private long rdbmsSrvInfoLogicalReads;// Counter(65 - counter (32 bit))
	
	@MibObjectType(oid="1.3.6.1.2.1.39.1.6.1.6", smiType=SmiType.COUNTER32, access = Access.READ)
	private long rdbmsSrvInfoLogicalWrites;// Counter(65 - counter (32 bit))

	@MibObjectType(oid="1.3.6.1.2.1.39.1.6.1.7", smiType=SmiType.COUNTER32, access = Access.READ)
	private long rdbmsSrvInfoPageWrites;// Counter(65 - counter (32 bit))

	@MibObjectType(oid="1.3.6.1.2.1.39.1.6.1.8", smiType=SmiType.COUNTER32, access = Access.READ)
	private long rdbmsSrvInfoPageReads;// Counter(65 - counter (32 bit))

	@MibObjectType(oid="1.3.6.1.2.1.39.1.6.1.9", smiType=SmiType.COUNTER32, access = Access.READ)
	private long rdbmsSrvInfoDiskOutOfSpaces;// Counter(65 - counter (32 bit))

	@MibObjectType(oid="1.3.6.1.2.1.39.1.6.1.10", smiType=SmiType.COUNTER32, access = Access.READ)
	private long rdbmsSrvInfoHandledRequests;// Counter(65 - counter (32 bit))

	@MibObjectType(oid="1.3.6.1.2.1.39.1.6.1.11", smiType=SmiType.COUNTER32, access = Access.READ)
	private long rdbmsSrvInfoRequestRecvs;// Counter(65 - counter (32 bit))

	@MibObjectType(oid="1.3.6.1.2.1.39.1.6.1.12", smiType=SmiType.COUNTER32, access = Access.READ)
	private long rdbmsSrvInfoRequestSends;// Counter(65 - counter (32 bit))

	@MibObjectType(oid="1.3.6.1.2.1.39.1.6.1.13", smiType=SmiType.GAUGE32, access = Access.READ)
	private long rdbmsSrvInfoHighwaterInboundAssociations;// Gauge(66 - gauge (32 bit))
	
	@MibObjectType(oid="1.3.6.1.2.1.39.1.6.1.14", smiType=SmiType.GAUGE32, access = Access.READ)
	private long rdbmsSrvInfoMaxInboundAssociations;// Gauge(66 - gauge (32 bit))

	public long getApplIndex() {
		return applIndex;
	}

	public void setApplIndex(long applIndex) {
		this.applIndex = applIndex;
	}

	public long getRdbmsSrvInfoDiskOutOfSpaces() {
		return rdbmsSrvInfoDiskOutOfSpaces;
	}

	public void setRdbmsSrvInfoDiskOutOfSpaces(long rdbmsSrvInfoDiskOutOfSpaces) {
		this.rdbmsSrvInfoDiskOutOfSpaces = rdbmsSrvInfoDiskOutOfSpaces;
	}

	public long getRdbmsSrvInfoDiskReads() {
		return rdbmsSrvInfoDiskReads;
	}

	public void setRdbmsSrvInfoDiskReads(long rdbmsSrvInfoDiskReads) {
		this.rdbmsSrvInfoDiskReads = rdbmsSrvInfoDiskReads;
	}

	public long getRdbmsSrvInfoDiskWrites() {
		return rdbmsSrvInfoDiskWrites;
	}

	public void setRdbmsSrvInfoDiskWrites(long rdbmsSrvInfoDiskWrites) {
		this.rdbmsSrvInfoDiskWrites = rdbmsSrvInfoDiskWrites;
	}

	public long getRdbmsSrvInfoFinishedTransactions() {
		return rdbmsSrvInfoFinishedTransactions;
	}

	public void setRdbmsSrvInfoFinishedTransactions(
			long rdbmsSrvInfoFinishedTransactions) {
		this.rdbmsSrvInfoFinishedTransactions = rdbmsSrvInfoFinishedTransactions;
	}

	public long getRdbmsSrvInfoHandledRequests() {
		return rdbmsSrvInfoHandledRequests;
	}

	public void setRdbmsSrvInfoHandledRequests(long rdbmsSrvInfoHandledRequests) {
		this.rdbmsSrvInfoHandledRequests = rdbmsSrvInfoHandledRequests;
	}

	public long getRdbmsSrvInfoHighwaterInboundAssociations() {
		return rdbmsSrvInfoHighwaterInboundAssociations;
	}

	public void setRdbmsSrvInfoHighwaterInboundAssociations(
			long rdbmsSrvInfoHighwaterInboundAssociations) {
		this.rdbmsSrvInfoHighwaterInboundAssociations = rdbmsSrvInfoHighwaterInboundAssociations;
	}

	public long getRdbmsSrvInfoLogicalReads() {
		return rdbmsSrvInfoLogicalReads;
	}

	public void setRdbmsSrvInfoLogicalReads(long rdbmsSrvInfoLogicalReads) {
		this.rdbmsSrvInfoLogicalReads = rdbmsSrvInfoLogicalReads;
	}

	public long getRdbmsSrvInfoLogicalWrites() {
		return rdbmsSrvInfoLogicalWrites;
	}

	public void setRdbmsSrvInfoLogicalWrites(long rdbmsSrvInfoLogicalWrites) {
		this.rdbmsSrvInfoLogicalWrites = rdbmsSrvInfoLogicalWrites;
	}

	public long getRdbmsSrvInfoMaxInboundAssociations() {
		return rdbmsSrvInfoMaxInboundAssociations;
	}

	public void setRdbmsSrvInfoMaxInboundAssociations(
			long rdbmsSrvInfoMaxInboundAssociations) {
		this.rdbmsSrvInfoMaxInboundAssociations = rdbmsSrvInfoMaxInboundAssociations;
	}

	public long getRdbmsSrvInfoPageReads() {
		return rdbmsSrvInfoPageReads;
	}

	public void setRdbmsSrvInfoPageReads(long rdbmsSrvInfoPageReads) {
		this.rdbmsSrvInfoPageReads = rdbmsSrvInfoPageReads;
	}

	public long getRdbmsSrvInfoPageWrites() {
		return rdbmsSrvInfoPageWrites;
	}

	public void setRdbmsSrvInfoPageWrites(long rdbmsSrvInfoPageWrites) {
		this.rdbmsSrvInfoPageWrites = rdbmsSrvInfoPageWrites;
	}

	public long getRdbmsSrvInfoRequestRecvs() {
		return rdbmsSrvInfoRequestRecvs;
	}

	public void setRdbmsSrvInfoRequestRecvs(long rdbmsSrvInfoRequestRecvs) {
		this.rdbmsSrvInfoRequestRecvs = rdbmsSrvInfoRequestRecvs;
	}

	public long getRdbmsSrvInfoRequestSends() {
		return rdbmsSrvInfoRequestSends;
	}

	public void setRdbmsSrvInfoRequestSends(long rdbmsSrvInfoRequestSends) {
		this.rdbmsSrvInfoRequestSends = rdbmsSrvInfoRequestSends;
	}

	public byte[] getRdbmsSrvInfoStartupTime() {
		return rdbmsSrvInfoStartupTime;
	}

	public void setRdbmsSrvInfoStartupTime(byte[] rdbmsSrvInfoStartupTime) {
		this.rdbmsSrvInfoStartupTime = rdbmsSrvInfoStartupTime;
	}

}
