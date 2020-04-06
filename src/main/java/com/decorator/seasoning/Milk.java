package com.decorator.seasoning;

import com.decorator.Beverage;

/**
 * @ClassName Milk
 * @Description 可选原料：牛奶
 * @Author ShiZhiQian
 * @Date 2020/4/5 19:40
 *
 * @see java.io.BufferedInputStream
 * @see java.io.DataInputStream
 * @see java.io.PushbackInputStream
 *
 * @see java.io.PushbackReader
 **/
public class Milk extends Condiment {

    public Milk(Beverage beverage) {
        super.beverage = beverage;
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
