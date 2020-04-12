package com.templateMethod;

/**
 * @ClassName Tea
 * @Description
 * @Author ShiZhiQian
 * @Date 2020/4/12 14:59
 **/
public class Tea extends CaffeiineBeverage {

    @Override
    public void brew() {
        System.out.println("Steeping the tea");
    }

    @Override
    public void addCondiments() {
        System.out.println("Adding Lemon");
    }
}
