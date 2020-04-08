package com.command;

import java.util.Arrays;

/**
 * @ClassName RemoteControlWithUndo
 * @Description
 * @Author ShiZhiQian
 * @Date 2020/4/8 21:31
 **/
public class RemoteControlWithUndo {

    private static final int controlSize = 7;

    Command[] onCommands;
    Command[] offCommands;

    Command undoCommand;

    public RemoteControlWithUndo() {
        onCommands = new Command[controlSize];
        offCommands = new Command[controlSize];

        Command noCommand = new NoCommand();
        for (int i = 0;i <controlSize;i++){
            onCommands[i] = noCommand;
            offCommands[i] = noCommand;
        }
        undoCommand = noCommand;
    }



    public void setCommandd(int controlId,Command onCommand,Command offCommand) {
        onCommands[controlId] = onCommand;
        offCommands[controlId] = offCommand;
    }

    public void onButtonWasPushed(int controlId){

        onCommands[controlId].execute();
        undoCommand = onCommands[controlId];

    }

    public void offButtonWasPushed(int controlId){
        offCommands[controlId].execute();
        undoCommand = offCommands[controlId];
    }

    public void undoButtonWasPushed(){
        undoCommand.undo();
    }


    @Override
    public String toString() {
        return "RemoteControlWithUndo{" +
                "onCommands=" + Arrays.toString(onCommands) +
                ", offCommands=" + Arrays.toString(offCommands) +
                ", undoCommand=" + undoCommand +
                '}';
    }
}
