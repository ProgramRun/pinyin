package com.oie.pinyin.common;

import java.util.ArrayList;
import java.util.List;

import static com.oie.pinyin.config.SysErrorCode.PARAMS_ERROR;

/**
 * @author oie
 * @date 2020/9/1 11:09
 * @description
 */
public final class CharUtil {

	private CharUtil() {
		throw new UnsupportedOperationException("");
	}

	public static boolean isCharacter(char c) {
		return isLowerCharacter(c) || isUpperCharacter(c);
	}

	public static boolean isLowerCharacter(char c) {
		return 'a' <= c && c <= 'z';
	}

	public static boolean isUpperCharacter(char c) {
		return 'A' <= c && c <= 'Z';
	}

	public static boolean isChinese(char c) {
		return unicodeScript(c) == Character.UnicodeScript.HAN;
	}

	public static boolean isChinese(int c) {
		return unicodeScript(c) == Character.UnicodeScript.HAN;
	}

	public static Character.UnicodeScript unicodeScript(char c) {
		return Character.UnicodeScript.of(c);
	}

	public static Character.UnicodeScript unicodeScript(int c) {
		return Character.UnicodeScript.of(c);
	}

	public static String char2UnicodeHex(char c) {
		return Integer.toHexString(c).toUpperCase();
	}

	public static String char2UnicodeHex(int c) {
		return Integer.toHexString(c).toUpperCase();
	}

	public static char unicodeHex2Char(String c) {
		return (char) Integer.parseInt(c, 16);
	}


	public static List<Integer> convertChinese2Char(String cc){
		char[] ca = cc.toCharArray();
		List<Integer> codes = new ArrayList<>(ca.length);
		for (char c : ca) {
			if (CharUtil.isChinese(c)) {
				codes.add((int) c);
			}
		}
		return codes;
	}


}
