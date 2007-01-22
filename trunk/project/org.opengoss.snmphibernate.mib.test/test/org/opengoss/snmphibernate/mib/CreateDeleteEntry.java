package org.opengoss.snmphibernate.mib;

import java.io.Serializable;

import org.opengoss.snmphibernate.api.SmiType;
import org.opengoss.snmphibernate.api.annotation.MibIndex;
import org.opengoss.snmphibernate.api.annotation.MibObjectType;
import org.opengoss.snmphibernate.api.annotation.MibTable;
import org.opengoss.snmphibernate.api.annotation.RowStatus;
import org.opengoss.snmphibernate.api.annotation.MibObjectType.Access;

@SuppressWarnings("serial")
@MibTable
@RowStatus(oid = "1.3.6.1.2.1.2.2.1.33")
public class CreateDeleteEntry implements Serializable {
	
	@MibIndex(no = 0, length = 1)
	@MibObjectType(oid = "1.3.6.1.2.1.2.2.1.1", smiType = SmiType.INTEGER32, access = Access.READ)
	public int ifIndex;
	
	@MibObjectType(oid = "1.3.6.1.2.1.2.2.1.2", smiType = SmiType.DISPLAY_STRING, access = Access.WRITE)
	public String ifDescr;
}
