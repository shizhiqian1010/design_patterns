package com.observer.observer.impl;

import com.observer.DisplayElement;
import com.observer.Entity.Weather;
import com.observer.observer.Observer;
import com.observer.subject.Subject;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * @ClassName CurrentConditionsDisplay
 * @Description     公告模板
 * @Author ShiZhiQian
 * @Date 2020/4/4 20:19
 **/
public class CurrentConditionsDisplay implements Observer, DisplayElement {

    private float temperature;
    private float humidity;

    private List<Subject> subjectList = new ArrayList<>();

    public CurrentConditionsDisplay(Subject... subjects) {
        this.subjectList.addAll(Arrays.asList(subjects));
        for (Subject subject : subjects) {
            subject.registerObserver(this);
        }
    }

    @Override
    public void display(Subject subject) {
        System.out.println("主题为：" + subject.getName());
        System.out.println("temperature : " + temperature + ";humidity : " + humidity + "~~~~~");
    }

    @Override
    public void update(Subject subject, Weather weather) {
            temperature = weather.getTemp();
            humidity = weather.getHumidity();
            display(subject);
    }

    public List<Subject> getSubjectList() {
        return subjectList;
    }

    public void setSubjectList(List<Subject> subjectList) {
        this.subjectList = subjectList;
    }
}
