package com.templateMethod;

/**
 * @ClassName CaffeiineBeverage
 * @Description
 * @Author ShiZhiQian
 * @Date 2020/4/12 14:53
 **/
public abstract class CaffeiineBeverage {

    public void prepareRecipe(){
        boilWater();
        brew();
        pourInCup();
        addCondiments();
    }


    public void boilWater(){
        System.out.println("Boiling water");
    }

    public abstract void brew();

    public void pourInCup(){
        System.out.println("Pouring into cup");
    }

    public abstract void addCondiments();



}
