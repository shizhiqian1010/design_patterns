package com.singleton;

/**
 * @ClassName SingletonPattern
 * @Description
 * @Author ShiZhiQian
 * @Date 2020/4/6 22:22
 **/
public class SingletonPattern {
    private SingletonPattern() {

    }

    // 懒汉模式
    private static SingletonPattern singletonPattern;

    public static SingletonPattern getInstance() {
        if (singletonPattern == null) {
            System.out.println("懒汉模式创建实例");
            singletonPattern = new SingletonPattern();
        }
        return singletonPattern;
    }

    // 饿汉模式
    private static SingletonPattern getSingletonPattern = new SingletonPattern();

    public static SingletonPattern getSingletonPattern() {
        System.out.println("饿汉模式创建对象");
        return getSingletonPattern;
    }

    // 线程安全处理
    private static volatile SingletonPattern pattern;

    public static SingletonPattern pattern() {
        if (pattern == null) {
            synchronized (SingletonPattern.class) {
                if (pattern == null) {
                    System.out.println("线程安全的单例模式");
                    pattern = new SingletonPattern();
                }
            }
        }
        return pattern;
    }


}
