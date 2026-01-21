package com.untill.driver.interfaces.customerdisplay;

import com.untill.driver.IDriver;
import com.untill.driver.interfaces.IDriverInterface;
import com.untill.driver.params.DriverConfiguration;

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
	 * @param cfg   - driver configuration
	 * @param order - order to display
	 */
	void displayOrder(DriverConfiguration cfg, DisplayOrder order);

	/**
	 * Called when the payment screen is shown to display the bill QR code
	 *
	 * @param cfg  - driver configuration
	 * @param bill - bill to display
	 */
	void displayBill(DriverConfiguration cfg, DisplayBill bill);

	/**
	 * Displays the standby screen
	 *
	 * @param cfg - driver configuration
	 */
	void displayStandby(DriverConfiguration cfg);
}
