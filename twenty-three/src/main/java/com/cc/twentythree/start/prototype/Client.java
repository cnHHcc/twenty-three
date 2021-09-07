package com.cc.twentythree.start.prototype;

/**
 * @author chenchao
 * @version V1.0
 * @date 2021/9/7 16:47
 */
public class Client {
    public static void main(String[] args) {
        Sheep sheep1 = new Sheep("tom", 1, "白色");
        //这里三个属性，写起来还简单，如果属性多了就很麻烦。如果增加一个属性，所有的地方都得改。
        Sheep sheep2 = new Sheep(sheep1.getName(), sheep1.getAge(), sheep1.getColor());
        Sheep sheep3 = new Sheep(sheep1.getName(), sheep1.getAge(), sheep1.getColor());
        Sheep sheep4 = new Sheep(sheep1.getName(), sheep1.getAge(), sheep1.getColor());
        Sheep sheep5 = new Sheep(sheep1.getName(), sheep1.getAge(), sheep1.getColor());
        //......
    }
}
