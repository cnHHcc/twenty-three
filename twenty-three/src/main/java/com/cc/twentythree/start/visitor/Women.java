package com.cc.twentythree.start.visitor;

import lombok.Data;

/**
 * @author chenchao
 * @version V1.0
 * @date 2021/9/10 10:45
 */
@Data
public class Women extends Person{
    private String name;

    public Women(String name) {
        this.name = name;
    }

    /**
     * 这里我们使用了双分派，即首先在客户端程序中，将具体状态作为参数传递给Women中（第一次分派）
     * 然后Women类调用作为参数action的“具体方法”getWomenResult，同时将自己作为参数传入（第二次分派）
     * @param action
     */
    @Override
    public void accept(Action action) {
        action.getWomenResult(this);
    }
}
