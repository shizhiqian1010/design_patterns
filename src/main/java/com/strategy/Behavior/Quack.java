package com.strategy.Behavior;

/**
 * @ClassName Quack
 * @Description
 * @Author ShiZhiQian
 * @Date 2020/4/4 16:36
 **/
public class Quack implements QuackBehavior {

    @Override
    public void quack() {
        System.out.println("大白鸭，呱呱叫~~~~~~");
    }
}
