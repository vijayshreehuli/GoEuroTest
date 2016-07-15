package com.goeuro.test.exception;

public class NoCityDetailsFoundException extends Exception {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public NoCityDetailsFoundException(String message) {
		super("No City Details Found Exception");
	}

}
