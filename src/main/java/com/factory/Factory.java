package com.factory;

/**
 * @ClassName Factory
 * @Description
 * @Author ShiZhiQian
 * @Date 2020/4/6 15:33
 *
 * @see  CheesePizzaFactory
 * @see  VeggiePizzaFactory
 *
 **/
public interface Factory {

    Pizza newInstance();

}
