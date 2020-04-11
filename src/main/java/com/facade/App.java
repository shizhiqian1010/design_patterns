package com.facade;

/**
 * @ClassName App
 * @Description
 * @Author ShiZhiQian
 * @Date 2020/4/11 21:56
 **/
public interface App {
    // 打开电源
    void on();
    // 初始化
    void init();
    // 配置
    void set(String type);
    // 运行
    void run();
    // 暂停
    void suspend();
    // 退出
    void quit();
    // 关闭电源
    void off();






}
