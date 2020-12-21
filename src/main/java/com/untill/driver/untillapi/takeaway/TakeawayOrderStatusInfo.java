package com.untill.driver.untillapi.takeaway;

public class TakeawayOrderStatusInfo {
	
	private TakeawayOrderStatus status;
	
	private int tableNumber;
	
	private String tablePart;

	public TakeawayOrderStatus getStatus() {
		return status;
	}

	public void setStatus(TakeawayOrderStatus status) {
		this.status = status;
	}

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

}
