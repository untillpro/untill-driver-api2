package com.untill.driver.untillapi.users;

import com.untill.driver.IDriverContext;
import com.untill.driver.untillapi.IUntillApi;

import java.util.List;

/**
 * unTillAPI for working with Users
 *
 * @see IUntillApi
 * @see IDriverContext
 */
public interface IUntillUsersApi extends IUntillApi {
	/**
	 * Find all active users
	 *
	 * @return List of active users
	 */
	List<User> getUsers();
}
