package com.cc.twentythree.start.command;

/**
 * @author chenchao
 * @version V1.0
 * @date 2021/9/9 18:45
 */
public class LightOffCommand implements Command{
    private LightReceiver lightReceiver;

    public LightOffCommand(LightReceiver lightReceiver) {
        this.lightReceiver = lightReceiver;
    }

    @Override
    public void execute() {
        lightReceiver.off();
    }

    @Override
    public void undo() {
        lightReceiver.on();
    }
}
