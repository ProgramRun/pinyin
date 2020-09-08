package com.oie.pinyin.domain.handler;

import com.oie.pinyin.domain.FullName;

import java.util.ArrayList;
import java.util.List;

/**
 * @author oie
 * @date 2020/9/2 18:27
 * @description
 */
public final class FullNameHandler implements Handler<List<FullName>> {

    private List<String> firstNames;
    private List<String> lastNames;


    public FullNameHandler(List<String> firstNames, List<String> lastNames) {
        this.firstNames = firstNames;
        this.lastNames = lastNames;
    }

    public static FullNameHandler of(List<String> firstNames, List<String> lastNames) {
        return new FullNameHandler(firstNames, lastNames);
    }

    @Override
    public List<FullName> handle() {
        List<FullName> result = new ArrayList<>(firstNames.size() * lastNames.size());
        lastNames.forEach(ln -> firstNames.forEach(fn -> {
            result.add(FullName.of(fn, ln));
        }));
        return result;
    }
}
