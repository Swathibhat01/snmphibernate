package net.sourceforge.snmphibernate.api;

public abstract class AbstractSnmpSession implements ISnmpSession {

	private int retries = 3;

	private int timeout = 3000;

	private ISmiTypeProvider smiTypeProvider;

	private ISnmpErrorMsgProvider errorMsgProvider;

	/*
	 * (non-Javadoc)
	 * 
	 * @see net.sourceforge.snmphibernate.api.ISnmpTarget#getRetries()
	 */
	public int getRetries() {
		return retries;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see net.sourceforge.snmphibernate.api.ISnmpTarget#setRetries(int)
	 */
	public void setRetries(int retries) {
		this.retries = retries;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see net.sourceforge.snmphibernate.api.ISnmpTarget#getTimeout()
	 */
	public int getTimeout() {
		return timeout;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see net.sourceforge.snmphibernate.api.ISnmpTarget#setTimeout(int)
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
