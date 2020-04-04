package com.observer;

import com.observer.subject.Subject;

/**
 * @ClassName DisplayElement
 * @Description 观察者【显示】接口
 * @Author ShiZhiQian
 * @Date 2020/4/4 20:02
 **/
public interface DisplayElement {

    void display(Subject subject);
}
