package com.untill.driver.untillapi.exceptions;

public abstract class EUntillApiException extends Exception {

	private static final long serialVersionUID = 1794282950170240125L;

	public EUntillApiException(String message) {
		super(message);
	}

	public EUntillApiException(Throwable e) {
		super(e);
	}

	public EUntillApiException(String message, Throwable e) {
		super(message, e);
	}

}
