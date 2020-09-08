package com.oie.pinyin.domain.handler;

import com.oie.pinyin.dal.entity.PinYin;
import org.springframework.util.StringUtils;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * @author oie
 * @date 2020/9/4 10:52
 * @description 粤语分词器
 */
class HkNameSegment extends BaseNameSegment {

	private static final String MARKER = "*";

	private HkNameSegment(List<PinYin> pys, List<String> firstNamePY, List<String> lastNamePY) {
		super(pys, firstNamePY, lastNamePY);
	}

	static HkNameSegment of(List<PinYin> pys, List<String> firstNamePY, List<String> lastNamePY) {
		return new HkNameSegment(pys, firstNamePY, lastNamePY);
	}

	@Override
	protected void handle2Character() {
		sourceFirstNamePY.add(replaceEmpty(pys.get(1).getHkPinYin()));
		sourceLastNamePY.add(replaceEmpty(pys.get(0).getHkPinYin()));
	}

	@Override
	protected void handle3Character() {
		String lastName = getLastName(pys);
		sourceLastNamePY.addAll(is2CharacterSurname(lastName) ? handlePinYin(pys, 0, 2) : Collections.singletonList(replaceEmpty(pys.get(0).getHkPinYin())));
		sourceFirstNamePY.addAll(is2CharacterSurname(lastName) ? handlePinYin(pys, 2, pys.size()) : handlePinYin(pys, 1, pys.size()));
	}

	@Override
	protected void handleMoreCharacter() {
		sourceLastNamePY.addAll(handlePinYin(pys, 0, 2));
		sourceFirstNamePY.addAll(handlePinYin(pys, 2, pys.size()));
	}


	@Override
	protected String doHandle(PinYin py){
		return replaceEmpty(py.getHkPinYin());
	}

	private String replaceEmpty(String input) {
		return StringUtils.isEmpty(input) ? MARKER : input;
	}

}
