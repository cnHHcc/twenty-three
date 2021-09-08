package com.cc.twentythree.start.prototype.improve.simpleclone;

import lombok.Data;

/**
 * @author chenchao
 * @version V1.0
 * @date 2021/9/7 16:46
 * 浅拷贝
 * 浅克隆：会将类的基本数据类型复制一个新的出来，复制出来的hashCode和原来的是不相等的，不是同一个地址。
 *       而如果是引用数据类型的话，只是将地址复制给了克隆出来的对象，并不是重新创建一个一模一样的对象给克隆出来的对象
 */
@Data
public class Sheep implements Cloneable{
    private String name;
    private Integer age;
    private String color;
    //此时如果我们的实体类里有另一个实体类，这时候我们用这种浅克隆，看看克隆效果
    private Sheep friend;

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
