package com.oie.pinyin.common;

import com.google.common.base.Splitter;

/**
 * @author oie
 * @date 2020/9/2 18:47
 * @description
 */
public final class Splitters {

	private Splitters() {
		throw new UnsupportedOperationException("");
	}

	private static final Splitter splitter = Splitter.on(",").omitEmptyStrings();

	public static Splitter customize(String separator) {
		if (separator == null) {
			return splitter;
		}
		return Splitter.on(separator).omitEmptyStrings();
	}

}
