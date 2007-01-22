package org.opengoss.snmphibernate.mib.rdbms;

import java.io.Serializable;

import org.opengoss.snmphibernate.api.SmiType;
import org.opengoss.snmphibernate.api.annotation.MibIndex;
import org.opengoss.snmphibernate.api.annotation.MibObjectType;
import org.opengoss.snmphibernate.api.annotation.MibTable;
import org.opengoss.snmphibernate.api.annotation.MibObjectType.Access;

@SuppressWarnings("serial")
@MibTable
public class OraDbLibraryCacheEntry implements Serializable {

	@MibIndex(no = 0, length = 1)
	@MibObjectType(oid = "1.3.6.1.2.1.27.1.1.1", smiType = SmiType.INTEGER, access = Access.READ)
	private int applIndex;

	@MibIndex(no = 1, length = 1)
	@MibObjectType(oid = "1.3.6.1.4.1.111.4.1.4.1.1", smiType= SmiType.INTEGER, access = Access.READ)
	private int oraDbLibraryCacheIndex;// - INTEGER(2 - integer (32 bit))

	@MibObjectType(oid = "1.3.6.1.4.1.111.4.1.4.1.2", smiType=SmiType.DISPLAY_STRING, access = Access.READ)
	private String oraDbLibraryCacheNameSpace;// DisplayString(4 - octets)

	@MibObjectType(oid = "1.3.6.1.4.1.111.4.1.4.1.3", smiType=SmiType.COUNTER32, access=Access.READ)
	private long oraDbLibraryCacheGets;// Counter(65 - counter (32 bit))

	@MibObjectType(oid = "1.3.6.1.4.1.111.4.1.4.1.4", smiType=SmiType.COUNTER32, access=Access.READ)
	private long oraDbLibraryCacheGetHits;// Counter(65 - counter (32 bit))

	@MibObjectType(oid = "1.3.6.1.4.1.111.4.1.4.1.5", smiType=SmiType.COUNTER32, access=Access.READ)
	private long oraDbLibraryCachePins;// Counter(65 - counter (32 bit))

	@MibObjectType(oid = "1.3.6.1.4.1.111.4.1.4.1.6", smiType=SmiType.COUNTER32, access=Access.READ)
	private long oraDbLibraryCachePinHits;// Counter(65 - counter (32 bit))

	@MibObjectType(oid = "1.3.6.1.4.1.111.4.1.4.1.7", smiType=SmiType.COUNTER32, access=Access.READ)
	private long oraDbLibraryCacheReloads;// Counter(65 - counter (32 bit))

	@MibObjectType(oid = "1.3.6.1.4.1.111.4.1.4.1.8", smiType=SmiType.COUNTER32, access=Access.READ)
	private long oraDbLibraryCacheInvalidations;// Counter(65 - counter (32 bit))

	public int getApplIndex() {
		return applIndex;
	}

	public void setApplIndex(int applIndex) {
		this.applIndex = applIndex;
	}

	public long getOraDbLibraryCacheGetHits() {
		return oraDbLibraryCacheGetHits;
	}

	public void setOraDbLibraryCacheGetHits(long oraDbLibraryCacheGetHits) {
		this.oraDbLibraryCacheGetHits = oraDbLibraryCacheGetHits;
	}

	public long getOraDbLibraryCacheGets() {
		return oraDbLibraryCacheGets;
	}

	public void setOraDbLibraryCacheGets(long oraDbLibraryCacheGets) {
		this.oraDbLibraryCacheGets = oraDbLibraryCacheGets;
	}

	public int getOraDbLibraryCacheIndex() {
		return oraDbLibraryCacheIndex;
	}

	public void setOraDbLibraryCacheIndex(int oraDbLibraryCacheIndex) {
		this.oraDbLibraryCacheIndex = oraDbLibraryCacheIndex;
	}

	public long getOraDbLibraryCacheInvalidations() {
		return oraDbLibraryCacheInvalidations;
	}

	public void setOraDbLibraryCacheInvalidations(
			long oraDbLibraryCacheInvalidations) {
		this.oraDbLibraryCacheInvalidations = oraDbLibraryCacheInvalidations;
	}

	public String getOraDbLibraryCacheNameSpace() {
		return oraDbLibraryCacheNameSpace;
	}

	public void setOraDbLibraryCacheNameSpace(String oraDbLibraryCacheNameSpace) {
		this.oraDbLibraryCacheNameSpace = oraDbLibraryCacheNameSpace;
	}

	public long getOraDbLibraryCachePinHits() {
		return oraDbLibraryCachePinHits;
	}

	public void setOraDbLibraryCachePinHits(long oraDbLibraryCachePinHits) {
		this.oraDbLibraryCachePinHits = oraDbLibraryCachePinHits;
	}

	public long getOraDbLibraryCachePins() {
		return oraDbLibraryCachePins;
	}

	public void setOraDbLibraryCachePins(long oraDbLibraryCachePins) {
		this.oraDbLibraryCachePins = oraDbLibraryCachePins;
	}

	public long getOraDbLibraryCacheReloads() {
		return oraDbLibraryCacheReloads;
	}

	public void setOraDbLibraryCacheReloads(long oraDbLibraryCacheReloads) {
		this.oraDbLibraryCacheReloads = oraDbLibraryCacheReloads;
	}

}
