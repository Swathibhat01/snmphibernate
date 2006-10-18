package net.sourceforge.snmphibernate.api;

public interface ISnmpTrapHandler {

	boolean onTrapMsg(ISnmpTrapMsg trapMsg);
	
}
