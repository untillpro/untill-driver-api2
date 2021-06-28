package com.untill.driver.untillapi.articles;

import com.untill.driver.IDriverContext;
import com.untill.driver.untillapi.IUntillApi;

import java.util.List;

/**
 * UntillAPI for working with Articles
 *
 * @see IUntillApi
 * @see IDriverContext
 */
public interface IArticlesApi extends IUntillApi {
	/**
	 * Returns all available articles
	 *
	 * @return All available articles
	 */
	List<Article> getAllArticles();

	/**
	 * Update articles in batch
	 *
	 * @param articles list for update
	 */
	void batchUpdate(List<Article> articles);
}
