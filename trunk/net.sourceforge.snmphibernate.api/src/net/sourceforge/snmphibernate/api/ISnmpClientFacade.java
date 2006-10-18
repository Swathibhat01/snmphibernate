package net.sourceforge.snmphibernate.api;

/**
 * Facade of SnmpHiberate API
 * 
 * @author ery.lee@gmail.com
 */
public interface ISnmpClientFacade {
	
	/**
	 * Create SNMP Session Factory.
	 * 
	 * @return SNMP Session Factory.
	 */
	ISnmpSessionFactory getSnmpSessionFactory();
	
	/**
	 * Create SNMP Target Factory.
	 * 
	 * @return SNMP Target Factory.
	 */
	ISnmpTargetFactory getSnmpTargetFactory();
	
}
