package com.cc.twentythree.start.memento;

import lombok.Data;

/**
 * @author chenchao
 * @version V1.0
 * @date 2021/9/13 13:56
 */
@Data
public class Memento {
    private String state;

    public Memento(String state) {
        this.state = state;
    }
}
