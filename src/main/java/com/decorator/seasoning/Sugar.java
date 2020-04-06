package com.decorator.seasoning;

import com.decorator.Beverage;

/**
 * @ClassName Sugar
 * @Description 可选原料：糖
 * @Author ShiZhiQian
 * @Date 2020/4/5 19:39
 *
 * @see java.io.BufferedInputStream
 * @see java.io.DataInputStream
 * @see java.io.PushbackInputStream
 *
 * @see java.io.PushbackReader
 **/
public class Sugar extends Condiment {
    Beverage beverage;
    public Sugar(Beverage beverage) {
        this.beverage = beverage;
    }

    @Override
    public String getDescription() {
        return beverage.getDescription() + "、加糖";
    }

    @Override
    public double cost() {
        return beverage.cost() + 0.5;
    }
}
