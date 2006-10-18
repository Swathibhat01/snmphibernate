package net.sourceforge.snmphibernate.api;

public interface ISnmpTarget {
	
	int V1 = 0;

	int V2C = 1;

	int V3 = 3;

	String getCommunity();

	void setCommunity(String community);

	String getIp();

	void setIp(String ip);

	int getPort();

	void setPort(int port);

	int getVersion();

	void setVersion(int version);

	String getWriteCommunity();

	void setWriteCommunity(String writeCommunity);

}