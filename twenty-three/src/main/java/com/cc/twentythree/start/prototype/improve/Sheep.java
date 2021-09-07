package com.cc.twentythree.start.prototype.improve;

import lombok.Data;

/**
 * @author chenchao
 * @version V1.0
 * @date 2021/9/7 16:46
 */
@Data
public class Sheep implements Cloneable{
    private String name;
    private Integer age;
    private String color;

    public Sheep(String name, Integer age, String color) {
        this.name = name;
        this.age = age;
        this.color = color;
    }

    /**
     * 克隆该实例，用Object自带的clone方法
     * @return
     * @throws CloneNotSupportedException
     */
    @Override
    protected Object clone() throws CloneNotSupportedException {
        Sheep sheep = null;
        try {
            sheep = (Sheep)super.clone();
        } catch (CloneNotSupportedException e) {
            System.out.println(e.getMessage());
        }
        return sheep;
    }
}
