package com.untill.driver.untillapi.exceptions;

public class EUntillTpapiError extends EUntillApiException {

	private static final long serialVersionUID = 1255318685920450188L;

	public static final int ERR_TPAPI_INTERNAL_ERROR = 1;
	public static final int ERR_TPAPI_AUTH_ERROR = 2;
	public static final int ERR_TPAPI_ILLEGAL_ARGUMENT = 3;
	public static final int ERR_TPAPI_DATABASE_UNAVAILABLE = 4;
	public static final int ERR_TPAPI_DISABLED = 5;
	public static final int ERR_TPAPI_NOT_ALLOWED = 6;
	public static final int ERR_TPAPI_UNABLE_PROCESS_REQUEST = 7;

	private int code;

	private String message;

	public String getMessage() {
		return message;
	}

	public int getCode() {
		return code;
	}

	public EUntillTpapiError(int code, String message) {
		super("TPAPI Error " + code);
		this.code = code;
		this.message = message;
	}

}
