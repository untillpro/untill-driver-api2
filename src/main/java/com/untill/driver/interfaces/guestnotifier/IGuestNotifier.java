package com.untill.driver.interfaces.guestnotifier;

import com.untill.driver.IDriver;
import com.untill.driver.interfaces.IDriverInterface;
import com.untill.driver.params.DriverConfiguration;

/**
 * Driver interface for working with so called "Guest Notifier" hardware: buzzers, pagers, etc
 *
 * @see IDriverInterface
 * @see IDriver
 */
public interface IGuestNotifier extends IDriverInterface {

	GuestNotifierResult operation(DriverConfiguration cfg, GuestNotifierRequest request);
}
