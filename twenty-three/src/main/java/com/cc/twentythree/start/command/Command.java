package com.cc.twentythree.start.command;

/**
 * @author chenchao
 * @version V1.0
 * @date 2021/9/9 18:38
 * 命令接口（可以是接口，也可以是抽象类）
 */
public interface Command {
    /**
     * 执行命令
     */
    public void execute ();

    /**
     * 撤销命令
     */
    public void undo ();

}
