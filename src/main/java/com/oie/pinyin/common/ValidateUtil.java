package com.oie.pinyin.common;


import com.oie.pinyin.config.BaseRuntimeException;

/**
 * @author oie
 * @date 2020/7/21 15:12
 * @description
 */
public final class ValidateUtil {

	private ValidateUtil() {
		throw new UnsupportedOperationException("");
	}

	public static void isTrue(boolean condition, int errorCode) {
		isTrue(condition, errorCode, null);
	}

	public static void isTrue(boolean condition, int errorCode, String errorMsg) {
		if (!condition) {
			throw new BaseRuntimeException(errorCode, errorMsg);
		}
	}

	public static void isFalse(boolean condition, int errorCode) {
		isTrue(!condition, errorCode, null);
	}

	public static void isFalse(boolean condition, int errorCode, String errorMsg) {
		isTrue(!condition, errorCode, errorMsg);
	}


}
