package com.cc.twentythree.start.prototype;

import lombok.Data;

/**
 * @author chenchao
 * @version V1.0
 * @date 2021/9/7 16:46
 */
@Data
public class Sheep {
    private String name;
    private Integer age;
    private String color;

    public Sheep(String name, Integer age, String color) {
        this.name = name;
        this.age = age;
        this.color = color;
    }
}
