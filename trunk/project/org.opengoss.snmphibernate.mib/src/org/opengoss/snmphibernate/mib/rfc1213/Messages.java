package org.opengoss.snmphibernate.mib.rfc1213;

import java.util.ResourceBundle;

public class Messages {
	
	static final String BUNDLE_NAME = "net.sourceforge.snmphibernate.mib.rfc1213.messages"; //$NON-NLS-1$
	
	static ResourceBundle  bundle = ResourceBundle.getBundle("BUNDLE_NAME");
	
	public static final String getLocaleString(String key) {
		try {
			return bundle.getString(key);
		} catch (RuntimeException e) {
			return "!" + key + "!";
		}
	}
	
}
