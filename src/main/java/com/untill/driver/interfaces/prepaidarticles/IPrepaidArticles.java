package com.untill.driver.interfaces.prepaidarticles;

import com.untill.driver.IDriver;
import com.untill.driver.interfaces.IDriverInterface;
import com.untill.driver.params.DriverConfiguration;

/**
 * Pre-paid articles driver interface
 *
 * @see IDriverInterface
 * @see IDriver
 */
public interface IPrepaidArticles extends IDriverInterface {

	/**
	 * Handles pre-paid articles operation and returns result of this operation. Operation is defined by a type of
	 * PrepaidArticlesRequest object: {@link ReadPrepaidArticlesRequest},
	 * {@link ChargePrepaidArticlesRequest}.
	 *
	 * @param cfg     driver instance configuration
	 * @param request request details
	 * @return operation result, instance of {@link PrepaidArticlesResult}
	 */
	PrepaidArticlesResult operation(DriverConfiguration cfg, PrepaidArticlesRequest request);
}
