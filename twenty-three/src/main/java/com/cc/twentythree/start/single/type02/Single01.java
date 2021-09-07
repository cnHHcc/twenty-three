package com.cc.twentythree.start.single.type02;

/**
 * @author chenchao
 * @version V1.0
 * @date 2021/9/7 9:31
 * 饿汉式（静态代码块） 级别：可用
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
    private Single (){

    }
    private static Single single;
    //在静态代码块中创建实例对象
    static {
        single = new Single();
    }
    public static Single getInstance(){
        return single;
    }
}