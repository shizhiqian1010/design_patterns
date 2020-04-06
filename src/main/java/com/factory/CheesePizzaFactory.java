package com.factory;

/**
 * @ClassName CheesePizzaFactory
 * @Description
 * @Author ShiZhiQian
 * @Date 2020/4/6 14:51
 **/
public class CheesePizzaFactory implements Factory {

    @Override
    public Pizza newInstance() {
        System.out.println("制作奶油披萨~~~~~~");
        return new CheesePizza();
    }
}
