package net.sourceforge.snmphibernate.api;

public interface ISnmpTrapD {
	
	String TRAPD_ENABLE = "net.sourceforge.snmphibernate.trapd.enable";

	String TRAPD_PORT = "net.sourceforge.snmphibernate.trapd.port";

	String TRAPD_THREAD = "net.sourceforge.snmphibernate.trapd.thread";

	void start() throws Exception;

	void addTrapHandler(ISnmpTrapHandler handler);
	
	void removeTrapHandler(ISnmpTrapHandler handler);
	
	void stop() throws Exception;
	
}
