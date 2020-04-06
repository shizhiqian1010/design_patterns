package com.factory;

/**
 * @ClassName VeggiePizzaFactory
 * @Description
 * @Author ShiZhiQian
 * @Date 2020/4/6 14:51
 **/
public class VeggiePizzaFactory implements Factory {

    @Override
    public Pizza newInstance() {
        System.out.println("制作素食披萨~~~");
        return new VeggiePizza();
    }
}
