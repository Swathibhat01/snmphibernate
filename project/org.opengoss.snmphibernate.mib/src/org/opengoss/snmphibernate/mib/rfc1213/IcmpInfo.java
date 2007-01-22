package org.opengoss.snmphibernate.mib.rfc1213;

import java.io.Serializable;

import org.opengoss.snmphibernate.api.SmiType;
import org.opengoss.snmphibernate.api.annotation.MibObjectType;
import org.opengoss.snmphibernate.api.annotation.MibObjectType.Access;

@SuppressWarnings("serial")
public class IcmpInfo implements Serializable {
	@MibObjectType(oid = "1.3.6.1.2.1.5.1.0", smiType = SmiType.COUNTER32, access = Access.READ)
	private long icmpInMsgs;

	@MibObjectType(oid = "1.3.6.1.2.1.5.2.0", smiType = SmiType.COUNTER32, access = Access.READ)
	private long icmpInErrors;

	@MibObjectType(oid = "1.3.6.1.2.1.5.3.0", smiType = SmiType.COUNTER32, access = Access.READ)
	private long icmpInDestUnreachs;

	@MibObjectType(oid = "1.3.6.1.2.1.5.4.0", smiType = SmiType.COUNTER32, access = Access.READ)
	private long icmpInTimeExcds;

	@MibObjectType(oid = "1.3.6.1.2.1.5.5.0", smiType = SmiType.COUNTER32, access = Access.READ)
	private long icmpInParmProbs;

	@MibObjectType(oid = "1.3.6.1.2.1.5.6.0", smiType = SmiType.COUNTER32, access = Access.READ)
	private long icmpInSrcQuenchs;

	@MibObjectType(oid = "1.3.6.1.2.1.5.7.0", smiType = SmiType.COUNTER32, access = Access.READ)
	private long icmpInRedirects;

	@MibObjectType(oid = "1.3.6.1.2.1.5.8.0", smiType = SmiType.COUNTER32, access = Access.READ)
	private long icmpInEchos;

	@MibObjectType(oid = "1.3.6.1.2.1.5.9.0", smiType = SmiType.COUNTER32, access = Access.READ)
	private long icmpInEchoReps;

	@MibObjectType(oid = "1.3.6.1.2.1.5.10.0", smiType = SmiType.COUNTER32, access = Access.READ)
	private long icmpInTimestamps;

	@MibObjectType(oid = "1.3.6.1.2.1.5.11.0", smiType = SmiType.COUNTER32, access = Access.READ)
	private long icmpInTimestampReps;

	@MibObjectType(oid = "1.3.6.1.2.1.5.12.0", smiType = SmiType.COUNTER32, access = Access.READ)
	private long icmpInAddrMasks;

	@MibObjectType(oid = "1.3.6.1.2.1.5.13.0", smiType = SmiType.COUNTER32, access = Access.READ)
	private long icmpInAddrMaskReps;

	@MibObjectType(oid = "1.3.6.1.2.1.5.14.0", smiType = SmiType.COUNTER32, access = Access.READ)
	private long icmpOutMsgs;

	@MibObjectType(oid = "1.3.6.1.2.1.5.15.0", smiType = SmiType.COUNTER32, access = Access.READ)
	private long icmpOutErrors;

	@MibObjectType(oid = "1.3.6.1.2.1.5.16.0", smiType = SmiType.COUNTER32, access = Access.READ)
	private long icmpOutDestUnreachs;

	@MibObjectType(oid = "1.3.6.1.2.1.5.17.0", smiType = SmiType.COUNTER32, access = Access.READ)
	private long icmpOutTimeExcds;

	@MibObjectType(oid = "1.3.6.1.2.1.5.18.0", smiType = SmiType.COUNTER32, access = Access.READ)
	private long icmpOutParmProbs;

	@MibObjectType(oid = "1.3.6.1.2.1.5.19.0", smiType = SmiType.COUNTER32, access = Access.READ)
	private long icmpOutSrcQuenchs;

	@MibObjectType(oid = "1.3.6.1.2.1.5.20.0", smiType = SmiType.COUNTER32, access = Access.READ)
	private long icmpOutRedirects;

	@MibObjectType(oid = "1.3.6.1.2.1.5.21.0", smiType = SmiType.COUNTER32, access = Access.READ)
	private long icmpOutEchos;

	@MibObjectType(oid = "1.3.6.1.2.1.5.22.0", smiType = SmiType.COUNTER32, access = Access.READ)
	private long icmpOutEchoReps;

	@MibObjectType(oid = "1.3.6.1.2.1.5.23.0", smiType = SmiType.COUNTER32, access = Access.READ)
	private long icmpOutTimestamps;

	@MibObjectType(oid = "1.3.6.1.2.1.5.24.0", smiType = SmiType.COUNTER32, access = Access.READ)
	private long icmpOutTimestampReps;

	@MibObjectType(oid = "1.3.6.1.2.1.5.25.0", smiType = SmiType.COUNTER32, access = Access.READ)
	private long icmpOutAddrMasks;

	@MibObjectType(oid = "1.3.6.1.2.1.5.26.0", smiType = SmiType.COUNTER32, access = Access.READ)
	private long icmpOutAddrMaskReps;

	public long getIcmpInAddrMaskReps() {
		return icmpInAddrMaskReps;
	}

	public void setIcmpInAddrMaskReps(long icmpInAddrMaskReps) {
		this.icmpInAddrMaskReps = icmpInAddrMaskReps;
	}

	public long getIcmpInAddrMasks() {
		return icmpInAddrMasks;
	}

	public void setIcmpInAddrMasks(long icmpInAddrMasks) {
		this.icmpInAddrMasks = icmpInAddrMasks;
	}

