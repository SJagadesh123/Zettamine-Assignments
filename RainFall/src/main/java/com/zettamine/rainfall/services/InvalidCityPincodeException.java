package com.zettamine.rainfall.services;

public class InvalidCityPincodeException extends RuntimeException {

	public InvalidCityPincodeException() {
		super();
	}

	public InvalidCityPincodeException(String message, Throwable cause, boolean enableSuppression,
			boolean writableStackTrace) {
		super(message, cause, enableSuppression, writableStackTrace);
	}

	public InvalidCityPincodeException(String message, Throwable cause) {
		super(message, cause);
	}

	public InvalidCityPincodeException(String message) {
		super(message);
	}

	public InvalidCityPincodeException(Throwable cause) {
		super(cause);
	}
	
	

}
