package org.opengoss.snmphibernate.impl.snmp4j;

import java.util.Dictionary;
import java.util.Hashtable;


import org.opengoss.snmphibernate.api.ISnmpClientFacade;
import org.opengoss.snmphibernate.api.ISnmpTrapD;
import org.osgi.framework.BundleActivator;
import org.osgi.framework.BundleContext;
import org.osgi.framework.ServiceRegistration;

public class Activator implements BundleActivator {

	public ServiceRegistration scFacadeReg;

	public ServiceRegistration trapDReg;
	
	public Snmp4JTrapD trapD;
	
	public void start(BundleContext context) throws Exception {
		//used by opengoss osgi core.
		Dictionary<String, String> props = new Hashtable<String, String>(3);
		props.put("scope", "APPLICATION");
		props.put("uid", "Snmp:SnmpClient");
		ISnmpClientFacade facade = new Snmp4JClientFacade();
		scFacadeReg = context.registerService(ISnmpClientFacade.class.getName(), facade, props);
		if(getBooleanProperty(ISnmpTrapD.TRAPD_ENABLE)) {
			trapD = new Snmp4JTrapD();
			trapD.setListenAddress("udp:0.0.0.0/" + getIntProperty(ISnmpTrapD.TRAPD_PORT, 162));
			trapD.setPoolSize(getIntProperty(ISnmpTrapD.TRAPD_THREAD, 3));
			trapD.start();
			props.put("uid", "Snmp:SnmpTrapd");
			trapDReg = context.registerService(ISnmpTrapD.class.getName(), trapD, props);
		}
	}

	private boolean getBooleanProperty(String key) {
		String property = System.getProperty(key);
		if(property == null) {
			return true;
		}
		return Boolean.parseBoolean(property);
	}

	private int getIntProperty(String key, int defaultVal) {
		String property = System.getProperty(key);
		if(property == null) {
			return defaultVal;
		}
		return Integer.parseInt(property);
	}
	
	public void stop(BundleContext context) throws Exception {
		if(Boolean.getBoolean(ISnmpTrapD.TRAPD_ENABLE)) {
			trapD.stop();
			trapDReg.unregister();
		}
		scFacadeReg.unregister();
	}

}
