/*
 * Copyright 2005-2006 the original authors and www.opengoss.org community.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package org.opengoss.snmphibernate.api;

import java.util.Map;

/**
 * SNMP trap message.
 * 
 * @author erylee
 */
public interface ISnmpTrapMsg {
	/**
	 *  Message type.
	 */
	String MSG_TYPE = "msg_type";
	/**
	 *  Ipaddress of the node that sends the trap.
	 */
	String NODE_ADDR = "node_addr";
	/**
	 * Trap OID
	 */
	String TRAP_OID = "trap_oid";
	
	/**
	 * V1 Trap enterprise oid.
	 */
	String ENTERPRISE = "enterprise";
	/**
	 * V1 Trap agent_addr.
	 */
	String AGENT_ADDR = "agent_addr";

	/** V1 Trap generic-trap     
			INTEGER {
			coldStart(0),
			warmStart(1),
			linkDown(2),
			linkUp(3),
			authenticationFailure(4),
			egpNeighborLoss(5),
			enterpriseSpecific(6)
			},
	*/
	String GENERIC_TRAP = "generic_trap";
	/**
	 * V1 Trap specific-trap
	 */
	String SPECIFIC_TRAP = "specific_trap";
	
	/**
	 * V1 Trap time_stamp
	 */
	String TIME_STAMP = "time_stamp";

	String RECEIVED_TIME = "received_time";
	/**
	 *  Get the ip address of the node that sends the trap.
	 *  @return peer address
	 */
	String getPeerAddr();

	/**
	 * Get the trap oid. 
	 * 
	 * @return trap oid.
	 */
	String getTrapOid();
	/**
	 * Get the value map.
	 * 
	 * @return value map
	 */
	Map<String, Object> toMap();

}
