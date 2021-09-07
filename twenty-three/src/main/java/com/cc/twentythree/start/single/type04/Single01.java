package com.cc.twentythree.start.single.type04;

/**
 * @author chenchao
 * @version V1.0
 * @date 2021/9/7 9:49
 * 懒汉式（线程安全，同步方法） 效率低，不推荐使用
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
    private static Single single;
    private Single (){

    }
    //提供一个synchronized修饰的静态方法，当使用该方法时，才创建实例
    //但是这种方法效率太低，每个线程需要创建Single时，都会被堵塞在这里
    public static synchronized Single getInstance(){
        //判断当前这个single是否为空，为空才创建新的
        if (single == null){
            single = new Single();
        }
        return single;
    }
}