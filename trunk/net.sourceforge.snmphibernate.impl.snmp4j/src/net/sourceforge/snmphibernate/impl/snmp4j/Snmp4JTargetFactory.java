package net.sourceforge.snmphibernate.impl.snmp4j;

import net.sourceforge.snmphibernate.api.ISnmpTarget;
import net.sourceforge.snmphibernate.api.ISnmpTargetFactory;

public class Snmp4JTargetFactory implements ISnmpTargetFactory {
	
	public Snmp4JTargetFactory() {
	}

	public ISnmpTarget newSnmpTarget(String ip) {
		return new Snmp4JTarget(ip);
	}

	public ISnmpTarget newSnmpTarget(String ip, int port) {
		return new Snmp4JTarget(ip, port);
	}

}
