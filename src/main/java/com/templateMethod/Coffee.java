package com.templateMethod;

/**
 * @ClassName Coffee
 * @Description
 * @Author ShiZhiQian
 * @Date 2020/4/12 14:57
 **/
public class Coffee extends CaffeiineBeverage {
    @Override
    public void addCondiments() {
        System.out.println("Adding Sugar and Milk");
    }

    @Override
    public void brew() {
        System.out.println("Dripping Coffee through filter");
    }
}
