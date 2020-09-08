package com.oie.pinyin.dal.entity;

import lombok.*;
import lombok.extern.slf4j.Slf4j;

@Getter
@Setter
public class PinYin extends BaseEntity<PinYin> {

	private Integer unicode;

	private String unicodeHex;

	private String zhCharacter;

	private String cnCharacter;

	private String hkCharacter;

	private String twCharacter;

	private String zhPinYin;

	private String hkPinYin;

}