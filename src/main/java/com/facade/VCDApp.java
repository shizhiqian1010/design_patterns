package com.facade;

/**
 * @ClassName VCDApp
 * @Description
 * @Author ShiZhiQian
 * @Date 2020/4/11 22:00
 **/
public class VCDApp implements App {

    @Override
    public void on() {
        System.out.println("打开 VCD 电源~~");
    }

    @Override
    public void init() {
        System.out.println("VCD 机器启动初始化中。。。");
    }

    @Override
    public void set(String type) {
        System.out.println("向 VCD 中放入光碟~~~~" + type);
    }

    @Override
    public void run() {
        System.out.println("VCD 开始运行，电视开始播放光碟内的内容。。。");
    }

    @Override
    public void suspend() {
        System.out.println("休息一下，暂停播放");
    }

    @Override
    public void quit() {
        System.out.println("不看了，关闭 VCD~~");
    }

    @Override
    public void off() {
        System.out.println("关闭 VCD 电源。。。");
    }
}
