package com.oie.pinyin.domain;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Getter;
import lombok.Setter;

/**
 * @author oie
 * @date 2020/9/2 16:50
 * @description
 */
@Getter
@Setter
@ApiModel(value = "姓名拼音")
public class FullName {

	@ApiModelProperty(value = "名")
	private String firstName;

	@ApiModelProperty(value = "姓")
	private String lastName;

	private FullName(String firstName, String lastName) {
		this.firstName = firstName;
		this.lastName = lastName;
	}

	public static FullName of(String firstName, String lastName) {
		return new FullName(firstName, lastName);
	}
}
