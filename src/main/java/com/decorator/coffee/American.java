package com.decorator.coffee;

/**
 * @ClassName American
 * @Description 美式咖啡
 * @Author ShiZhiQian
 * @Date 2020/4/5 19:34
 **/
public class American extends Coffee {

    public American() {
        description = "美式咖啡";
    }

    @Override
    public double cost() {
        return 28.9;
    }
}
