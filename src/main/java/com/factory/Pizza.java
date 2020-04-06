package com.factory;

/**
 * @ClassName Pizza
 * @Description
 * @Author ShiZhiQian
 * @Date 2020/4/6 14:45
 *
 * @see CheesePizza
 * @see VeggiePizza
 *
 **/
public abstract class Pizza {
    String pizzaName = "";

    public void prepare(){
        System.out.println("准备制作"+pizzaName+"~~~");
    }

    public void bake(){
        System.out.println("准备烤制"+pizzaName+"~~~");
    }

    public void cut(){
        System.out.println("准备切"+pizzaName+"~~~");
    }

    public void box(){
        System.out.println("准备包装"+pizzaName+"~~~");
    }
}
