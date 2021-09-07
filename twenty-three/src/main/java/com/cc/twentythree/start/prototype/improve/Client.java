package com.cc.twentythree.start.prototype.improve;

/**
 * @author chenchao
 * @version V1.0
 * @date 2021/9/7 16:47
 */
public class Client {
    public static void main(String[] args) throws CloneNotSupportedException {
        Sheep sheep1 = new Sheep("tom", 1, "白色");
        Sheep sheep2 = (Sheep)sheep1.clone();
        Sheep sheep3 = (Sheep)sheep1.clone();
        Sheep sheep4 = (Sheep)sheep1.clone();
        Sheep sheep5 = (Sheep)sheep1.clone();
    }
}
