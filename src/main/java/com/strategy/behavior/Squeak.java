package com.strategy.behavior;

/**
 * @ClassName Squeak
 * @Description
 * @Author ShiZhiQian
 * @Date 2020/4/4 16:37
 **/
public class Squeak implements QuackBehavior {
    @Override
    public void quack() {
        System.out.println("橡皮鸭 吱嘤吱嘤叫~~~");
    }
}
