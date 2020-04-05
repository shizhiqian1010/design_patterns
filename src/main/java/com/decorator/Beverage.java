package com.decorator;

/**
 * @ClassName Beverage
 * @Description
 * @Author ShiZhiQian
 * @Date 2020/4/5 19:26
 **/
public abstract class Beverage {

    protected String description = "Unknown Beverage";

    public String getDescription() {
        return description;
    }

    public abstract double cost();
}
