package net.sourceforge.snmphibernate.mib;

import net.sourceforge.snmphibernate.api.ISnmpClientFacade;
import net.sourceforge.snmphibernate.api.ISnmpSession;
import net.sourceforge.snmphibernate.api.ISnmpSessionFactory;
import net.sourceforge.snmphibernate.api.ISnmpTargetFactory;

import org.osgi.framework.BundleActivator;
import org.osgi.framework.BundleContext;

public class Activator implements BundleActivator {

	public void start(BundleContext context) throws Exception {
		ISnmpClientFacade facade = (ISnmpClientFacade)context.getService(
				context.getServiceReference(ISnmpClientFacade.class.getName()));
		ISnmpSessionFactory sessionFactory = facade.getSnmpSessionFactory();
		ISnmpTargetFactory targetFactory = facade.getSnmpTargetFactory();
		ISnmpSession session = sessionFactory.newSnmpSession(targetFactory.newSnmpTarget("127.0.0.1", 161));
		System sys = session.get(System.class);
		java.lang.System.out.println(sys.getSysDesc());
		session.close();
	}

	public void stop(BundleContext context) throws Exception {
	}

}
