package com.oie.pinyin.service;

import com.oie.pinyin.common.CharacterType;
import com.oie.pinyin.domain.FullName;

import java.util.Collection;

/**
 * @author oie
 * @date 2020/9/1 12:30
 * @description
 */
public interface IPinYinService {

    /**
     * 普通话转换
     *
     * @param name
     * @param type
     * @param separator
     * @return
     */
    Collection<FullName> convertCn(String name, CharacterType type, String separator);

    /**
     * 汉字转换
     * @param chinese
     * @return
     */
    Collection<String> convert(String chinese);

    /**
     * 粤语拼音转换
     *
     * @param name
     * @param type
     * @param separator
     * @return
     */
    Collection<FullName> convertHk(String name, CharacterType type, String separator);
}
