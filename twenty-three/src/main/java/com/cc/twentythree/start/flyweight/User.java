package com.cc.twentythree.start.flyweight;

import lombok.Data;

/**
 * @author chenchao
 * @version V1.0
 * @date 2021/9/9 14:33
 * 外部状态，不可控的
 */
@Data
public class User {
    private String name;

    public User(String name) {
        this.name = name;
    }
}
