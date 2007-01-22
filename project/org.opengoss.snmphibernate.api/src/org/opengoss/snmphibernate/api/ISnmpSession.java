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

import java.io.IOException;
import java.io.Serializable;
import java.util.List;

/**
 * Core interface of SnmpHiberate that is used to execute SNMP operations.
 * 
 * @author Ery Lee(ery.lee@gmail.com)
 * @version 1.0
 */
public interface ISnmpSession {

	/**
	 * Get SNMP retries.
	 * 
	 * @return SNMP retries.
	 */
	int getRetries();

	/**
	 * Set SNMP retries.
	 * 
	 * @param retries SNMP retries
	 */
	void setRetries(int retries);

	/**
	 * Get SNMP Timeout.
	 * 
	 * @return SNMP timeout
	 */
	int getTimeout();

	/**
	 * Set SNMP Timeout.
	 * @param timeout SNMP timeout.
	 */
	void setTimeout(int timeout);

	
	/**
	 * Get scalar group.
	 * 
	 * @param scalarClass class of the Java Value Object that represents one scalar group.
	 * 
	 * @return Return an instance of the class.
	 * 
	 * @throws IOException When IO errors occured while communicating.
	 * @throws SnmpException When SNMP errors occured.
	 * @throws SnmpAnnotationException Annotaction Error for your Java Value Object. 
	 */
	<T> T get(Class<T> scalarClass) throws IOException, 
			SnmpException, SnmpAnnotationException;

	/**
	 * Get specified fields of a scalar group.
	 *  
	 * @param scalarClass class of the Java Value Object that represents one scalar group.
	 * @param fields specified fields of the scalar object.
	 * @return Return an instance of the class that only has the specified attributes
	 *  
	 * @throws IOException When IO errors occured while communicating.
	 * @throws SnmpException When SNMP errors occured.
	 * @throws SnmpAnnotationException Annotaction Error for your Java Value Object. 
	 */
	<T> T get(Class<T> scalarClass, String[] fields)
		throws IOException, SnmpException, SnmpAnnotationException;
	/**
	 * Get a whole mib table. 
	 * 
	 * @param entryClass Class of the Java Value Object that represents one mib entry.
	 * 
	 * @return a list of instances of the class.
	 *
	 * @throws IOException When IO errors occured while communicating.
	 * @throws SnmpException When SNMP errors occured.
	 * @throws SnmpAnnotationException Annotaction Error for your Java Value Object. 
	 */
	<T> List<T> getTable(Class<T> entryClass) throws IOException,
			SnmpException, SnmpAnnotationException;
	
	/**
	 * Get a mib entry by index.
	 * 
	 * @param entryClass Class of the Java Value Object that represents one mib entry.
	 * @param indices If there is only one index, this param is the just the object; 
	 * if there are multiple indices, this param is an array.
	 * 
	 * @return a mib entry with whole properties.
	 * 
	 * @throws IOException When IO errors occured while communicating.
	 * @throws SnmpException When SNMP errors occured.
	 * @throws SnmpAnnotationException Annotaction Error for your Java Value Object. 
	 */
	<T> T getByIndex(Class<T> entryClass, Serializable indices) 
		throws IOException, SnmpException, SnmpAnnotationException;

	/**
	 * Get specified fields of a mib entry by index.
	 *  
	 * @param entryClass Class of the Java Value Object that represents one mib entry.
	 * @param indices If there is only one index, this param is the just the object; 
	 * if there are multiple indices, this param is an array.
	 * @param fileds specified fields of the mib entry object. 
	 *  
	 * @throws IOException When IO errors occured while communicating.
	 * @throws SnmpException When SNMP errors occured.
	 * @throws SnmpAnnotationException Annotaction Error for your Java Value Object. 
	 */
	<T> T getByIndex(Class<T> entryClass, Serializable indices, String[] fields) 
		throws IOException, SnmpException, SnmpAnnotationException;

	/**
	 * Set a scalar group or a mib entry.
	 * 
	 * @param object a Java Value Object represents a scalar group or a mib entry. 
	 * 
	 * @throws IOException When IO errors occured while communicating.
	 * @throws SnmpException When SNMP errors occured.
	 * @throws SnmpAnnotationException Annotaction Error for your Java Value Object. 
	 */
	void set(Object object) throws IOException,
			SnmpException,  SnmpAnnotationException;

	/**
	 * Create a mib entry.
	 * 
	 * @param entry a mib entry.
	 * 
	 * @throws IOException When IO errors occured while communicating.
	 * @throws SnmpException When SNMP errors occured.
	 * @throws SnmpAnnotationException Annotaction Error for your Java Value Object. 
	 */
	void create(Object entry) throws IOException, 
			SnmpException,  SnmpAnnotationException;

	/**
	 * Delete a mib entry.
	 * 
	 * @param entry
	 * 
	 * @throws IOException When IO errors occured while communicating.
	 * @throws SnmpException When SNMP errors occured.
	 * @throws SnmpAnnotationException Annotaction Error for your Java Value Object. 
	 */
	void delete(Object entry) throws IOException, 
			SnmpException,  SnmpAnnotationException;

	/**
	 * Close this session.
	 * 
	 * @throws IOException When IO errors occured.
	 */
	void close() throws IOException;

}
