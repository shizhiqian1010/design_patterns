package com.singleton;

import org.junit.Test;

public class SingletonTest {


    @Test
    public void test(){

        Student instance = Student.getInstance();
        Student instance1 = Student.getInstance();
        System.out.println(instance == instance1);

        SingletonPattern instance2 = SingletonPattern.getInstance();

        SingletonPattern singletonPattern = SingletonPattern.getSingletonPattern();
        System.out.println(instance2 == singletonPattern);

        SingletonPattern pattern = SingletonPattern.pattern();
        System.out.println(pattern == singletonPattern);
        System.out.println(pattern == instance2);


    }
}