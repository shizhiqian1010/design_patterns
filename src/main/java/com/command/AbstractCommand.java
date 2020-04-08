package com.command;

/**
 * @ClassName AbstractCommand
 * @Description
 * @Author ShiZhiQian
 * @Date 2020/4/8 22:13
 **/
public abstract class AbstractCommand implements Command {

    CeilingFan ceilingFan;
    int prevSpeed;

    @Override
    public void undo() {
        if (prevSpeed == CeilingFan.OFF) {
            ceilingFan.off();
        } else if (prevSpeed == CeilingFan.HIGH) {
            ceilingFan.high();
        } else if (prevSpeed == CeilingFan.LOW) {
            ceilingFan.low();
        } else if (prevSpeed == CeilingFan.MEDIUM) {
            ceilingFan.medium();
        }
    }

    @Override
    public String toString() {
        return "{" +
                "ceilingFan=" + ceilingFan +
                ", prevSpeed=" + prevSpeed +
                '}';
    }
}
