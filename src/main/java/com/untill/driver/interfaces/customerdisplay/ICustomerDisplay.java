package com.untill.driver.interfaces.customerdisplay;

import com.untill.driver.IDriver;
import com.untill.driver.interfaces.IDriverInterface;

/**
 * Interface for a customer display driver
 *
 * @see IDriverInterface
 * @see IDriver
 */
public interface ICustomerDisplay extends IDriverInterface {
	/**
	 * Called when customer display is added to the order to display the order details
	 *
	 * @param order - order to display
	 */
	void displayOrder(DisplayOrder order);

	/**
	 * Called when the payment screen is shown to display the bill QR code
	 *
	 * @param bill - bill to display
	 */
	void displayBill(DisplayBill bill);

	/**
	 * Displays the standby screen
	 */
	void displayStandby();
}
