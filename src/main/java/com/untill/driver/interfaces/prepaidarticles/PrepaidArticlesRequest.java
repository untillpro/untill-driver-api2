package com.untill.driver.interfaces.prepaidarticles;

import com.untill.driver.interfaces.DriverRequest;

/**
 * Basic class for {@link IPrepaidArticles} requests
 */
public abstract class PrepaidArticlesRequest extends DriverRequest {
	@Override
	public String toString() {
		return "PrepaidArticlesRequest{} " + super.toString();
	}
}
