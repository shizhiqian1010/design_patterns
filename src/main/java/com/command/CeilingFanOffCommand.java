package com.command;

/**
 * @ClassName CeilingFanOffCommand
 * @Description
 * @Author ShiZhiQian
 * @Date 2020/4/8 21:49
 **/
public class CeilingFanOffCommand extends AbstractCommand implements Command {


    public CeilingFanOffCommand(CeilingFan ceilingFan) {
        this.ceilingFan = ceilingFan;
    }

    @Override
    public void execute() {
        prevSpeed = ceilingFan.getSpeed();
        ceilingFan.off();
    }


}
