package com.command;

/**
 * @ClassName CeilingFanLowCommand
 * @Description
 * @Author ShiZhiQian
 * @Date 2020/4/8 21:49
 **/
public class CeilingFanLowCommand extends AbstractCommand implements Command {

    public CeilingFanLowCommand(CeilingFan ceilingFan) {
        this.ceilingFan = ceilingFan;
    }

    @Override
    public void execute() {
        prevSpeed = ceilingFan.getSpeed();
        ceilingFan.low();
    }

}
