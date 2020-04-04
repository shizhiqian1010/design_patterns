package com.strategy.duckEntity;

import com.strategy.behavior.FlyWithWings;
import com.strategy.behavior.Quack;
import org.junit.Test;

public class MallardDuckTest {

    @Test
    public void test(){
        Duck duck = new MallardDuck(new FlyWithWings(),new Quack());
        duck.fly();
        duck.quack();
        duck.display();
    }


}