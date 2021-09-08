package com.cc.twentythree.start.prototype.improve.simpleclone;

/**
 * @author chenchao
 * @version V1.0
 * @date 2021/9/7 16:47
 */
public class Client {
    public static void main(String[] args) throws CloneNotSupportedException {
        Sheep sheep1 = new Sheep("tom", 1, "白色");
        sheep1.setFriend(new Sheep("jerry", 2, "黑色"));
        Sheep sheep2 = (Sheep) sheep1.clone();
        Sheep sheep3 = (Sheep) sheep1.clone();
        Sheep sheep4 = (Sheep) sheep1.clone();
        Sheep sheep5 = (Sheep) sheep1.clone();
        System.out.println(sheep1);
        System.out.println(sheep2);
        System.out.println(sheep3);
        System.out.println(sheep4);
        System.out.println(sheep5);
        //打印结果显示，是这个friend的实体类（引用数据类型）是能被克隆到的（是值的克隆，并不是创建一个新的对象）
        //但是，并不是像Sheep主体里的基本数据类型(克隆中，把String类型也看作是基本数据类型)，克隆出了新的，而是将这个friend的实体的地址克隆了
        //克隆出来的Sheep类中的friend只是指向了sheep1中friend的地址，并不是生成一个新的对象
        //此时如果sheep1修改了friend的值，所有克隆出来的类的friend也会发生修改
        //以上就是浅拷贝
        System.out.println(sheep1 == sheep2);
        System.out.println(sheep1.getFriend() == sheep2.getFriend());
    }
}
