package com.oie.pinyin.config;

/**
 * @author oie
 * @date 2020/7/20 13:59
 * @description
 */
public class BaseRuntimeException extends RuntimeException {

	private int errorCode;

	public BaseRuntimeException(int errorCode, String message) {
		super(message);
		this.errorCode = errorCode;
	}

	public int getErrorCode() {
		return this.errorCode;
	}

	public String getErrorMsg() {
		return super.getMessage();
	}


}
