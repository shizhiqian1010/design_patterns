package com.adapter;

import java.util.Enumeration;
import java.util.Iterator;

/**
 * @ClassName EnumerationInterator
 * @Description
 * @Author ShiZhiQian
 * @Date 2020/4/11 14:26
 *
 * @see java.util.Iterator
 * @see java.util.Enumeration
 **/
public class EnumerationInterator implements Iterator {

    Enumeration enumeration;


    public EnumerationInterator(Enumeration enumeration) {
        this.enumeration = enumeration;
    }

    @Override
    public void remove() {
        throw new UnsupportedOperationException();
    }


    @Override
    public boolean hasNext() {
        return enumeration.hasMoreElements();
    }

    @Override
    public Object next() {
        return enumeration.nextElement();
    }
}
