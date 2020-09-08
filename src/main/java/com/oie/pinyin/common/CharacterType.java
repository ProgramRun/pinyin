package com.oie.pinyin.common;

import com.google.common.base.Enums;
import com.google.common.base.Optional;


/**
 * @author oie
 * @date 2020/9/4 13:06
 * @description
 */
public enum CharacterType {

	UPPERCASE, LOWERCASE, CAPITALIZE;

	public static CharacterType get(String input) {
		Optional<CharacterType> ct = Enums.getIfPresent(CharacterType.class, input.toUpperCase());
		return ct.isPresent() ? ct.get() : UPPERCASE;
	}
}
