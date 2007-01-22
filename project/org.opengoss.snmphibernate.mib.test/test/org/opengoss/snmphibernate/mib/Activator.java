package org.opengoss.snmphibernate.mib;


import org.opengoss.snmphibernate.api.ISnmpClientFacade;
import org.opengoss.snmphibernate.api.ISnmpSession;
import org.opengoss.snmphibernate.api.ISnmpSessionFactory;
import org.opengoss.snmphibernate.api.ISnmpTargetFactory;
import org.opengoss.snmphibernate.mib.rfc1213.SystemInfo;
import org.osgi.framework.BundleActivator;
import org.osgi.framework.BundleContext;

public class Activator implements BundleActivator {

	public void start(BundleContext context) throws Exception {
		ISnmpClientFacade facade = (ISnmpClientFacade)context.getService(
				context.getServiceReference(ISnmpClientFacade.class.getName()));
		ISnmpSessionFactory sessionFactory = facade.getSnmpSessionFactory();
		ISnmpTargetFactory targetFactory = facade.getSnmpTargetFactory();
		ISnmpSession session = sessionFactory.newSnmpSession(targetFactory.newSnmpTarget("127.0.0.1", 161));
		SystemInfo sys = session.get(SystemInfo.class);
		java.lang.System.out.println(sys.getSysDesc());
		session.close();
	}

	public void stop(BundleContext context) throws Exception {
	}

}
