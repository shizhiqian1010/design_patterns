package com.strategy.DuckEntity;

import com.strategy.Behavior.FlyBehavior;
import com.strategy.Behavior.QuackBehavior;

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
