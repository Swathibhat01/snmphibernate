package org.opengoss.snmphibernate.mib.rdbms;

import java.io.Serializable;

import org.opengoss.snmphibernate.api.SmiType;
import org.opengoss.snmphibernate.api.annotation.MibIndex;
import org.opengoss.snmphibernate.api.annotation.MibObjectType;
import org.opengoss.snmphibernate.api.annotation.MibTable;
import org.opengoss.snmphibernate.api.annotation.MibObjectType.Access;

@SuppressWarnings("serial")
@MibTable
public class OraDbConfigEntry implements Serializable {
	@MibIndex(no = 0, length = 1)
	@MibObjectType(oid = "1.3.6.1.2.1.27.1.1.1", smiType = SmiType.INTEGER, access = Access.READ)
	private int applIndex;

	@MibObjectType(oid = "1.3.6.1.4.1.111.4.1.7.1.1", smiType = SmiType.INTEGER, access = Access.READ)
	private int oraDbConfigDbBlockBuffers;// INTEGER(2 - integer (32 bit))

	@MibObjectType(oid = "1.3.6.1.4.1.111.4.1.7.1.2", smiType = SmiType.INTEGER, access = Access.READ)
	private int oraDbConfigDbBlockCkptBatch;// INTEGER(2 - integer (32 bit))

	@MibObjectType(oid = "1.3.6.1.4.1.111.4.1.7.1.3", smiType = SmiType.INTEGER, access = Access.READ)
	private int oraDbConfigDbBlockSize;// INTEGER(2 - integer (32 bit))

	@MibObjectType(oid = "1.3.6.1.4.1.111.4.1.7.1.4", smiType = SmiType.INTEGER, access = Access.READ)
	private int oraDbConfigDbFileSimWrites;// INTEGER(2 - integer (32 bit))

	@MibObjectType(oid = "1.3.6.1.4.1.111.4.1.7.1.5", smiType = SmiType.INTEGER, access = Access.READ)
	private int oraDbConfigDbMultiBlockReadCount;// INTEGER(2 - integer (32
													// bit))

	@MibObjectType(oid = "1.3.6.1.4.1.111.4.1.7.1.6", smiType = SmiType.INTEGER, access = Access.READ)
	private int oraDbConfigDistLockTimeout;// INTEGER(2 - integer (32 bit))

	@MibObjectType(oid = "1.3.6.1.4.1.111.4.1.7.1.7", smiType = SmiType.INTEGER, access = Access.READ)
	private int oraDbConfigDistRecoveryConnectHold;// INTEGER(2 - integer (32
													// bit))

	@MibObjectType(oid = "1.3.6.1.4.1.111.4.1.7.1.8", smiType = SmiType.INTEGER, access = Access.READ)
	private int oraDbConfigDistTransactions;// INTEGER(2 - integer (32 bit))

	@MibObjectType(oid = "1.3.6.1.4.1.111.4.1.7.1.9", smiType = SmiType.INTEGER, access = Access.READ)
	private int oraDbConfigLogArchiveBufferSize;// INTEGER(2 - integer (32 bit))

	@MibObjectType(oid = "1.3.6.1.4.1.111.4.1.7.1.10", smiType = SmiType.INTEGER, access = Access.READ)
	private int oraDbConfigLogArchiveBuffers;// INTEGER(2 - integer (32 bit))

	@MibObjectType(oid = "1.3.6.1.4.1.111.4.1.7.1.11", smiType = SmiType.INTEGER, access = Access.READ)
	private int oraDbConfigLogBuffer;// INTEGER(2 - integer (32 bit))

	@MibObjectType(oid = "1.3.6.1.4.1.111.4.1.7.1.12", smiType = SmiType.INTEGER, access = Access.READ)
	private int oraDbConfigLogCheckpointInterval;// INTEGER(2 - integer (32
													// bit))

	@MibObjectType(oid = "1.3.6.1.4.1.111.4.1.7.1.13", smiType = SmiType.INTEGER, access = Access.READ)
	private int oraDbConfigLogCheckpointTimeout;// INTEGER(2 - integer (32 bit))

	@MibObjectType(oid = "1.3.6.1.4.1.111.4.1.7.1.14", smiType = SmiType.INTEGER, access = Access.READ)
	private int oraDbConfigLogFiles;// INTEGER(2 - integer (32 bit))

