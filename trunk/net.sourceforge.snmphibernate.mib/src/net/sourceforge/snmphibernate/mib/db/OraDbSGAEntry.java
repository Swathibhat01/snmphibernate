package net.sourceforge.snmphibernate.mib.db;

import java.io.Serializable;

import net.sourceforge.snmphibernate.api.SmiType;
import net.sourceforge.snmphibernate.api.annotation.MibIndex;
import net.sourceforge.snmphibernate.api.annotation.MibObjectType;
import net.sourceforge.snmphibernate.api.annotation.MibTable;
import net.sourceforge.snmphibernate.api.annotation.MibObjectType.Access;

@SuppressWarnings("serial")
@MibTable
public class OraDbSGAEntry implements Serializable {
	
	@MibIndex(no = 0, length = 1)
	@MibObjectType(oid = "1.3.6.1.2.1.27.1.1.1", smiType = SmiType.INTEGER, access = Access.READ)
	private int applIndex; 
	
	@MibObjectType(oid="1.3.6.1.4.1.111.4.1.6.1.1", smiType=SmiType.INTEGER, access = Access.READ)
	private int oraDbSGAFixedSize;// - INTEGER(2 - integer (32 bit))
	
	@MibObjectType(oid = "1.3.6.1.4.1.111.4.1.6.1.2", smiType=SmiType.INTEGER, access = Access.READ)
	private int oraDbSGAVariableSize;// - INTEGER(2 - integer (32 bit))
	
	@MibObjectType(oid = "1.3.6.1.4.1.111.4.1.6.1.3", smiType=SmiType.INTEGER, access = Access.READ)
	private int oraDbSGADatabaseBuffers;// - INTEGER(2 - integer (32 bit))
	
	@MibObjectType(oid = "1.3.6.1.4.1.111.4.1.6.1.4", smiType=SmiType.INTEGER, access= Access.READ)
	private int oraDbSGARedoBuffers;// - INTEGER(2 - integer (32 bit))

	public int getApplIndex() {
		return applIndex;
	}

	public void setApplIndex(int applIndex) {
		this.applIndex = applIndex;
	}

	public int getOraDbSGADatabaseBuffers() {
		return oraDbSGADatabaseBuffers;
	}

	public void setOraDbSGADatabaseBuffers(int oraDbSGADatabaseBuffers) {
		this.oraDbSGADatabaseBuffers = oraDbSGADatabaseBuffers;
	}

	public int getOraDbSGAFixedSize() {
		return oraDbSGAFixedSize;
	}

	public void setOraDbSGAFixedSize(int oraDbSGAFixedSize) {
		this.oraDbSGAFixedSize = oraDbSGAFixedSize;
	}

	public int getOraDbSGARedoBuffers() {
		return oraDbSGARedoBuffers;
	}

	public void setOraDbSGARedoBuffers(int oraDbSGARedoBuffers) {
		this.oraDbSGARedoBuffers = oraDbSGARedoBuffers;
	}

	public int getOraDbSGAVariableSize() {
		return oraDbSGAVariableSize;
	}

	public void setOraDbSGAVariableSize(int oraDbSGAVariableSize) {
		this.oraDbSGAVariableSize = oraDbSGAVariableSize;
	}

}
