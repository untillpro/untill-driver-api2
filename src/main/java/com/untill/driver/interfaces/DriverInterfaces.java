package com.untill.driver.interfaces;

import java.util.HashMap;
import java.util.Map;

import com.untill.driver.IDriver;

/**
 * A helper class for constructing map of driver interfaces in {@link IDriver}.init method
 *
 */
public abstract class DriverInterfaces {

	public static final Map<Class<? extends IDriverInterface>, IDriverInterface> map(
			Class<? extends IDriverInterface> key, IDriverInterface value) {
		return map(key, value, null, null);
	}

	public static final Map<Class<? extends IDriverInterface>, IDriverInterface> map(
			Class<? extends IDriverInterface> key1, IDriverInterface value1,
			Class<? extends IDriverInterface> key2, IDriverInterface value2) {
		return map(key1, value1, key2, value2, null, null);
	}

	public static final Map<Class<? extends IDriverInterface>, IDriverInterface> map(
			Class<? extends IDriverInterface> key1, IDriverInterface value1,
			Class<? extends IDriverInterface> key2, IDriverInterface value2,
			Class<? extends IDriverInterface> key3, IDriverInterface value3) {
		return map(key1, value1, key2, value2, key3, value3, null, null);
	}

	public static final Map<Class<? extends IDriverInterface>, IDriverInterface> map(
			Class<? extends IDriverInterface> key1, IDriverInterface value1,
			Class<? extends IDriverInterface> key2, IDriverInterface value2,
			Class<? extends IDriverInterface> key3, IDriverInterface value3,
			Class<? extends IDriverInterface> key4, IDriverInterface value4) {
		HashMap<Class<? extends IDriverInterface>, IDriverInterface> map = new HashMap<>();
		map.put(key1, value1);
		if (key2 != null)
			map.put(key2, value2);
		if (key3 != null)
			map.put(key3, value3);
		if (key4 != null)
			map.put(key4, value4);
		return map;
	}

}
