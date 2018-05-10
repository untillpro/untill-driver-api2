package com.untill.driver.interfaces.paramsvalidation;

/**
 * Thrown when configuration validation is failed
 * @see IConfigurationValidation
 *
 */
public class EConfigurationValidationFailed extends RuntimeException {

	private static final long serialVersionUID = 4324377145164235077L;

	public EConfigurationValidationFailed(String message) {
		super(message);
	}
}
