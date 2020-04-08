package com.command;

/**
 * @ClassName Command
 * @Description
 * @Author ShiZhiQian
 * @Date 2020/4/8 20:31
 **/
public interface Command {

    void execute();

    void undo();
}
