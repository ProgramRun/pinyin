package com.oie.pinyin.dal.dao;

import com.oie.pinyin.dal.entity.PinYin;
import org.springframework.stereotype.Repository;

import java.util.Collection;
import java.util.List;

/**
 * @author oie
 * @date 2020/9/1 11:39
 * @description
 */
@Repository("pinYinDAO")
public interface IPinYinDAO {

    List<PinYin> listByUnicode(Collection<Integer> codes);

}
