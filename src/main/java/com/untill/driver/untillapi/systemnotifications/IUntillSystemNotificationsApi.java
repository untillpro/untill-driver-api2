package com.untill.driver.untillapi.systemnotifications;

import com.untill.driver.IDriverContext;
import com.untill.driver.untillapi.IUntillApi;

/**
 * UntillAPI for working with System Notifications
 * @see IUntillApi
 * @see IDriverContext
 */
public interface IUntillSystemNotificationsApi extends IUntillApi {

	/**
	 * Send message to certain user. Message will pop up in unTill(r) POS for this user.
	 * @param userId An ID of user who must receive message
	 * @param message Text of the message
	 */
	void notifyUser(Long userId, String message);

	/**
	 * Send message to all users. Message will pop up in unTill(r) POS for all users
	 * @param message Text of the message
	 */
	void notifyAllUsers(String message);

}
