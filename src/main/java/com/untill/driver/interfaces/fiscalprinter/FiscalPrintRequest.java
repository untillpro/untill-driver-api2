package com.untill.driver.interfaces.fiscalprinter;

/**
 * Request for "fiscal print" operation
 */
public class FiscalPrintRequest extends FiscalPrinterRequest {

	private FiscalDocument document;

	/**
	 * @return Returns fiscal document to print
	 */
	public FiscalDocument getDocument() {
		return document;
	}

	/**
	 * Sets fiscal document to print
	 *
	 * @param document - fiscal document to print
	 */
	public void setDocument(FiscalDocument document) {
		this.document = document;
	}

	@Override
	public String toString() {
		return "FiscalPrintRequest{"
				+ "document=" + document
				+ '}';
	}
}
