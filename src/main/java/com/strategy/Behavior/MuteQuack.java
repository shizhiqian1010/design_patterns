package com.strategy.Behavior;

/**
 * @ClassName MuteQuack
 * @Description
 * @Author ShiZhiQian
 * @Date 2020/4/4 16:38
 **/
public class MuteQuack implements QuackBehavior {
    @Override
    public void quack() {
        System.out.println("哑巴鸭，不会叫！！！");
    }
}
