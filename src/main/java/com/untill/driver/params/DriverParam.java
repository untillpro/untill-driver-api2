package com.untill.driver.params;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * A description of a backoffice configuration parameter
 *
 */
public class DriverParam {
	private String key;

	private String title;

	private String type;

	private String description;

	private int min;

	private int max;

	private Map<String, String> options;

	private boolean mandatory;

	private boolean readOnly;

	private String defaultValue;

	private Map<String, List<String>> visibilityConditions;

	/**
	 * @return Returns list of visibility conditions. Key for the map is
	 *         {@link DriverParam}'s key, and the value is a list of allowed
	 *         values for this param.
	 *         <p>
	 *         Example of map with 2 entries:
	 *         </p>
	 *         <ol>
	 *         <li>param1 &mdash; "value1", "value2"</li>
	 *         <li>param2 &mdash; "value3"</li>
	 *         </ol>
	 *         <p>
	 *         Result: param is visible when param1 is either "value1" or
	 *         "value2" AND param2 is "value3"
	 *         </p>
	 */
	public Map<String, List<String>> getVisibilityConditions() {
		return visibilityConditions;
	}

	/**
	 * Sets visibility conditions. See {@link #getVisibilityConditions()}
	 * 
	 * @param visibilityConditions
	 *            Visibility conditions to set
	 */
	public void setVisibilityConditions(Map<String, List<String>> visibilityConditions) {
		this.visibilityConditions = visibilityConditions;
	}

	/**
	 * @return Returns the min value (for {@link ParamType} INT)
	 */
	public int getMin() {
		return min;
	}

	/**
	 * Sets the min value (for {@link ParamType} INT)
	 * 
	 * @param min Min value
	 */
	public void setMin(int min) {
		this.min = min;
	}

	/**
	 * @return Returns the max value (for {@link ParamType} INT)
	 */
	public int getMax() {
		return max;
	}

	/**
	 * Sets the max value (for {@link ParamType} INT)
	 * 
	 * @param max Max value
	 */
	public void setMax(int max) {
		this.max = max;
	}

	/**
	 * @return Returns options, used for {@link ParamType} LIST
	 */
	public Map<String, String> getOptions() {
		return options;
	}

	/**
	 * Sets options for params of {@link ParamType} LIST
	 * 
	 * @param options Options to set
	 */
	public void setOptions(Map<String, String> options) {
		this.options = options;
	}

	/**
	 * @return Returns parameter default value
	 */
	public String getDefaultValue() {
		return defaultValue;
	}

	/**
	 * Specify default value (optional). When parameter shown in backoffice this
	 * value will be shown by defult.
	 * 
	 * @param defaultValue
	 *            Parameter default value
	 */
	public void setDefaultValue(String defaultValue) {
		this.defaultValue = defaultValue;
	}

	public DriverParam() {
	}

	/**
	 * Helper function
	 * 
	 * @param params
	 * @return
	 */
	public static final ArrayList<DriverParam> list(DriverParam... params) {
		ArrayList<DriverParam> list = new ArrayList<>();
		for (DriverParam p : params)
			list.add(p);
		return list;
	}

	/**
	 * @return Returns parameter key
	 */
	public String getKey() {
		return key;
	}

	/**
	 * Sets parameter key. This key is used in {@link DriverConfiguration}
	 * params to store this param value
	 * 
	 * @param key Parameter key
	 */
	public void setKey(String key) {
		this.key = key;
	}

	/**
	 * @return Returns parameter title, displayed in unTill(r) Backoffice
	 */
	public String getTitle() {
		return title;
	}

	/**
	 * Sets parameter title, displayed in unTill(r) Backoffice
	 * 
	 * @param title Parameter title
	 */
	public void setTitle(String title) {
		this.title = title;
	}

	/**
	 * @return Returns the parameter type, one of {@link ParamType} constants
	 */
	public String getType() {
		return type;
	}

	/**
	 * Sets the parameter type. Use constants from {@link ParamType}
	 * 
	 * @param type Parameter Type
	 */
	public void setType(String type) {
		this.type = type;
	}

	/**
	 * @return Returns param description
	 */
	public String getDescription() {
		return description;
	}

	/**
	 * Sets the param description, will be displayed as additional text under
	 * the param control
	 * 
	 * @param description Description
	 */
	public void setDescription(String description) {
		this.description = description;
	}

