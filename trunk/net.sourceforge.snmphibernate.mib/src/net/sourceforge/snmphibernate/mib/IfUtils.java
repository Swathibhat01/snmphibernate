package net.sourceforge.snmphibernate.mib;

import java.util.HashMap;

public class IfUtils {

	static final IfType[] ifTypes = { 
		new IfType(1, "Other"),
		new IfType(2, "Regular1822"), 
		new IfType(3, "hdh1822"),
		new IfType(4, "ddn-x25"), 
		new IfType(5, "rfc877-x25"),
		new IfType(6, "ethernet-csmacd"), 
		new IfType(7, "iso88023-csmacd"),
		new IfType(8, "iso88024-tokenBus"),
		new IfType(9, "iso88025-tokenRing"),
		new IfType(10, "iso88026-man"), 
		new IfType(11, "starLan"),
		new IfType(12, "proteon-10Mbit"), 
		new IfType(13, "proteon-80Mbit"),
		new IfType(14, "hyperchannel"), 
		new IfType(15, "fddi"),
		new IfType(16, "lapb"),
		new IfType(17, "sdlc"),
		new IfType(18, "ds1"),
		new IfType(19, "e1"),
		new IfType(20, "basicISDN"),
		new IfType(21, "primaryISDN"),
		new IfType(22, "propPointToPointSerial"),
		new IfType(23, "ppp"),
		new IfType(24, "softwareLoopback"), 
		new IfType(25, "eon"),
		new IfType(26, "ethernet-3Mbit"), 
		new IfType(27, "nsip"),
		new IfType(28, "slip"), 
		new IfType(29, "ultra"),
		new IfType(30, "ds3"), 
		new IfType(31, "sip"),
		new IfType(32, "frame-relay"),
	};
	
	static HashMap<Integer, String> typesMap = new HashMap<Integer, String>();
	static {
		for (IfType ifType : ifTypes) {
			typesMap.put(ifType.id, ifType.label);
		}
	}
	
	
	public static String getOperStatus(int ifOperStatus) {
		if (ifOperStatus == 1) {
			return "已启用";
		}
		if (ifOperStatus == 2) {
			return "未启用";
		}
		return "未知" + ifOperStatus;
	}

	public static String getAdminStatus(int ifAdminStatus) {
		if (ifAdminStatus == 1) {
			return "启用";
		}
		if (ifAdminStatus == 2) {
			return "禁用";
		}
		return "未知" + ifAdminStatus;
	}


	public static String getTypeLabel(int type) {
		return typesMap.get(type);
	}
	
	static final class IfType {
		int id;

		String label;

		public IfType(int id, String label) {
			this.id = id;
			this.label = label;
		}
	}
}
