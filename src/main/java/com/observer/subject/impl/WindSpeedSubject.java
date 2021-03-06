package com.observer.subject.impl;

import com.google.gson.Gson;
import com.observer.Entity.Weather;
import com.observer.observer.Observer;
import com.observer.subject.Subject;

import java.util.ArrayList;
import java.util.List;

/**
 * @ClassName WindSpeedSubject
 * @Description
 * @Author ShiZhiQian
 * @Date 2020/4/4 20:03
 *
 * @see java.util.Observable
 **/
public class WindSpeedSubject implements Subject {
    // 观察者 列表
    private List<Observer> observerList;

    //风速相关数据
    private Weather weather;

    public WindSpeedSubject() {
        observerList = new ArrayList<>();
    }

    @Override
    public void registerObserver(Observer observer) {
        observerList.add(observer);
    }

    @Override
    public void removeObserver(Observer observer) {
        int i = observerList.indexOf(observer);
        if (i>=0){
            observerList.remove(i);
        }
    }

    @Override
    public void notifyObserver() {
        for (Observer observer : observerList){
            observer.update(this,weather);
        }
    }

    /**
     * 当有 风速数据 更新时，该方法被调用
     */
    public void setMeasurements(String args){
        Gson gson = new Gson();
        this.weather = gson.fromJson(args, Weather.class);
        this.notifyObserver();
    }

    @Override
    public String getName() {
        return "【风速】主题";
    }
}
