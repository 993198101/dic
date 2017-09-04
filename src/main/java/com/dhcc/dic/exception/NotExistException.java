package com.dhcc.dic.exception;



import org.slf4j.Logger;
import org.slf4j.LoggerFactory;


public class NotExistException extends RuntimeException{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1626789998822978130L;
	
	private static Logger log=LoggerFactory.getLogger(NotExistException.class);
	
	public NotExistException(String errorMsg){
		super(errorMsg);
	}
	
}
