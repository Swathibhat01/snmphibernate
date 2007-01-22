package org.opengoss.snmphibernate.mib.rdbms;

import java.io.Serializable;

import org.opengoss.snmphibernate.api.SmiType;
import org.opengoss.snmphibernate.api.annotation.MibIndex;
import org.opengoss.snmphibernate.api.annotation.MibObjectType;
import org.opengoss.snmphibernate.api.annotation.MibTable;
import org.opengoss.snmphibernate.api.annotation.MibObjectType.Access;

@SuppressWarnings("serial")
@MibTable
public class OraDbLibraryCacheSumEntry implements Serializable {
	
	@MibIndex(no = 0, length = 1)
	@MibObjectType(oid = "1.3.6.1.2.1.27.1.1.1", smiType = SmiType.INTEGER, access = Access.READ)
	private int applIndex;

	@MibObjectType(oid = "1.3.6.1.4.1.111.4.1.5.1.1", smiType = SmiType.COUNTER32, access = Access.READ)
	private long oraDbLibraryCacheSumGets;// ;//Counter(65 - counter (32 bit))

	@MibObjectType(oid = "1.3.6.1.4.1.111.4.1.5.1.2", smiType = SmiType.COUNTER32, access = Access.READ)
	private long oraDbLibraryCacheSumGetHits;// Counter(65 - counter (32
												// bit))

	@MibObjectType(oid = "1.3.6.1.4.1.111.4.1.5.1.3", smiType = SmiType.COUNTER32, access = Access.READ)
	private long oraDbLibraryCacheSumPins;// Counter(65 - counter (32 bit))

	@MibObjectType(oid = "1.3.6.1.4.1.111.4.1.5.1.4", smiType = SmiType.COUNTER32, access = Access.READ)
	private long oraDbLibraryCacheSumPinHits;// Counter(65 - counter (32
												// bit))

	@MibObjectType(oid = "1.3.6.1.4.1.111.4.1.5.1.5", smiType = SmiType.COUNTER32, access = Access.READ)
	private long oraDbLibraryCacheSumReloads;// Counter(65 - counter (32
												// bit))

	@MibObjectType(oid = "1.3.6.1.4.1.111.4.1.5.1.6", smiType = SmiType.COUNTER32, access = Access.READ)
	private long oraDbLibraryCacheSumInvalidations;// Counter(65 - counter (32
													// bit))
	public int getApplIndex() {
		return applIndex;
	}

	public void setApplIndex(int applIndex) {
		this.applIndex = applIndex;
	}

	public long getOraDbLibraryCacheSumGetHits() {
		return oraDbLibraryCacheSumGetHits;
	}

	public void setOraDbLibraryCacheSumGetHits(long oraDbLibraryCacheSumGetHits) {
		this.oraDbLibraryCacheSumGetHits = oraDbLibraryCacheSumGetHits;
	}

	public long getOraDbLibraryCacheSumGets() {
		return oraDbLibraryCacheSumGets;
	}

	public void setOraDbLibraryCacheSumGets(long oraDbLibraryCacheSumGets) {
		this.oraDbLibraryCacheSumGets = oraDbLibraryCacheSumGets;
	}

	public long getOraDbLibraryCacheSumInvalidations() {
		return oraDbLibraryCacheSumInvalidations;
	}

	public void setOraDbLibraryCacheSumInvalidations(
			long oraDbLibraryCacheSumInvalidations) {
		this.oraDbLibraryCacheSumInvalidations = oraDbLibraryCacheSumInvalidations;
	}

	public long getOraDbLibraryCacheSumPinHits() {
		return oraDbLibraryCacheSumPinHits;
	}

	public void setOraDbLibraryCacheSumPinHits(long oraDbLibraryCacheSumPinHits) {
		this.oraDbLibraryCacheSumPinHits = oraDbLibraryCacheSumPinHits;
	}

	public long getOraDbLibraryCacheSumPins() {
		return oraDbLibraryCacheSumPins;
	}

	public void setOraDbLibraryCacheSumPins(long oraDbLibraryCacheSumPins) {
		this.oraDbLibraryCacheSumPins = oraDbLibraryCacheSumPins;
	}

	public long getOraDbLibraryCacheSumReloads() {
		return oraDbLibraryCacheSumReloads;
	}

	public void setOraDbLibraryCacheSumReloads(long oraDbLibraryCacheSumReloads) {
		this.oraDbLibraryCacheSumReloads = oraDbLibraryCacheSumReloads;
	}

}
