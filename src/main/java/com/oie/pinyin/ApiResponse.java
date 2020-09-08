package com.oie.pinyin;


import com.oie.pinyin.config.ErrorCodeContext;
import com.oie.pinyin.config.SysErrorCode;
import lombok.Getter;
import lombok.Setter;

/**
 * @author oie
 * @date 2020/7/20 13:15
 * @description
 */
@Getter
@Setter
public class ApiResponse<T> {

	public static final ApiResponse BUSY_RESPONSE;
	public static final ApiResponse SUCC_RESPONSE;
	public static final ApiResponse FAIL_RESPONSE;

	static {
		BUSY_RESPONSE = new ApiResponse(SysErrorCode.BUSY, ErrorCodeContext.get(SysErrorCode.BUSY));
		SUCC_RESPONSE = new ApiResponse(SysErrorCode.SUCCESS, ErrorCodeContext.get(SysErrorCode.SUCCESS));
		FAIL_RESPONSE = new ApiResponse(SysErrorCode.FAIL, ErrorCodeContext.get(SysErrorCode.FAIL));
	}

	private int result;
	private String msg;
	private T retVal;

	ApiResponse(int result, String msg) {
		this.result = result;
		this.msg = msg;
	}

	ApiResponse(int result, String msg, T retVal) {
		this.result = result;
		this.msg = msg;
		this.retVal = retVal;
	}

	public static ApiResponse getSuccResponse(String msg) {
		return getSuccResponse(msg, null);
	}

	public static ApiResponse getSuccResponse(Object retVal) {
		return getSuccResponse(ErrorCodeContext.get(SysErrorCode.SUCCESS), retVal);
	}

	public static <T> ApiResponse<T> getSuccResponse(String msg, T retVal) {
		return (ApiResponse<T>) new ApiResponse(SysErrorCode.SUCCESS, msg, retVal);
	}

	public static ApiResponse getErrResponse(int errorCode) {
		return getErrResponse(errorCode, ErrorCodeContext.get(errorCode));
	}

	public static ApiResponse getErrResponse(String msg) {
		return getErrResponse(SysErrorCode.BUSY, msg);
	}

	public static ApiResponse getErrResponse(int errorCode, String msg) {
		return getErrResponse(errorCode, msg, null);
	}

	public static <T> ApiResponse<T> getErrResponse(int errorCode, String msg, T retVal) {
		return (ApiResponse<T>) new ApiResponse(errorCode, msg, retVal);
	}
}