	public long getIcmpInDestUnreachs() {
		return icmpInDestUnreachs;
	}

	public void setIcmpInDestUnreachs(long icmpInDestUnreachs) {
		this.icmpInDestUnreachs = icmpInDestUnreachs;
	}

	public long getIcmpInEchoReps() {
		return icmpInEchoReps;
	}

	public void setIcmpInEchoReps(long icmpInEchoReps) {
		this.icmpInEchoReps = icmpInEchoReps;
	}

	public long getIcmpInEchos() {
		return icmpInEchos;
	}

	public void setIcmpInEchos(long icmpInEchos) {
		this.icmpInEchos = icmpInEchos;
	}

	public long getIcmpInErrors() {
		return icmpInErrors;
	}

	public void setIcmpInErrors(long icmpInErrors) {
		this.icmpInErrors = icmpInErrors;
	}

	public long getIcmpInMsgs() {
		return icmpInMsgs;
	}

	public void setIcmpInMsgs(long icmpInMsgs) {
		this.icmpInMsgs = icmpInMsgs;
	}

	public long getIcmpInParmProbs() {
		return icmpInParmProbs;
	}

	public void setIcmpInParmProbs(long icmpInParmProbs) {
		this.icmpInParmProbs = icmpInParmProbs;
	}

	public long getIcmpInRedirects() {
		return icmpInRedirects;
	}

	public void setIcmpInRedirects(long icmpInRedirects) {
		this.icmpInRedirects = icmpInRedirects;
	}

	public long getIcmpInSrcQuenchs() {
		return icmpInSrcQuenchs;
	}

	public void setIcmpInSrcQuenchs(long icmpInSrcQuenchs) {
		this.icmpInSrcQuenchs = icmpInSrcQuenchs;
	}

	public long getIcmpInTimeExcds() {
		return icmpInTimeExcds;
	}

	public void setIcmpInTimeExcds(long icmpInTimeExcds) {
		this.icmpInTimeExcds = icmpInTimeExcds;
	}

	public long getIcmpInTimestampReps() {
		return icmpInTimestampReps;
	}

	public void setIcmpInTimestampReps(long icmpInTimestampReps) {
		this.icmpInTimestampReps = icmpInTimestampReps;
	}

	public long getIcmpInTimestamps() {
		return icmpInTimestamps;
	}

	public void setIcmpInTimestamps(long icmpInTimestamps) {
		this.icmpInTimestamps = icmpInTimestamps;
	}

	public long getIcmpOutAddrMaskReps() {
		return icmpOutAddrMaskReps;
	}

	public void setIcmpOutAddrMaskReps(long icmpOutAddrMaskReps) {
		this.icmpOutAddrMaskReps = icmpOutAddrMaskReps;
	}

	public long getIcmpOutAddrMasks() {
		return icmpOutAddrMasks;
	}

	public void setIcmpOutAddrMasks(long icmpOutAddrMasks) {
		this.icmpOutAddrMasks = icmpOutAddrMasks;
	}

	public long getIcmpOutDestUnreachs() {
		return icmpOutDestUnreachs;
	}

	public void setIcmpOutDestUnreachs(long icmpOutDestUnreachs) {
		this.icmpOutDestUnreachs = icmpOutDestUnreachs;
	}

	public long getIcmpOutEchoReps() {
		return icmpOutEchoReps;
	}

	public void setIcmpOutEchoReps(long icmpOutEchoReps) {
		this.icmpOutEchoReps = icmpOutEchoReps;
	}

	public long getIcmpOutEchos() {
		return icmpOutEchos;
	}

	public void setIcmpOutEchos(long icmpOutEchos) {
		this.icmpOutEchos = icmpOutEchos;
	}

	public long getIcmpOutErrors() {
		return icmpOutErrors;
	}

	public void setIcmpOutErrors(long icmpOutErrors) {
		this.icmpOutErrors = icmpOutErrors;
	}

	public long getIcmpOutMsgs() {
		return icmpOutMsgs;
	}

	public void setIcmpOutMsgs(long icmpOutMsgs) {
		this.icmpOutMsgs = icmpOutMsgs;
	}

	public long getIcmpOutParmProbs() {
		return icmpOutParmProbs;
	}

	public void setIcmpOutParmProbs(long icmpOutParmProbs) {
		this.icmpOutParmProbs = icmpOutParmProbs;
	}

	public long getIcmpOutRedirects() {
		return icmpOutRedirects;
	}

	public void setIcmpOutRedirects(long icmpOutRedirects) {
		this.icmpOutRedirects = icmpOutRedirects;
	}

	public long getIcmpOutSrcQuenchs() {
		return icmpOutSrcQuenchs;
	}

	public void setIcmpOutSrcQuenchs(long icmpOutSrcQuenchs) {
		this.icmpOutSrcQuenchs = icmpOutSrcQuenchs;
	}

	public long getIcmpOutTimeExcds() {
		return icmpOutTimeExcds;
	}

	public void setIcmpOutTimeExcds(long icmpOutTimeExcds) {
		this.icmpOutTimeExcds = icmpOutTimeExcds;
	}

	public long getIcmpOutTimestampReps() {
		return icmpOutTimestampReps;
	}

	public void setIcmpOutTimestampReps(long icmpOutTimestampReps) {
		this.icmpOutTimestampReps = icmpOutTimestampReps;
	}

	public long getIcmpOutTimestamps() {
		return icmpOutTimestamps;
	}

	public void setIcmpOutTimestamps(long icmpOutTimestamps) {
		this.icmpOutTimestamps = icmpOutTimestamps;
	}

}
