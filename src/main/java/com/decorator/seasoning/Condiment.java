package com.decorator.seasoning;

import com.decorator.Beverage;

/**
 * @ClassName Condiment
 * @Description 可选原料 抽象类
 * @Author ShiZhiQian
 * @Date 2020/4/5 19:28
 **/
public abstract class Condiment extends Beverage {

    public abstract String getDescription();

}
