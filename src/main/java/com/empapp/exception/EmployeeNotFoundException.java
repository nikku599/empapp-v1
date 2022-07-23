package com.empapp.exception;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class EmployeeNotFoundException extends RuntimeException {
	
	Logger logger = LoggerFactory.getLogger(EmployeeNotFoundException.class);
	private static final long serialVersionUID = 1L;
	
	public EmployeeNotFoundException() {
		super();
		logger.warn("EmployeeNotFoundException()");
	}

}
