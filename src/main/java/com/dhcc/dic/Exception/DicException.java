package com.dhcc.dic.Exception;

public class DicException extends RuntimeException{
	/**
	 * 
	 */
	private String errorCode;
	private String message;
	
	private static final long serialVersionUID = -6813942111940449933L;
	public DicException(String errorCode,String message){
		super();
	};
	public DicException(String msg,Throwable cause){
		super(msg,cause);
	};
	public DicException(Throwable cause){
		super(cause);
	};
}
