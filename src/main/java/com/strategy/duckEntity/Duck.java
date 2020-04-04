package com.strategy.duckEntity;

import com.strategy.behavior.FlyBehavior;
import com.strategy.behavior.QuackBehavior;

/**
 * @ClassName Duck
 * @Description
 * @Author ShiZhiQian
 * @Date 2020/4/4 16:46
 **/
public abstract class Duck {
    protected FlyBehavior flyBehavior;
    protected QuackBehavior quackBehavior;


    public abstract void display();

    public void fly(){
        flyBehavior.fly();
    };

    public void quack(){
        quackBehavior.quack();
    };
}
