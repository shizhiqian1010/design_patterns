package com.decorator.coffee;

/**
 * @ClassName HouseBlend
 * @Description 拿铁咖啡
 * @Author ShiZhiQian
 * @Date 2020/4/5 19:36
 **/
public class Latte extends Coffee {

    public Latte() {
        description = "拿铁咖啡";
    }

    @Override
    public double cost() {
        return 35.8;
    }
}
