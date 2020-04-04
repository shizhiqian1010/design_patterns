package com.observer.observer;

import com.observer.Entity.Weather;
import com.observer.subject.Subject;

/**
 * @ClassName Observer
 * @Description 观察者接口
 * @Author ShiZhiQian
 * @Date 2020/4/4 19:58
 *
 * @see java.util.Observer
 **/
public interface Observer {

    void update(Subject subject, Weather weather);

}
