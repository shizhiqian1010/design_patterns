package com.strategy.behavior;

/**
 * @ClassName FlyWithWings
 * @Description
 * @Author lenovo
 * @Date 2020/4/4 16:28
 **/
public class FlyWithWings implements FlyBehavior {

    @Override
    public void fly() {
        System.out.println("飞翔中~~~~~~");
    }
}
