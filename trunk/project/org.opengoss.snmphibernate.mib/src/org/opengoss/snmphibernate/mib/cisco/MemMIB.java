package org.opengoss.snmphibernate.mib.cisco;

import java.io.Serializable;

import org.opengoss.snmphibernate.api.SmiType;
import org.opengoss.snmphibernate.api.annotation.MibObjectType;
import org.opengoss.snmphibernate.api.annotation.MibObjectType.Access;

@SuppressWarnings("serial")
public class MemMIB implements Serializable {

	@MibObjectType(oid = "1.3.6.1.4.1.9.2.1.8.0", smiType = SmiType.INTEGER, access = Access.READ)
	private int freeMem;//INTEGER
	@MibObjectType(oid = "1.3.6.1.4.1.9.2.1.9.0", smiType = SmiType.INTEGER, access = Access.READ)
	private int bufferElFree;//INTEGER
	@MibObjectType(oid = "1.3.6.1.4.1.9.2.1.10.0", smiType = SmiType.INTEGER, access = Access.READ)
	private int bufferElMax;//INTEGER
	@MibObjectType(oid = "1.3.6.1.4.1.9.2.1.11.0", smiType = SmiType.INTEGER, access = Access.READ)
	private int bufferElHit;// INTEGER
	@MibObjectType(oid = "1.3.6.1.4.1.9.2.1.12.0", smiType = SmiType.INTEGER, access = Access.READ)
	private int bufferElMiss;// INTEGER
	@MibObjectType(oid = "1.3.6.1.4.1.9.2.1.13.0", smiType = SmiType.INTEGER, access = Access.READ)
	private int bufferElCreate;// INTEGER
	@MibObjectType(oid = "1.3.6.1.4.1.9.2.1.14.0", smiType = SmiType.INTEGER, access = Access.READ)
	private int bufferSmSize;// INTEGER
	@MibObjectType(oid = "1.3.6.1.4.1.9.2.1.15.0", smiType = SmiType.INTEGER, access = Access.READ)
	private int bufferSmTotal;// INTEGER
	@MibObjectType(oid = "1.3.6.1.4.1.9.2.1.16.0", smiType = SmiType.INTEGER, access = Access.READ)
	private int bufferSmFree;// INTEGER
	@MibObjectType(oid = "1.3.6.1.4.1.9.2.1.17.0", smiType = SmiType.INTEGER, access = Access.READ)
	private int bufferSmMax;// INTEGER
	@MibObjectType(oid = "1.3.6.1.4.1.9.2.1.18.0", smiType = SmiType.INTEGER, access = Access.READ)
	private int bufferSmHit;// INTEGER
	@MibObjectType(oid = "1.3.6.1.4.1.9.2.1.19.0", smiType = SmiType.INTEGER, access = Access.READ)
	private int bufferSmMiss;// INTEGER
	@MibObjectType(oid = "1.3.6.1.4.1.9.2.1.20.0", smiType = SmiType.INTEGER, access = Access.READ)
	private int bufferSmTrim;// INTEGER
	@MibObjectType(oid = "1.3.6.1.4.1.9.2.1.21.0", smiType = SmiType.INTEGER, access = Access.READ)
	private int bufferSmCreate;// INTEGER
	@MibObjectType(oid = "1.3.6.1.4.1.9.2.1.22.0", smiType = SmiType.INTEGER, access = Access.READ)
	private int bufferMdSize;// INTEGER
	@MibObjectType(oid = "1.3.6.1.4.1.9.2.1.23.0", smiType = SmiType.INTEGER, access = Access.READ)
	private int bufferMdTotal;// INTEGER
	@MibObjectType(oid = "1.3.6.1.4.1.9.2.1.24.0", smiType = SmiType.INTEGER, access = Access.READ)
	private int bufferMdFree;// INTEGER
	@MibObjectType(oid = "1.3.6.1.4.1.9.2.1.25.0", smiType = SmiType.INTEGER, access = Access.READ)
	private int bufferMdMax;// INTEGER
	@MibObjectType(oid = "1.3.6.1.4.1.9.2.1.26.0", smiType = SmiType.INTEGER, access = Access.READ)
	private int bufferMdHit;// INTEGER
	@MibObjectType(oid = "1.3.6.1.4.1.9.2.1.27.0", smiType = SmiType.INTEGER, access = Access.READ)
	private int bufferMdMiss;// INTEGER
	@MibObjectType(oid = "1.3.6.1.4.1.9.2.1.28.0", smiType = SmiType.INTEGER, access = Access.READ)
	private int bufferMdTrim;// INTEGER
	@MibObjectType(oid = "1.3.6.1.4.1.9.2.1.29.0", smiType = SmiType.INTEGER, access = Access.READ)
	private int bufferMdCreate;// INTEGER
	@MibObjectType(oid = "1.3.6.1.4.1.9.2.1.30.0", smiType = SmiType.INTEGER, access = Access.READ)	
	private int bufferBgSize; //INTEGER
	@MibObjectType(oid = "1.3.6.1.4.1.9.2.1.31.0", smiType = SmiType.INTEGER, access = Access.READ)
	private int bufferBgTotal;// INTEGER
	@MibObjectType(oid = "1.3.6.1.4.1.9.2.1.32.0", smiType = SmiType.INTEGER, access = Access.READ)
	private int bufferBgFree;// INTEGER
	@MibObjectType(oid = "1.3.6.1.4.1.9.2.1.33.0", smiType = SmiType.INTEGER, access = Access.READ)
	private int bufferBgMax;// INTEGER
	@MibObjectType(oid = "1.3.6.1.4.1.9.2.1.34.0", smiType = SmiType.INTEGER, access = Access.READ)
	private int bufferBgHit;// INTEGER
	@MibObjectType(oid = "1.3.6.1.4.1.9.2.1.35.0", smiType = SmiType.INTEGER, access = Access.READ)
	private int bufferBgMiss;// INTEGER
	@MibObjectType(oid = "1.3.6.1.4.1.9.2.1.36.0", smiType = SmiType.INTEGER, access = Access.READ)
	private int bufferBgTrim;// INTEGER
	@MibObjectType(oid = "1.3.6.1.4.1.9.2.1.37.0", smiType = SmiType.INTEGER, access = Access.READ)
	private int bufferBgCreate;// INTEGER
	@MibObjectType(oid = "1.3.6.1.4.1.9.2.1.38.0", smiType = SmiType.INTEGER, access = Access.READ)
	private int bufferLgSize;// INTEGER
	@MibObjectType(oid = "1.3.6.1.4.1.9.2.1.39.0", smiType = SmiType.INTEGER, access = Access.READ)
	private int bufferLgTotal;// INTEGER
	@MibObjectType(oid = "1.3.6.1.4.1.9.2.1.40.0", smiType = SmiType.INTEGER, access = Access.READ)
	private int bufferLgFree;// INTEGER
	@MibObjectType(oid = "1.3.6.1.4.1.9.2.1.41.0", smiType = SmiType.INTEGER, access = Access.READ)
	private int bufferLgMax;// INTEGER
	@MibObjectType(oid = "1.3.6.1.4.1.9.2.1.42.0", smiType = SmiType.INTEGER, access = Access.READ)
	private int bufferLgHit;// INTEGER
	@MibObjectType(oid = "1.3.6.1.4.1.9.2.1.43.0", smiType = SmiType.INTEGER, access = Access.READ)
	private int bufferLgMiss;// INTEGER
	@MibObjectType(oid = "1.3.6.1.4.1.9.2.1.44.0", smiType = SmiType.INTEGER, access = Access.READ)
	private int bufferLgTrim;// INTEGER
	@MibObjectType(oid = "1.3.6.1.4.1.9.2.1.45.0", smiType = SmiType.INTEGER, access = Access.READ)
	private int bufferLgCreate;// INTEGER
	@MibObjectType(oid = "1.3.6.1.4.1.9.2.1.46.0", smiType = SmiType.INTEGER, access = Access.READ)
	private int bufferFail;// INTEGER
	@MibObjectType(oid = "1.3.6.1.4.1.9.2.1.47.0", smiType = SmiType.INTEGER, access = Access.READ)
	private int bufferNoMem;// INTEGER

