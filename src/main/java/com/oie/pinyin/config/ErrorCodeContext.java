package com.oie.pinyin.config;


import java.util.HashMap;
import java.util.Map;

/**
 * @author oie
 * @date 2020/7/20 13:24
 * @description
 */
public final class ErrorCodeContext {

	private ErrorCodeContext() {
	}

	private static Map<Integer, String> properties = new HashMap<>();

	public static void set(int code, String message) {
		properties.put(code, message);
	}

	public static String get(int errorCode) {
		return properties.get(errorCode);
	}

}
