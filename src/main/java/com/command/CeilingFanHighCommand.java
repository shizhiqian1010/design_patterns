package com.command;

/**
 * @ClassName CeilingFanHighCommand
 * @Description
 * @Author ShiZhiQian
 * @Date 2020/4/8 21:49
 **/
public class CeilingFanHighCommand extends AbstractCommand implements Command {



    public CeilingFanHighCommand(CeilingFan ceilingFan) {
        this.ceilingFan = ceilingFan;
    }

    @Override
    public void execute() {
        prevSpeed = ceilingFan.getSpeed();
        ceilingFan.high();
    }


}
