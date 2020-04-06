package com.decorator.seasoning;

import com.decorator.Beverage;

/**
 * @ClassName Condiment
 * @Description 可选原料 抽象类
 * @Author ShiZhiQian
 * @Date 2020/4/5 19:28
 *
 * @see java.io.FilterInputStream
 * @see java.io.FilterOutputStream
 *
 * @see java.io.FilterReader
 * @see java.io.FilterWriter
 **/
public abstract class Condiment extends Beverage {

    Beverage beverage;

    public abstract String getDescription();

}
