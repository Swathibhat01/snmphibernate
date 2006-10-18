package net.sourceforge.snmphibernate.api;

public interface ISnmpTargetFactory {

	ISnmpTarget newSnmpTarget(String ip);
	
	ISnmpTarget newSnmpTarget(String ip, int port);
	
}
