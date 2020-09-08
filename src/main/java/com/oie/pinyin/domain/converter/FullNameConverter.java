package com.oie.pinyin.domain.converter;

import com.oie.pinyin.common.CharUtil;
import com.oie.pinyin.common.CharacterType;
import com.oie.pinyin.common.SpringContextUtil;
import com.oie.pinyin.common.ValidateUtil;
import com.oie.pinyin.dal.dao.IPinYinDAO;
import com.oie.pinyin.dal.entity.PinYin;
import com.oie.pinyin.domain.FullName;
import com.oie.pinyin.domain.handler.*;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

import static com.oie.pinyin.config.SysErrorCode.PARAMS_ERROR;

/**
 * @author oie
 * @date 2020/9/2 16:15
 * @description
 */
public final class FullNameConverter implements Converter<Collection<FullName>> {

    private static final IPinYinDAO PIN_YIN_DAO = SpringContextUtil.getBean(IPinYinDAO.class);

    private String name;
    private String separator;
    private PinYinType pinYinType;
    private CharacterType characterType;

    private FullNameConverter(String name, String separator, PinYinType pinYinType, CharacterType characterType) {
        this.name = name;
        this.separator = separator;
        this.pinYinType = pinYinType;
        this.characterType = characterType;
    }

    public static FullNameConverter of(String name, String separator, PinYinType pinYinType,
                                       CharacterType characterType) {
        return new FullNameConverter(name, separator, pinYinType, characterType);
    }

    @Override
    public Collection<FullName> convert() {
        Collection<Integer> codes = preHandle();
        List<PinYin> pys = PIN_YIN_DAO.listByUnicode(codes);
        ValidateUtil.isFalse(pys.size() < 2, PARAMS_ERROR, "invalid name");
        List<String> firstNamePY = new ArrayList<>(pys.size());
        List<String> lastNamePY = new ArrayList<>(2);
        BaseNameSegment.of(pinYinType, pys, firstNamePY, lastNamePY).handle();
        CharacterHandler.of(characterType, firstNamePY, lastNamePY).handle();
        return FullNameHandler.of(NameHandler.of(firstNamePY, separator).handle(), LastNameHandler.of(lastNamePY, separator).handle()).handle();
    }


    private Collection<Integer> preHandle() {
        List<Integer> codes = CharUtil.convertChinese2Char(name);
        ValidateUtil.isFalse(codes.size() < 2, PARAMS_ERROR, "invalid name");
        return codes;
    }

}
