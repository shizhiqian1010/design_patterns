package com.strategy.DuckEntity;

import com.strategy.Behavior.FlyWithWings;
import com.strategy.Behavior.Quack;
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