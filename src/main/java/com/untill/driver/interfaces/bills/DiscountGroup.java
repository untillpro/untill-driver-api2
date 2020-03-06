package com.untill.driver.interfaces.bills;

/**
 * Discount group data
 *
 * @see Bill
 */
public class DiscountGroup {

	private long id;

	private String description;

	private String barcode;

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getBarcode() {
		return barcode;
	}

	public void setBarcode(String barcode) {
		this.barcode = barcode;
	}

	@Override
	public String toString() {
		return "DiscountGroup{"
				+ "id=" + id
				+ ", description='" + description + '\''
				+ ", barcode='" + barcode + '\''
				+ '}';
	}
}
