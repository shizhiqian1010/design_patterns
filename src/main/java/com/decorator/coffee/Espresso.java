package com.decorator.coffee;

/**
 * @ClassName Espresso
 * @Description 浓缩咖啡
 * @Author ShiZhiQian
 * @Date 2020/4/5 19:33
 **/
public class Espresso extends Coffee {

    public Espresso() {
        description = "Espresso";
    }

    @Override
    public double cost() {
        return 20;
    }
}
