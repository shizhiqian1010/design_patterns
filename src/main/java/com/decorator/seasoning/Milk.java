package com.decorator.seasoning;

import com.decorator.Beverage;

/**
 * @ClassName Milk
 * @Description 可选原料：牛奶
 * @Author ShiZhiQian
 * @Date 2020/4/5 19:40
 **/
public class Milk extends Condiment {

    Beverage beverage;

    public Milk(Beverage beverage) {
        this.beverage = beverage;
    }

    @Override
    public String getDescription() {
        return beverage.getDescription() + "、加牛奶";
    }

    @Override
    public double cost() {
        return beverage.cost() + 1.5;
    }
}
