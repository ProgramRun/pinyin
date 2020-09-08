package com.oie.pinyin.dal.entity;

import lombok.Getter;
import lombok.Setter;

import java.util.Date;

/**
 * @author oie
 * @date 2020/7/21 9:46
 * @description
 */
@SuppressWarnings("unchecked")
@Getter
@Setter
public class BaseEntity<T> {

	Long id;
	String createUser;
	Date createDatetime;
	String modifyUser;
	Date modifyDatetime;

	public T initId(Long id){
		this.id = id;
		return (T) this;
	}

	public T initCreateInfo() {
		this.createUser = this.modifyUser = "admin";
		this.createDatetime = this.modifyDatetime = new Date();
		return (T) this;
	}

	public T initCreateInfo(String operator, Date time) {
		this.createUser = this.modifyUser = operator;
		this.createDatetime = this.modifyDatetime = time;
		return (T) this;
	}

	public T initModifyInfo() {
		this.modifyUser = "admin";
		this.modifyDatetime = new Date();
		return (T) this;
	}

	public T initModifyInfo(String operator, Date time) {
		this.modifyUser = operator;
		this.modifyDatetime = time;
		return (T) this;
	}

}
