package com.factory;

/**
 * @ClassName Store
 * @Description
 * @Author ShiZhiQian
 * @Date 2020/4/6 15:
 *
 * @see PizzaStore
 *
 **/
public abstract class Store {
    Factory factory;

    public Pizza orderPizza(){
        Pizza pizza;
        pizza = factory.newInstance();
        pizza.prepare();
        pizza.bake();
        pizza.cut();
        pizza.box();

        return pizza;
    }
}
