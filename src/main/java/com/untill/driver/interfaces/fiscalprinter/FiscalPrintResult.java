package com.untill.driver.interfaces.fiscalprinter;

import java.util.HashMap;
import java.util.Map;

/**
 * A result of fiscal printer "print" operation
 * 
 */
public class FiscalPrintResult extends FiscalPrinterResult {

	private Map<String, String> data = new HashMap<String, String>();

	private String documentId;

	/**
	 * @return The unique identifier of printed document. Used for document identification in unTill
	 */
	public String getDocumentId() {
		return documentId;
	}

	public void setDocumentId(String documentId) {
		this.documentId = documentId;
	}

	/**
	 * @return Any additional data which may appear in the result of printing
	 */
	public Map<String, String> getData() {
		return data;
	}

	public void setData(Map<String, String> data) {
		this.data = data;
	}

	public FiscalPrintResult() {
	}


}
