package com.oie.pinyin.domain.handler;

import com.oie.pinyin.common.SpringContextUtil;
import com.oie.pinyin.dal.dao.ILastNameDAO;
import com.oie.pinyin.dal.entity.LastName;
import com.oie.pinyin.dal.entity.PinYin;

import java.util.ArrayList;
import java.util.List;

/**
 * @author oie
 * @date 2020/9/4 10:41
 * @description
 */
public abstract class BaseNameSegment implements Handler<Object> {

    private static final ILastNameDAO LAST_NAME_DAO = SpringContextUtil.getBean(ILastNameDAO.class);

    private static final int TWO_CHARACTER = 2;
    private static final int THREE_CHARACTER = 3;

    List<PinYin> pys;
    List<String> sourceFirstNamePY;
    List<String> sourceLastNamePY;

    BaseNameSegment(List<PinYin> pys, List<String> firstNamePY, List<String> lastNamePY) {
        this.pys = pys;
        this.sourceFirstNamePY = firstNamePY;
        this.sourceLastNamePY = lastNamePY;
    }

    public static BaseNameSegment of(PinYinType pinYinType, List<PinYin> pys, List<String> firstNamePY, List<String> lastNamePY) {
        switch (pinYinType) {
            case NORMAL:
                return NormalNameSegment.of(pys, firstNamePY, lastNamePY);
            case HONG_KANG:
                return HkNameSegment.of(pys, firstNamePY, lastNamePY);
            default:
                throw new UnsupportedOperationException("不支持的语种");
        }
    }

    @Override
    public Object handle() {
        switch (pys.size()) {
            case TWO_CHARACTER:
                handle2Character();
                break;
            case THREE_CHARACTER:
                handle3Character();
                break;
            default:
                handleMoreCharacter();
        }
        return null;
    }

    protected abstract void handle2Character();

    protected abstract void handle3Character();

    protected abstract void handleMoreCharacter();

    protected List<String> handlePinYin(List<PinYin> pys, int start, int end) {
        List<String> result = new ArrayList<>(end - start);
        for (int i = start; i < end; i++) {
            result.add(doHandle(pys.get(i)));
        }
        return result;
    }

    protected abstract String doHandle(PinYin py);

    String getLastName(List<PinYin> pys) {
        LastName ln = LAST_NAME_DAO.listByCharacter(pys.get(0).getCnCharacter().concat(pys.get(1).getCnCharacter()));
        return ln == null ? pys.get(0).getZhPinYin() : ln.getZhPinYin();
    }

    boolean is2CharacterSurname(String lastName) {
        return lastName.contains(" ");
    }

}
