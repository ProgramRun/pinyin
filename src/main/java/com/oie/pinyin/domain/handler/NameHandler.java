package com.oie.pinyin.domain.handler;

import com.google.common.base.Joiner;
import com.oie.pinyin.common.Joiners;
import com.oie.pinyin.common.Splitters;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

/**
 * @author oie
 * @date 2020/9/2 17:52
 * @description
 */
public class NameHandler implements Handler<List<String>> {

    List<String> py;
    String separator;

    NameHandler(List<String> py, String separator) {
        this.py = py;
        this.separator = separator;
    }

    public static NameHandler of(List<String> py, String separator) {
        return new NameHandler(py, separator);
    }

    @Override
    public List<String> handle() {
        List<String> res = Collections.emptyList();
        Iterator<String> it = py.iterator();
        if (it.hasNext()) {
            res = Splitters.customize(null).splitToList(it.next());
        }

        Joiner joiner = Joiners.customize(separator);
        while (it.hasNext()) {
            res = join(res, Splitters.customize(null).split(it.next()), joiner);
        }
        return res;
    }

    List<String> join(Iterable<String> it1, Iterable<String> it2, Joiner joiner) {
        List<String> res = new ArrayList<>();
        it1.forEach(s1 -> it2.forEach(s2 -> res.add(joiner.join(s1, s2))));
        return res;
    }


}
