package com.oie.pinyin.common;

import com.google.common.base.Joiner;

/**
 * @author oie
 * @date 2020/9/2 18:18
 * @description
 */
public final class Joiners {

	private Joiners() {
		throw new UnsupportedOperationException("");
	}

	private static final Joiner joiner = Joiner.on(" ").skipNulls();

	public static Joiner customize(String separator) {
		if (separator == null) {
			return joiner;
		}
		return Joiner.on(separator).skipNulls();
	}
}
