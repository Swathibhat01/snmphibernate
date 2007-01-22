package org.opengoss.snmphibernate.mib.cisco;

import java.io.Serializable;

import org.opengoss.snmphibernate.api.SmiType;
import org.opengoss.snmphibernate.api.annotation.MibObjectType;
import org.opengoss.snmphibernate.api.annotation.MibObjectType.Access;

@SuppressWarnings("serial")
public class FlashMIB implements Serializable {

	@MibObjectType(oid = "1.3.6.1.4.1.9.2.10.1.0", smiType = SmiType.INTEGER, access = Access.READ)
	private int flashSize;// INTEGER

	@MibObjectType(oid = "1.3.6.1.4.1.9.2.10.2.0", smiType = SmiType.INTEGER, access = Access.READ)
	private int flashFree;// INTEGER

	@MibObjectType(oid = "1.3.6.1.4.1.9.2.10.3.0", smiType = SmiType.DISPLAY_STRING, access = Access.READ)
	private String flashController;// DISPLAY STRING

	@MibObjectType(oid = "1.3.6.1.4.1.9.2.10.4.0", smiType = SmiType.DISPLAY_STRING, access = Access.READ)
	private int flashCard;// DisplayString

	@MibObjectType(oid = "1.3.6.1.4.1.9.2.10.5.0", smiType = SmiType.INTEGER, access = Access.READ)
	private int flashVPP;// INTEGER

	@MibObjectType(oid = "1.3.6.1.4.1.9.2.10.15.0", smiType = SmiType.INTEGER, access = Access.READ)
	private int flashStatus;// INTEGER

	@MibObjectType(oid = "1.3.6.1.4.1.9.2.10.16.0", smiType = SmiType.INTEGER, access = Access.READ)
	private int flashEntries;// INTEGER

	public int getFlashCard() {
		return flashCard;
	}

	public void setFlashCard(int flashCard) {
		this.flashCard = flashCard;
	}

	public String getFlashController() {
		return flashController;
	}

	public void setFlashController(String flashController) {
		this.flashController = flashController;
	}

	public int getFlashEntries() {
		return flashEntries;
	}

	public void setFlashEntries(int flashEntries) {
		this.flashEntries = flashEntries;
	}

	public int getFlashFree() {
		return flashFree;
	}

	public void setFlashFree(int flashFree) {
		this.flashFree = flashFree;
	}

	public int getFlashSize() {
		return flashSize;
	}

	public void setFlashSize(int flashSize) {
		this.flashSize = flashSize;
	}

	public int getFlashStatus() {
		return flashStatus;
	}

	public void setFlashStatus(int flashStatus) {
		this.flashStatus = flashStatus;
	}

	public int getFlashVPP() {
		return flashVPP;
	}

	public void setFlashVPP(int flashVPP) {
		this.flashVPP = flashVPP;
	}

}
