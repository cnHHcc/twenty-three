package com.cc.twentythree.start.command;

/**
 * @author chenchao
 * @version V1.0
 * @date 2021/9/9 18:46
 * 空命令实现类
 */
public class NoCommand implements Command {
    @Override
    public void execute() {
        //空实现
    }

    @Override
    public void undo() {
        //空实现
    }
}
