package com.oie.pinyin.service.impl;

import com.oie.pinyin.common.CharUtil;
import com.oie.pinyin.common.CharacterType;
import com.oie.pinyin.dal.dao.IPinYinDAO;
import com.oie.pinyin.dal.entity.PinYin;
import com.oie.pinyin.domain.FullName;
import com.oie.pinyin.domain.converter.FullNameConverter;
import com.oie.pinyin.domain.handler.PinYinType;
import com.oie.pinyin.service.IPinYinService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

/**
 * @author oie
 * @date 2020/9/1 12:30
 * @description
 */
@Service("pinYinService")
@Transactional(readOnly = true, rollbackFor = Exception.class)
public class PinYinServiceImpl implements IPinYinService {

    @Autowired
    private IPinYinDAO pinYinDAO;

    @Override
    public Collection<FullName> convertCn(String name, CharacterType type, String separator) {
        return FullNameConverter.of(name, separator, PinYinType.NORMAL, type).convert();
    }

    @Override
    public Collection<String> convert(String chinese) {
        if (!CharUtil.isChinese(chinese.charAt(0))) {
            return Collections.emptyList();
        }
        List<PinYin> py = pinYinDAO.listByUnicode(CharUtil.convertChinese2Char(chinese));
        return py.stream().map(PinYin::getZhPinYin).collect(Collectors.toList());
    }

    @Override
    public Collection<FullName> convertHk(String name, CharacterType type, String separator) {
        return FullNameConverter.of(name, separator, PinYinType.HONG_KANG, type).convert();
    }
}
