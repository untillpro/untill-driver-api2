package com.untill.driver.interfaces.fingerprint;

/**
 *	{@link IFingerPrintReader} "Read and identificate" function request
 */
public class FprReadAndIdentiticateRequest extends FprReaderRequest {

	private long timeout;

	/**
	 * @return Returns timeout, in milliseconds
	 */
	public long getTimeout() {
		return timeout;
	}

	/**
	 * Sets request timeout
	 * @param timeout Timeout, in milliseconds
	 */
	public void setTimeout(long timeout) {
		this.timeout = timeout;
	}

}
