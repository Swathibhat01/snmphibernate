package net.sourceforge.snmphibernate.api;

public interface ISnmpErrorMsgProvider {

	String getErrorMsg(int errorStatus, int errorIndex);

}