	@MibObjectType(oid = "1.3.6.1.4.1.9.2.1.62.0", smiType = SmiType.INTEGER, access = Access.READ)
	private int bufferHgSize;// INTEGER
	@MibObjectType(oid = "1.3.6.1.4.1.9.2.1.63.0", smiType = SmiType.INTEGER, access = Access.READ)
	private int bufferHgTotal;// INTEGER
	@MibObjectType(oid = "1.3.6.1.4.1.9.2.1.64.0", smiType = SmiType.INTEGER, access = Access.READ)
	private int bufferHgFree;// INTEGER
	@MibObjectType(oid = "1.3.6.1.4.1.9.2.1.65.0", smiType = SmiType.INTEGER, access = Access.READ)
	private int bufferHgMax;// INTEGER
	@MibObjectType(oid = "1.3.6.1.4.1.9.2.1.66.0", smiType = SmiType.INTEGER, access = Access.READ)
	private int bufferHgHit;// INTEGER
	@MibObjectType(oid = "1.3.6.1.4.1.9.2.1.67.0", smiType = SmiType.INTEGER, access = Access.READ)
	private int bufferHgMiss;// INTEGER
	@MibObjectType(oid = "1.3.6.1.4.1.9.2.1.68.0", smiType = SmiType.INTEGER, access = Access.READ)
	private int bufferHgTrim;// INTEGER
	@MibObjectType(oid = "1.3.6.1.4.1.9.2.1.69.0", smiType = SmiType.INTEGER, access = Access.READ)
	private int bufferHgCreate;// INTEGER
	public int getBufferBgCreate() {
		return bufferBgCreate;
	}
	public void setBufferBgCreate(int bufferBgCreate) {
		this.bufferBgCreate = bufferBgCreate;
	}
	public int getBufferBgFree() {
		return bufferBgFree;
	}
	public void setBufferBgFree(int bufferBgFree) {
		this.bufferBgFree = bufferBgFree;
	}
	public int getBufferBgHit() {
		return bufferBgHit;
	}
	public void setBufferBgHit(int bufferBgHit) {
		this.bufferBgHit = bufferBgHit;
	}
	public int getBufferBgMax() {
		return bufferBgMax;
	}
	public void setBufferBgMax(int bufferBgMax) {
		this.bufferBgMax = bufferBgMax;
	}
	public int getBufferBgMiss() {
		return bufferBgMiss;
	}
	public void setBufferBgMiss(int bufferBgMiss) {
		this.bufferBgMiss = bufferBgMiss;
	}
	public int getBufferBgSize() {
		return bufferBgSize;
	}
	public void setBufferBgSize(int bufferBgSize) {
		this.bufferBgSize = bufferBgSize;
	}
	public int getBufferBgTotal() {
		return bufferBgTotal;
	}
	public void setBufferBgTotal(int bufferBgTotal) {
		this.bufferBgTotal = bufferBgTotal;
	}
	public int getBufferBgTrim() {
		return bufferBgTrim;
	}
	public void setBufferBgTrim(int bufferBgTrim) {
		this.bufferBgTrim = bufferBgTrim;
	}
	public int getBufferElCreate() {
		return bufferElCreate;
	}
	public void setBufferElCreate(int bufferElCreate) {
		this.bufferElCreate = bufferElCreate;
	}
	public int getBufferElFree() {
		return bufferElFree;
	}
	public void setBufferElFree(int bufferElFree) {
		this.bufferElFree = bufferElFree;
	}
	public int getBufferElHit() {
		return bufferElHit;
	}
	public void setBufferElHit(int bufferElHit) {
		this.bufferElHit = bufferElHit;
	}
	public int getBufferElMax() {
		return bufferElMax;
	}
	public void setBufferElMax(int bufferElMax) {
		this.bufferElMax = bufferElMax;
	}
	public int getBufferElMiss() {
		return bufferElMiss;
	}
	public void setBufferElMiss(int bufferElMiss) {
		this.bufferElMiss = bufferElMiss;
	}
	public int getBufferFail() {
		return bufferFail;
	}
	public void setBufferFail(int bufferFail) {
		this.bufferFail = bufferFail;
	}
	public int getBufferHgCreate() {
		return bufferHgCreate;
	}
	public void setBufferHgCreate(int bufferHgCreate) {
		this.bufferHgCreate = bufferHgCreate;
	}
	public int getBufferHgFree() {
		return bufferHgFree;
	}
	public void setBufferHgFree(int bufferHgFree) {
		this.bufferHgFree = bufferHgFree;
	}
	public int getBufferHgHit() {
		return bufferHgHit;
	}
	public void setBufferHgHit(int bufferHgHit) {
		this.bufferHgHit = bufferHgHit;
	}
	public int getBufferHgMax() {
		return bufferHgMax;
	}
	public void setBufferHgMax(int bufferHgMax) {
		this.bufferHgMax = bufferHgMax;
	}
	public int getBufferHgMiss() {
		return bufferHgMiss;
	}
	public void setBufferHgMiss(int bufferHgMiss) {
		this.bufferHgMiss = bufferHgMiss;
	}
	public int getBufferHgSize() {
		return bufferHgSize;
	}
	public void setBufferHgSize(int bufferHgSize) {
		this.bufferHgSize = bufferHgSize;
	}
	public int getBufferHgTotal() {
		return bufferHgTotal;
	}
	public void setBufferHgTotal(int bufferHgTotal) {
		this.bufferHgTotal = bufferHgTotal;
	}
	public int getBufferHgTrim() {
		return bufferHgTrim;
	}
	public void setBufferHgTrim(int bufferHgTrim) {
		this.bufferHgTrim = bufferHgTrim;
	}
	public int getBufferLgCreate() {
		return bufferLgCreate;
	}
	public void setBufferLgCreate(int bufferLgCreate) {
		this.bufferLgCreate = bufferLgCreate;
	}
	public int getBufferLgFree() {
		return bufferLgFree;
	}
	public void setBufferLgFree(int bufferLgFree) {
		this.bufferLgFree = bufferLgFree;
	}
	public int getBufferLgHit() {
		return bufferLgHit;
	}
	public void setBufferLgHit(int bufferLgHit) {
		this.bufferLgHit = bufferLgHit;
	}
	public int getBufferLgMax() {
		return bufferLgMax;
	}
	public void setBufferLgMax(int bufferLgMax) {
		this.bufferLgMax = bufferLgMax;
	}
	public int getBufferLgMiss() {
		return bufferLgMiss;
	}
	public void setBufferLgMiss(int bufferLgMiss) {
		this.bufferLgMiss = bufferLgMiss;
	}
	public int getBufferLgSize() {
		return bufferLgSize;
	}
	public void setBufferLgSize(int bufferLgSize) {
		this.bufferLgSize = bufferLgSize;
	}
	public int getBufferLgTotal() {
		return bufferLgTotal;
	}
	public void setBufferLgTotal(int bufferLgTotal) {
		this.bufferLgTotal = bufferLgTotal;
	}
	public int getBufferLgTrim() {
		return bufferLgTrim;
	}
	public void setBufferLgTrim(int bufferLgTrim) {
		this.bufferLgTrim = bufferLgTrim;
	}
	public int getBufferMdCreate() {
		return bufferMdCreate;
	}
	public void setBufferMdCreate(int bufferMdCreate) {
		this.bufferMdCreate = bufferMdCreate;
	}
	public int getBufferMdFree() {
		return bufferMdFree;
	}
	public void setBufferMdFree(int bufferMdFree) {
		this.bufferMdFree = bufferMdFree;
	}
	public int getBufferMdHit() {
		return bufferMdHit;
	}
	public void setBufferMdHit(int bufferMdHit) {
		this.bufferMdHit = bufferMdHit;
	}
	public int getBufferMdMax() {
		return bufferMdMax;
	}
	public void setBufferMdMax(int bufferMdMax) {
		this.bufferMdMax = bufferMdMax;
	}
	public int getBufferMdMiss() {
		return bufferMdMiss;
	}
	public void setBufferMdMiss(int bufferMdMiss) {
		this.bufferMdMiss = bufferMdMiss;
	}
	public int getBufferMdSize() {
		return bufferMdSize;
	}
	public void setBufferMdSize(int bufferMdSize) {
		this.bufferMdSize = bufferMdSize;
	}
	public int getBufferMdTotal() {
		return bufferMdTotal;
	}
	public void setBufferMdTotal(int bufferMdTotal) {
		this.bufferMdTotal = bufferMdTotal;
	}
	public int getBufferMdTrim() {
		return bufferMdTrim;
	}
	public void setBufferMdTrim(int bufferMdTrim) {
		this.bufferMdTrim = bufferMdTrim;
	}
	public int getBufferNoMem() {
		return bufferNoMem;
	}
	public void setBufferNoMem(int bufferNoMem) {
		this.bufferNoMem = bufferNoMem;
	}
	public int getBufferSmCreate() {
		return bufferSmCreate;
	}
	public void setBufferSmCreate(int bufferSmCreate) {
		this.bufferSmCreate = bufferSmCreate;
	}
	public int getBufferSmFree() {
		return bufferSmFree;
	}
	public void setBufferSmFree(int bufferSmFree) {
		this.bufferSmFree = bufferSmFree;
	}
	public int getBufferSmHit() {
		return bufferSmHit;
	}
	public void setBufferSmHit(int bufferSmHit) {
		this.bufferSmHit = bufferSmHit;
	}
	public int getBufferSmMax() {
		return bufferSmMax;
	}
	public void setBufferSmMax(int bufferSmMax) {
		this.bufferSmMax = bufferSmMax;
	}
	public int getBufferSmMiss() {
		return bufferSmMiss;
	}
	public void setBufferSmMiss(int bufferSmMiss) {
		this.bufferSmMiss = bufferSmMiss;
	}
	public int getBufferSmSize() {
		return bufferSmSize;
	}
	public void setBufferSmSize(int bufferSmSize) {
		this.bufferSmSize = bufferSmSize;
	}
	public int getBufferSmTotal() {
		return bufferSmTotal;
	}
	public void setBufferSmTotal(int bufferSmTotal) {
		this.bufferSmTotal = bufferSmTotal;
	}
	public int getBufferSmTrim() {
		return bufferSmTrim;
	}
	public void setBufferSmTrim(int bufferSmTrim) {
		this.bufferSmTrim = bufferSmTrim;
	}
	public int getFreeMem() {
		return freeMem;
	}
	public void setFreeMem(int freeMem) {
		this.freeMem = freeMem;
	}
	

}
