package com.oie.pinyin.domain.handler;

import com.oie.pinyin.common.CharacterType;

import java.util.List;

import static com.oie.pinyin.common.CharUtil.isCharacter;
import static com.oie.pinyin.common.CharUtil.isUpperCharacter;

/**
 * @author oie
 * @date 2020/9/4 14:02
 * @description 单词处理
 */
public class CharacterHandler implements Handler<Object> {

	private CharacterType characterType;
	private List<String> firstNamePY;
	private List<String> lastNamePY;

	private CharacterHandler(CharacterType characterType, List<String> firstNamePY, List<String> lastNamePY) {
		this.characterType = characterType;
		this.firstNamePY = firstNamePY;
		this.lastNamePY = lastNamePY;
	}

	public static CharacterHandler of(CharacterType characterType, List<String> firstNamePY, List<String> lastNamePY) {
		return new CharacterHandler(characterType, firstNamePY, lastNamePY);
	}

	@Override
	public Object handle() {
		switch (characterType) {
			case UPPERCASE:
				break;
			case LOWERCASE:
				toLowerCase(this.firstNamePY);
				toLowerCase(this.lastNamePY);
				break;
			case CAPITALIZE:
				toCapital(this.firstNamePY);
				toCapital(this.lastNamePY);
		}
		return null;
	}

	private void toLowerCase(List<String> raw) {
		for (int i = 0; i < raw.size(); i++) {
			raw.set(i, raw.get(i).toLowerCase());
		}
	}

	private void toCapital(List<String> raw) {
		for (int i = 0; i < raw.size(); i++) {
			raw.set(i, capitalize(raw.get(i)));
		}
	}

	private String capitalize(String input) {
		return input.length() == 1 ? input : doCapitalize(input);
	}

	private String doCapitalize(String input) {
		char[] chars = input.toCharArray();
		for (int i = 1; i < chars.length; i++) {
			if (!isCharacter(chars[i])) {
				i++;
			} else {
				toLower(chars, i);
			}
		}
		return String.valueOf(chars);
	}

	private void toLower(char[] chars, int index) {
		if (isUpperCharacter(chars[index])) {
			chars[index] = (char) (chars[index] + 32);
		}
	}

}
