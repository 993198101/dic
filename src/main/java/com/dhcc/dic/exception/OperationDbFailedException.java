package com.dhcc.dic.exception;

public class OperationDbFailedException extends RuntimeException{
	/**
	 * 
	 */
	private static final long serialVersionUID = 613935483937876248L;

	public OperationDbFailedException(String message){
		super(message);
	}
}
