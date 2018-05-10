package com.untill.driver;

import java.util.ArrayList;
import java.util.Map;

import com.untill.driver.interfaces.IDriverInterface;
import com.untill.driver.params.DriverParam;

/**
 * Basic interface for all unTill drivers. When unTIll JServer starts it browse
 * all JARs in subfolders of <b>UNTILL_HOME/plugins/drivers</b> folder and
 * checks Main-Class property in MANIFEST.MF file. If specified class is an
 * implementator of IDriver interface, this driver loaded can be used in unTill.
 * 
 */
public interface IDriver {

	/**
	 * @return Returns the list of driver parameters which used to setup driver
	 *         configuration in Backoffice.
	 * 
	 * @see DriverParam
	 */
	ArrayList<DriverParam> getParamsList();

	/**
	 * @return Returns the name of driver
	 */
	String getDriverName();

	/**
	 * @return Returns the name of provider
	 */
	String getProviderName();

	/**
	 * @return Returns current driver version
	 */
	String getVersion();

	/**
	 * Called right after driver is loaded by JServer. Driver shlould perform
	 * all initialization actions and return the map of interfaces it supports
	 * 
	 * @param context
	 *            Driver Context
	 * @return Returns the map of interfaces supported by driver
	 * @see IDriverInterface
	 */
	Map<Class<? extends IDriverInterface>, IDriverInterface> init(IDriverContext context);

	/**
	 * Called just before driver is unloaded
	 */
	void finit();

}
