package com.goeuro.test.exception;

public class ArgumentMissingException extends Exception {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	/**
	 * 
	 */

	public ArgumentMissingException(String message) {
		super("City name is missing in command line argument");
	}
}
