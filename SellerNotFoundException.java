package com.mouritech.springframework.exception;

public class SellerNotFoundException extends Exception {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1337935933969360905L;
	
	public SellerNotFoundException(Object sellid) {
		super(sellid != null ?sellid.toString() : null);
	}

}