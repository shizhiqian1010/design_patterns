package com.observer.subject;

import com.observer.observer.Observer;

/**
 * @ClassName Subject
 * @Description     主题 接口
 * @Author ShiZhiQian
 * @Date 2020/4/4 19:56
 *
 *  @see java.util.Observable
 **/
public interface Subject {

    String getName();

    void registerObserver(Observer observer);
    void removeObserver(Observer observer);
    void notifyObserver();
}
