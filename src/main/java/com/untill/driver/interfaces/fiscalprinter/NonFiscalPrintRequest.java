package com.untill.driver.interfaces.fiscalprinter;

/**
 * Request for "non-fiscal print" operation
 */
public class NonFiscalPrintRequest extends FiscalOperationRequest {

	private String text;

	public String getText() {
		return text;
	}

	public void setText(String text) {
		this.text = text;
	}

	@Override
	public String toString() {
		return "NonFiscalPrintRequest{"
				+ "text='" + text + '\''
				+ '}';
	}
}
