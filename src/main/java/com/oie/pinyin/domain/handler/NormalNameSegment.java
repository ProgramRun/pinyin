package com.oie.pinyin.domain.handler;

import com.oie.pinyin.dal.entity.PinYin;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * @author oie
 * @date 2020/9/3 9:19
 * @description 分词器
 */
final class NormalNameSegment extends BaseNameSegment {

	private NormalNameSegment(List<PinYin> pys, List<String> firstNamePY, List<String> lastNamePY) {
		super(pys, firstNamePY, lastNamePY);
	}

	static NormalNameSegment of(List<PinYin> pys, List<String> firstNamePY, List<String> lastNamePY) {
		return new NormalNameSegment(pys, firstNamePY, lastNamePY);
	}

	@Override
	protected void handle2Character() {
		sourceFirstNamePY.add(pys.get(1).getZhPinYin());
		sourceLastNamePY.add(pys.get(0).getZhPinYin());
	}

	@Override
	protected void handle3Character() {
		String lastName = getLastName(pys);
		sourceLastNamePY.add(lastName);
		sourceFirstNamePY.addAll(is2CharacterSurname(lastName) ? handlePinYin(pys, 2, pys.size()) : handlePinYin(pys, 1, pys.size()));
	}

	@Override
	protected void handleMoreCharacter() {
		String lastName = getLastName(pys);
		sourceLastNamePY.addAll(is2CharacterSurname(lastName) ? Collections.singletonList(lastName) : handlePinYin(pys, 0, 1));
		sourceFirstNamePY.addAll(handlePinYin(pys, 2, pys.size()));
	}


	@Override
	protected String doHandle(PinYin py){
		return py.getZhPinYin();
	}

}
