package com.oie.pinyin;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan(basePackages = {"com.oie.pinyin.dal.dao"})
public class PinyinApplication {

	public static void main(String[] args) {
		SpringApplication.run(PinyinApplication.class, args);
	}

}
