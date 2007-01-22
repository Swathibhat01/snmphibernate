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

@SuppressWarnings("serial")
public class SnmpException extends Exception {

	public static final int NO_RESPONSE_PDU = -1;

	public static final int NO_SUCH_INSTANCE = 2;

	private int errorIndex = -1;

	private int errorStatus = -1;

	private ISnmpErrorMsgProvider errorMsgProvider;

	public SnmpException(int errorStatus, int errorIndex) {
		this.errorStatus = errorStatus;
		this.errorIndex = errorIndex;
	}

	public SnmpException(Exception cause) {
		super(cause);
	}

	public void setSnmpErrorMsgProvider(ISnmpErrorMsgProvider errorMsgProvider) {
		this.errorMsgProvider = errorMsgProvider;
	}

	public int getErrorCode() {
		return errorStatus;
	}

	public int getErrorIndex() {
		return errorIndex;
	}

	@Override
	public String getMessage() {
		if (getCause() != null) {
			return getCause().getMessage();
		}
		StringBuffer sb = new StringBuffer("ErrorCode: ").append(errorStatus);
		sb.append(", ErrorIndex: ").append(errorIndex);
		sb.append(", ErrorMessage: ").append(getErrorMsg());
		return sb.toString();
	}

	private String getErrorMsg() {
		return errorMsgProvider.getErrorMsg(errorStatus, errorIndex);
	}

}
