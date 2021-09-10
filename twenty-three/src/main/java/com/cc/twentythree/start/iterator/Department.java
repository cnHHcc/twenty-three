package com.cc.twentythree.start.iterator;

import lombok.Data;

/**
 * @author chenchao
 * @version V1.0
 * @date 2021/9/10 14:02
 * 系
 */
@Data
public class Department {
    private String name;
    private String des;

    public Department(String name, String des) {
        this.name = name;
        this.des = des;
    }
}

