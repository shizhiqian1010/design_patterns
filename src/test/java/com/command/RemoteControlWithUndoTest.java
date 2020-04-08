package com.command;

import org.junit.Test;

public class RemoteControlWithUndoTest {

    @Test
    public void test(){


        RemoteControlWithUndo remoteControlWithUndo = new RemoteControlWithUndo();
        CeilingFan ceilingFan = new CeilingFan("卧室");

        CeilingFanHighCommand ceilingFanHighCommand = new CeilingFanHighCommand(ceilingFan);

        CeilingFanLowCommand ceilingFanLowCommand = new CeilingFanLowCommand(ceilingFan);

        CeilingFanOffCommand ceilingFanOffCommand = new CeilingFanOffCommand(ceilingFan);


        remoteControlWithUndo.setCommandd(1,ceilingFanHighCommand,ceilingFanOffCommand);
        remoteControlWithUndo.setCommandd(2,ceilingFanLowCommand,ceilingFanOffCommand);

        remoteControlWithUndo.onButtonWasPushed(1);
        remoteControlWithUndo.offButtonWasPushed(1);
        System.out.println(remoteControlWithUndo);
        remoteControlWithUndo.undoButtonWasPushed();

        remoteControlWithUndo.onButtonWasPushed(2);
        System.out.println(remoteControlWithUndo);
        remoteControlWithUndo.offButtonWasPushed(2);
    }

}