	/**
	 * @return Returns true if param value may not be empty
	 */
	public boolean isMandatory() {
		return mandatory;
	}

	/**
	 * Declares if param value can not be empty
	 * 
	 * @param mandatory True if parameter value can not be empty
	 */
	public void setMandatory(boolean mandatory) {
		this.mandatory = mandatory;
	}

	/**
	 * @return Returns true if param is read-only
	 */
	public boolean isReadOnly() {
		return readOnly;
	}

	/**
	 * Declares if param is read-only
	 * 
	 * @param readOnly True if parameter value is read-only
	 */
	public void setReadOnly(boolean readOnly) {
		this.readOnly = readOnly;
	}

	/**
	 * Helper class: DriverParam builder
	 *
	 */
	public static class Builder {
		private DriverParam param = new DriverParam();

		/**
		 * Constructs basic DriverParam with type = STRING
		 */
		public Builder() {
			param.setType(ParamType.STRING.getId());
		}

		/**
		 * @return Returns an instance of constructed DriverParam
		 */
		public DriverParam build() {
			return param;
		}

		/**
		 * Sets the parameter type
		 * 
		 * @param type Parameter type
		 */
		public Builder type(ParamType type) {
			param.setType(type.getId());
			return this;
		}

		/**
		 * Sets parameter title, displayed in unTill(r) Backoffice
		 * 
		 * @param value Parameter title
		 */
		public Builder title(String value) {
			param.setTitle(value);
			return this;
		}

		/**
		 * Specify default value (optional). When parameter shown in backoffice
		 * this value will be shown by defult.
		 * 
		 * @param value
		 *            Parameter default value
		 */
		public Builder defaultValue(String value) {
			param.setDefaultValue(value);
			return this;
		}

		/**
		 * Sets the param description, will be displayed as additional text
		 * under the param control
		 * 
		 * @param value Parameter description
		 */
		public Builder description(String value) {
			param.setDescription(value);
			return this;
		}

		/**
		 * Sets parameter key. This key is used in {@link DriverConfiguration}
		 * params to store this param value
		 * 
		 * @param value Parameter key
		 */
		public Builder key(String value) {
			param.setKey(value);
			return this;
		}

		/**
		 * Declares if param value can not be empty
		 * 
		 * @param value True if param value can not be empty 
		 */
		public Builder mandatory(boolean value) {
			param.setMandatory(value);
			return this;
		}

		/**
		 * Declares if param is read-only
		 * 
		 * @param value True if param is read-only 
		 */
		public Builder readOnly(boolean value) {
			param.setReadOnly(value);
			return this;
		}

		/**
		 * Sets the min value (for {@link ParamType} INT)
		 * 
		 * @param value Min value
		 */
		public Builder min(int value) {
			param.setMin(value);
			return this;
		}

		/**
		 * Sets the max value (for {@link ParamType} INT)
		 * 
		 * @param value Max value
		 */
		public Builder max(int value) {
			param.setMax(value);
			return this;
		}

		/**
		 * Adds option to the param of type LIST
		 * 
		 * @param value
		 *            An option value
		 * @param text
		 *            An option display text
		 */
		public Builder option(String value, String text) {
			if (param.getOptions() == null)
				param.setOptions(new HashMap<>());
			param.getOptions().put(value, text);
			return this;
		}

		/**
		 * Adds visibility condition. Current {@link DriverParam} will be
		 * visible, when for all added visibility conditions value of param
		 * under "paramKey" match one of provided values.
		 * <p>
		 * Example of map with 2 entries:
		 * </p>
		 * <ol>
		 * <li>param1 &mdash; "value1", "value2"</li>
		 * <li>param2 &mdash; "value3"</li>
		 * </ol>
		 * <p>
		 * Result: param is visible when param1 is either "value1" or "value2"
		 * AND param2 is "value3"
		 * </p>
		 * 
		 * @param paramKey
		 *            A key of parameter to check
		 * @param values
		 *            A list of allowed values
		 */
		public Builder visibilityCondition(String paramKey, String... values) {
			if (param.getVisibilityConditions() == null)
				param.setVisibilityConditions(new HashMap<>());
			List<String> vv = new ArrayList<>();
			for (String value : values)
				vv.add(value);
			param.getVisibilityConditions().put(paramKey, vv);
			return this;
		}

	}

}
