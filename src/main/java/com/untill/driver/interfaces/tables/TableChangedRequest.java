package com.untill.driver.interfaces.tables;

import com.untill.driver.interfaces.DriverRequest;

public abstract class TableChangedRequest extends DriverRequest {
	/**
	 * Table number
	 */
	private int tableNumber;
	/**
	 * Table part
	 */
	private String tablePart;

	public int getTableNumber() {
		return tableNumber;
	}

	public void setTableNumber(int tableNumber) {
		this.tableNumber = tableNumber;
	}

	public String getTablePart() {
		return tablePart;
	}

	public void setTablePart(String tablePart) {
		this.tablePart = tablePart;
	}

	@Override
	public String toString() {
		return "TableChangedRequest{"
				+ "tableNumber=" + tableNumber
				+ ", tablePart='" + tablePart + '\''
				+ "} " + super.toString();
	}
}
