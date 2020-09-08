package com.oie.pinyin.dal.entity;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class LastName extends BaseEntity<LastName> {

	private String zhCharacter;

	private String zhPinYin;

}