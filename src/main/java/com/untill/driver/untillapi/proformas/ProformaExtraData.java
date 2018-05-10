package com.untill.driver.untillapi.proformas;

/**
 * Proforma extra data
 * @see Proforma
 *
 */
public class ProformaExtraData {

	private Long id;

	private String barcode;

	private String posReference;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getBarcode() {
		return barcode;
	}

	public void setBarcode(String barcode) {
		this.barcode = barcode;
	}

	public String getPosReference() {
		return posReference;
	}

	public void setPosReference(String posReference) {
		this.posReference = posReference;
	}

}