	@MibObjectType(oid = "1.3.6.1.4.1.111.4.1.7.1.15", smiType = SmiType.INTEGER, access = Access.READ)
	private int oraDbConfigMaxRollbackSegments;// INTEGER(2 - integer (32 bit))

	@MibObjectType(oid = "1.3.6.1.4.1.111.4.1.7.1.16", smiType = SmiType.INTEGER, access = Access.READ)
	private int oraDbConfigMTSMaxDispatchers;// INTEGER(2 - integer (32 bit))

	@MibObjectType(oid = "1.3.6.1.4.1.111.4.1.7.1.17", smiType = SmiType.INTEGER, access = Access.READ)
	private int oraDbConfigMTSMaxServers;// INTEGER(2 - integer (32 bit))

	@MibObjectType(oid = "1.3.6.1.4.1.111.4.1.7.1.18", smiType = SmiType.INTEGER, access = Access.READ)
	private int oraDbConfigMTSServers;// INTEGER(2 - integer (32 bit))

	@MibObjectType(oid = "1.3.6.1.4.1.111.4.1.7.1.19", smiType = SmiType.INTEGER, access = Access.READ)
	private int oraDbConfigOpenCursors;// INTEGER(2 - integer (32 bit))

	@MibObjectType(oid = "1.3.6.1.4.1.111.4.1.7.1.20", smiType = SmiType.INTEGER, access = Access.READ)
	private int oraDbConfigOpenLinks;// INTEGER(2 - integer (32 bit))

	@MibObjectType(oid = "1.3.6.1.4.1.111.4.1.7.1.21", smiType = SmiType.DISPLAY_STRING, access = Access.READ)
	private String oraDbConfigOptimizerMode;// - DisplayString(4 - octets)

	@MibObjectType(oid = "1.3.6.1.4.1.111.4.1.7.1.22", smiType = SmiType.INTEGER, access = Access.READ)
	private int oraDbConfigProcesses;// INTEGER(2 - integer (32 bit))

	@MibObjectType(oid = "1.3.6.1.4.1.111.4.1.7.1.23", smiType = SmiType.INTEGER, access = Access.READ)
	private int oraDbConfigSerializable;// - TruthValue(2 - integer (32 bit))

	@MibObjectType(oid = "1.3.6.1.4.1.111.4.1.7.1.24", smiType = SmiType.INTEGER, access = Access.READ)
	private int oraDbConfigSessions;// INTEGER(2 - integer (32 bit))

	@MibObjectType(oid = "1.3.6.1.4.1.111.4.1.7.1.25", smiType = SmiType.INTEGER, access = Access.READ)
	private int oraDbConfigSharedPool;// INTEGER(2 - integer (32 bit))

	@MibObjectType(oid = "1.3.6.1.4.1.111.4.1.7.1.26", smiType = SmiType.INTEGER, access = Access.READ)
	private int oraDbConfigSortAreaRetainedSize;// INTEGER(2 - integer (32 bit))

	@MibObjectType(oid = "1.3.6.1.4.1.111.4.1.7.1.27", smiType = SmiType.INTEGER, access = Access.READ)
	private int oraDbConfigSortAreaSize;// INTEGER(2 - integer (32 bit))

	@MibObjectType(oid = "1.3.6.1.4.1.111.4.1.7.1.28", smiType = SmiType.INTEGER, access = Access.READ)
	private int oraDbConfigTransactions;// INTEGER(2 - integer (32 bit))

	@MibObjectType(oid = "1.3.6.1.4.1.111.4.1.7.29", smiType = SmiType.INTEGER, access = Access.READ)
	private int oraDbConfigTransactionsPerRollback;// INTEGER(2 - integer (32
													// bit))

	public int getApplIndex() {
		return applIndex;
	}

	public void setApplIndex(int applIndex) {
		this.applIndex = applIndex;
	}

	public int getOraDbConfigDbBlockBuffers() {
		return oraDbConfigDbBlockBuffers;
	}

	public void setOraDbConfigDbBlockBuffers(int oraDbConfigDbBlockBuffers) {
		this.oraDbConfigDbBlockBuffers = oraDbConfigDbBlockBuffers;
	}

