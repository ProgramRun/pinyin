package com.oie.pinyin.domain.handler;

import java.util.List;

/**
 * @author oie
 * @date 2020/9/4 17:24
 * @description
 */
public class LastNameHandler extends NameHandler {

	LastNameHandler(List<String> py, String separator) {
		super(py, separator);
	}

	public static LastNameHandler of(List<String> py, String separator) {
		return new LastNameHandler(py, separator);
	}

	@Override
	public List<String> handle() {
		if (!"".equals(separator) && py.size() == 1) {
			py.set(0, py.get(0).replace(" ", separator));
		}
		return super.handle();
	}

}
