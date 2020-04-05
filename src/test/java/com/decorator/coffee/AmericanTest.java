package com.decorator.coffee;

import com.decorator.Beverage;
import com.decorator.seasoning.Milk;
import com.decorator.seasoning.Sugar;
import org.junit.Test;

public class AmericanTest {

    @Test
    public void text(){

        Beverage beverage = new American();
        beverage = new Sugar(beverage);
        beverage = new Milk(beverage);

        System.out.println(beverage.getDescription() + "---------------" + beverage.cost());




    }

}