package com.strategy.duckEntity;

import com.strategy.behavior.FlyBehavior;
import com.strategy.behavior.QuackBehavior;

/**
 * @ClassName MallardDuck
 * @Description
 * @Author ShiZhiQian
 * @Date 2020/4/4 16:49
 **/
public class MallardDuck extends Duck{

    public MallardDuck(FlyBehavior fly, QuackBehavior quack) {
        flyBehavior = fly;
        quackBehavior = quack;
    }

    @Override
    public void display() {
        System.out.println("绿头鸭~~~~");
    }

}
