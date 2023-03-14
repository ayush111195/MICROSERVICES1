package com.hotel.services.excaption;

public class ResourceNotFindException extends RuntimeException {

public ResourceNotFindException() 
	
	{
		
		super("Resource Not Found Onn Server!!");
	}

	
	public ResourceNotFindException(String message) {
		super(message);
	}
}
