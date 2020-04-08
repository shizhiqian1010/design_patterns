package com.command;

/**
 * @ClassName CeilingFanMediumCommand
 * @Description
 * @Author ShiZhiQian
 * @Date 2020/4/8 21:49
 **/
public class CeilingFanMediumCommand extends AbstractCommand implements Command {


    public CeilingFanMediumCommand(CeilingFan ceilingFan) {
        this.ceilingFan = ceilingFan;
    }

    @Override
    public void execute() {
        prevSpeed = ceilingFan.getSpeed();
        ceilingFan.medium();
    }

}