	public int getOraDbConfigDbBlockCkptBatch() {
		return oraDbConfigDbBlockCkptBatch;
	}

	public void setOraDbConfigDbBlockCkptBatch(int oraDbConfigDbBlockCkptBatch) {
		this.oraDbConfigDbBlockCkptBatch = oraDbConfigDbBlockCkptBatch;
	}

	public int getOraDbConfigDbBlockSize() {
		return oraDbConfigDbBlockSize;
	}

	public void setOraDbConfigDbBlockSize(int oraDbConfigDbBlockSize) {
		this.oraDbConfigDbBlockSize = oraDbConfigDbBlockSize;
	}

	public int getOraDbConfigDbFileSimWrites() {
		return oraDbConfigDbFileSimWrites;
	}

	public void setOraDbConfigDbFileSimWrites(int oraDbConfigDbFileSimWrites) {
		this.oraDbConfigDbFileSimWrites = oraDbConfigDbFileSimWrites;
	}

	public int getOraDbConfigDbMultiBlockReadCount() {
		return oraDbConfigDbMultiBlockReadCount;
	}

	public void setOraDbConfigDbMultiBlockReadCount(
			int oraDbConfigDbMultiBlockReadCount) {
		this.oraDbConfigDbMultiBlockReadCount = oraDbConfigDbMultiBlockReadCount;
	}

	public int getOraDbConfigDistLockTimeout() {
		return oraDbConfigDistLockTimeout;
	}

	public void setOraDbConfigDistLockTimeout(int oraDbConfigDistLockTimeout) {
		this.oraDbConfigDistLockTimeout = oraDbConfigDistLockTimeout;
	}

	public int getOraDbConfigDistRecoveryConnectHold() {
		return oraDbConfigDistRecoveryConnectHold;
	}

	public void setOraDbConfigDistRecoveryConnectHold(
			int oraDbConfigDistRecoveryConnectHold) {
		this.oraDbConfigDistRecoveryConnectHold = oraDbConfigDistRecoveryConnectHold;
	}

	public int getOraDbConfigDistTransactions() {
		return oraDbConfigDistTransactions;
	}

	public void setOraDbConfigDistTransactions(int oraDbConfigDistTransactions) {
		this.oraDbConfigDistTransactions = oraDbConfigDistTransactions;
	}

	public int getOraDbConfigLogArchiveBuffers() {
		return oraDbConfigLogArchiveBuffers;
	}

	public void setOraDbConfigLogArchiveBuffers(int oraDbConfigLogArchiveBuffers) {
		this.oraDbConfigLogArchiveBuffers = oraDbConfigLogArchiveBuffers;
	}

	public int getOraDbConfigLogArchiveBufferSize() {
		return oraDbConfigLogArchiveBufferSize;
	}

	public void setOraDbConfigLogArchiveBufferSize(
			int oraDbConfigLogArchiveBufferSize) {
		this.oraDbConfigLogArchiveBufferSize = oraDbConfigLogArchiveBufferSize;
	}

	public int getOraDbConfigLogBuffer() {
		return oraDbConfigLogBuffer;
	}

	public void setOraDbConfigLogBuffer(int oraDbConfigLogBuffer) {
		this.oraDbConfigLogBuffer = oraDbConfigLogBuffer;
	}

	public int getOraDbConfigLogCheckpointInterval() {
		return oraDbConfigLogCheckpointInterval;
	}

	public void setOraDbConfigLogCheckpointInterval(
			int oraDbConfigLogCheckpointInterval) {
		this.oraDbConfigLogCheckpointInterval = oraDbConfigLogCheckpointInterval;
	}

	public int getOraDbConfigLogCheckpointTimeout() {
		return oraDbConfigLogCheckpointTimeout;
	}

	public void setOraDbConfigLogCheckpointTimeout(
			int oraDbConfigLogCheckpointTimeout) {
		this.oraDbConfigLogCheckpointTimeout = oraDbConfigLogCheckpointTimeout;
	}

	public int getOraDbConfigLogFiles() {
		return oraDbConfigLogFiles;
	}

	public void setOraDbConfigLogFiles(int oraDbConfigLogFiles) {
		this.oraDbConfigLogFiles = oraDbConfigLogFiles;
	}

	public int getOraDbConfigMaxRollbackSegments() {
		return oraDbConfigMaxRollbackSegments;
	}

