package com.untill.driver.untillapi.courses;

import com.untill.driver.IDriverContext;
import com.untill.driver.untillapi.IUntillApi;

import java.util.List;

/**
 * UntillAPI for working with Courses
 *
 * @see IUntillApi
 * @see IDriverContext
 */
public interface IUntillCoursesApi extends IUntillApi {
	/**
	 * Returns all available courses
	 *
	 * @return all available courses
	 */
	List<Course> getAllCourses();
}