package org.opengoss.snmphibernate.impl.snmp4j;

import org.opengoss.snmphibernate.api.ISnmpTarget;
import org.opengoss.snmphibernate.api.ISnmpTargetFactory;

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
