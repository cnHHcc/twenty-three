package com.cc.twentythree.start.single.type01;

/**
 * @author chenchao
 * @version V1.0
 * @date 2021/9/7 9:31
 * 饿汉式（静态变量） 级别：可用
 * 在类装在的时候就完成了实例化，没有达到懒加载的效果，如果这个类一直没有被用到，会导致内存浪费
 * 如果确定一定会使用这个类，那这个方法是最简洁方便的
 */
public class Single01 {
    public static void main(String[] args) {
        Single instance = Single.getInstance();
        Single instance1 = Single.getInstance();
        System.out.println(instance==instance1);//true
        System.out.println(instance.hashCode());//290658609
        System.out.println(instance1.hashCode());//290658609   hashCode也是相等的
    }
}
class Single {
    //1.创建一个私有的构造器，使得外部不能够new该对象
    private Single (){

    }
    //2.一个静态的常量实例
    private static final Single SINGLE = new Single();
    //3.公用的获取该类的方法，供外部使用
    public static Single getInstance(){
        return SINGLE;
    }
}