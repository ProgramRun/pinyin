package com.oie.pinyin.dal.dao;

import com.oie.pinyin.dal.entity.LastName;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Repository;

/**
 * @author oie
 * @date 2020/9/2 15:49
 * @description
 */
@Mapper
@Repository("lastNameDAO")
public interface ILastNameDAO {

	LastName listByCharacter(@Param("character") String character);
}
