package com.strategy.behavior;

/**
 * @ClassName FlyNoWay
 * @Description
 * @Author ShiZhiQian
 * @Date 2020/4/4 16:29
 **/
public class FlyNoWay implements FlyBehavior {

    @Override
    public void fly() {
        System.out.println("不会飞~~~~~");
    }
}
