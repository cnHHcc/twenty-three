package com.cc.twentythree.start.command;

/**
 * @author chenchao
 * @version V1.0
 * @date 2021/9/9 18:43
 * 开灯命令实现类
 */
public class LightOnCommand implements Command{

    private LightReceiver lightReceiver;

    public LightOnCommand(LightReceiver lightReceiver) {
        this.lightReceiver = lightReceiver;
    }

    @Override
    public void execute() {
        lightReceiver.on();
    }

    @Override
    public void undo() {
        lightReceiver.off();
    }
}
