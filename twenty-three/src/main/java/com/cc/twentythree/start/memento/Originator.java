package com.cc.twentythree.start.memento;

import lombok.Data;

/**
 * @author chenchao
 * @version V1.0
 * @date 2021/9/13 13:54
 * 需要备忘的实体类
 */
@Data
public class Originator {
    private String state;

    /**
     * 保存当前状态，生成一个Memento类
     * @param state
     * @return
     */
    public Memento saveMemento (String state){
        return new Memento (state);
    }

    /**
     * 恢复状态，将Memento的状态赋值于Originator
     * @param memento
     */
    public void recoveryState (Memento memento){
        this.state = memento.getState();
    }
}
