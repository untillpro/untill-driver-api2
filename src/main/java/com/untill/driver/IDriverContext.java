package com.untill.driver;

import com.untill.driver.untillapi.IUntillApi;

/**
 * Defines a set of methods to provide each driver with environment settings.
 *
 * @see               IDriver
 */
public interface IDriverContext {

	/** 
	 * Returns the logger
	 * 
	 * @param c             the class under logging
	 * @return              the logger used for specified class
	 */
	IDriverLogger getLogger(Class<?> c);

	/** 
	 * Returns true if emulation mode is currently enabled in unTill.
	 * When enabled, driver should skip communication to the real device/interface and return emulated data (optional).
	 * Emulation mode enabled in <b>untill.ini</b>:
	 * <pre>
	 * [common]
	 * EmulateDevices=1
	 * </pre>
	 * @return              true if emulation mode is currently enabled in unTill, false otherwise
	 */
	boolean isEmulationModeEnabled();

	/** 
	 * Returns the absolute path to a file in driver directory
	 * 
	 * @param fileName      the name of file in driver directory
	 * @return              Absolute path to a file in driver directory
	 */
	String getAbsolutePath(String fileName);

	/** 
	 * Returns unTill property value by it's name
	 * 
	 * @param propertyName  the name of property
	 * @see UntillProperties
	 * @return              property value
	 */
	String getProperty(String propertyName);

	/**
	 * @return Returns progress interface
	 */
	IDriverProgress getProgress();

	/**
	 * Returns instance of class implementing certain unTill API
	 * @param cls API interface which extends IUntillApi
	 * @return Object which implements certain interface
	 * @see IUntillApi
	 */
	<T extends IUntillApi> T getApi(Class<? extends T> cls);
}
