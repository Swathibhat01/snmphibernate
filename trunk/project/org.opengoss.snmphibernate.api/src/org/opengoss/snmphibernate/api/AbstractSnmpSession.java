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

public abstract class AbstractSnmpSession implements ISnmpSession {

	private int retries = 3;

	private int timeout = 3000;

	private ISmiTypeProvider smiTypeProvider;

	private ISnmpErrorMsgProvider errorMsgProvider;

	/*
	 * (non-Javadoc)
	 * 
	 * @see org.opengoss.snmphibernate.api.ISnmpTarget#getRetries()
	 */
	public int getRetries() {
		return retries;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see org.opengoss.snmphibernate.api.ISnmpTarget#setRetries(int)
	 */
	public void setRetries(int retries) {
		this.retries = retries;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see org.opengoss.snmphibernate.api.ISnmpTarget#getTimeout()
	 */
	public int getTimeout() {
		return timeout;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see org.opengoss.snmphibernate.api.ISnmpTarget#setTimeout(int)
	 */
	public void setTimeout(int timeout) {
		this.timeout = timeout;
	}

	public void setSmiTypeProvider(ISmiTypeProvider typeProvider) {
		this.smiTypeProvider = typeProvider;
	}

	public void setSnmpErrorMsgProvider(ISnmpErrorMsgProvider errorMsgProvider) {
		this.errorMsgProvider = errorMsgProvider;
	}

	protected final ISmiTypeProvider getSmiTypeProvider() {
		return smiTypeProvider;
	}

	protected final ISnmpErrorMsgProvider getSnmpErrorMsgProvider() {
		return errorMsgProvider;
	}
}