	public void setOraDbConfigMaxRollbackSegments(
			int oraDbConfigMaxRollbackSegments) {
		this.oraDbConfigMaxRollbackSegments = oraDbConfigMaxRollbackSegments;
	}

	public int getOraDbConfigMTSMaxDispatchers() {
		return oraDbConfigMTSMaxDispatchers;
	}

	public void setOraDbConfigMTSMaxDispatchers(int oraDbConfigMTSMaxDispatchers) {
		this.oraDbConfigMTSMaxDispatchers = oraDbConfigMTSMaxDispatchers;
	}

	public int getOraDbConfigMTSMaxServers() {
		return oraDbConfigMTSMaxServers;
	}

	public void setOraDbConfigMTSMaxServers(int oraDbConfigMTSMaxServers) {
		this.oraDbConfigMTSMaxServers = oraDbConfigMTSMaxServers;
	}

	public int getOraDbConfigMTSServers() {
		return oraDbConfigMTSServers;
	}

	public void setOraDbConfigMTSServers(int oraDbConfigMTSServers) {
		this.oraDbConfigMTSServers = oraDbConfigMTSServers;
	}

	public int getOraDbConfigOpenCursors() {
		return oraDbConfigOpenCursors;
	}

	public void setOraDbConfigOpenCursors(int oraDbConfigOpenCursors) {
		this.oraDbConfigOpenCursors = oraDbConfigOpenCursors;
	}

	public int getOraDbConfigOpenLinks() {
		return oraDbConfigOpenLinks;
	}

	public void setOraDbConfigOpenLinks(int oraDbConfigOpenLinks) {
		this.oraDbConfigOpenLinks = oraDbConfigOpenLinks;
	}

	public String getOraDbConfigOptimizerMode() {
		return oraDbConfigOptimizerMode;
	}

	public void setOraDbConfigOptimizerMode(String oraDbConfigOptimizerMode) {
		this.oraDbConfigOptimizerMode = oraDbConfigOptimizerMode;
	}

	public int getOraDbConfigProcesses() {
		return oraDbConfigProcesses;
	}

	public void setOraDbConfigProcesses(int oraDbConfigProcesses) {
		this.oraDbConfigProcesses = oraDbConfigProcesses;
	}

	public int getOraDbConfigSerializable() {
		return oraDbConfigSerializable;
	}

	public void setOraDbConfigSerializable(int oraDbConfigSerializable) {
		this.oraDbConfigSerializable = oraDbConfigSerializable;
	}

	public int getOraDbConfigSessions() {
		return oraDbConfigSessions;
	}

	public void setOraDbConfigSessions(int oraDbConfigSessions) {
		this.oraDbConfigSessions = oraDbConfigSessions;
	}

	public int getOraDbConfigSharedPool() {
		return oraDbConfigSharedPool;
	}

	public void setOraDbConfigSharedPool(int oraDbConfigSharedPool) {
		this.oraDbConfigSharedPool = oraDbConfigSharedPool;
	}

	public int getOraDbConfigSortAreaRetainedSize() {
		return oraDbConfigSortAreaRetainedSize;
	}

	public void setOraDbConfigSortAreaRetainedSize(
			int oraDbConfigSortAreaRetainedSize) {
		this.oraDbConfigSortAreaRetainedSize = oraDbConfigSortAreaRetainedSize;
	}

	public int getOraDbConfigSortAreaSize() {
		return oraDbConfigSortAreaSize;
	}

	public void setOraDbConfigSortAreaSize(int oraDbConfigSortAreaSize) {
		this.oraDbConfigSortAreaSize = oraDbConfigSortAreaSize;
	}

	public int getOraDbConfigTransactions() {
		return oraDbConfigTransactions;
	}

	public void setOraDbConfigTransactions(int oraDbConfigTransactions) {
		this.oraDbConfigTransactions = oraDbConfigTransactions;
	}

	public int getOraDbConfigTransactionsPerRollback() {
		return oraDbConfigTransactionsPerRollback;
	}

	public void setOraDbConfigTransactionsPerRollback(
			int oraDbConfigTransactionsPerRollback) {
		this.oraDbConfigTransactionsPerRollback = oraDbConfigTransactionsPerRollback;
	}

}
