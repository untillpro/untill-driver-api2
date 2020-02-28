package com.untill.driver.interfaces.fiscalprinter;

/**
 * Request for "fiscal re-print" operation
 */
public class FiscalReprintRequest extends FiscalOperationRequest {

	private FiscalPrintResult documentResult;

	public FiscalPrintResult getDocumentResult() {
		return documentResult;
	}

	public void setDocumentResult(FiscalPrintResult documentResult) {
		this.documentResult = documentResult;
	}

	@Override
	public String toString() {
		return "FiscalReprintRequest{"
				+ "documentResult=" + documentResult
				+ '}';
	}
}
