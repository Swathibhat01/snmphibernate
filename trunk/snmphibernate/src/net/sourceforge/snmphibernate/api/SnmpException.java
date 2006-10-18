package net.sourceforge.snmphibernate.api;

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
