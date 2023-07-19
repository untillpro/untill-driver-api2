package com.untill.driver.interfaces.hotel;

public final class HotelChargeRequestKind {
	private HotelChargeRequestKind() {
	}

	/**
	 * Normal sale
	 */
	public static final short SALE = 1;
	/**
	 * Bill is re-opened (return)
	 */
	public static final short RETURN = -1;
}
