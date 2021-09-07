package com.cc.twentythree.start.single.type07;

/**
 * @author chenchao
 * @version V1.0
 * @date 2021/9/7 9:49
 * 静态内部类（线程安全） 优秀
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
    //静态内部类  当Single被装在的时候，SingleInstance并不会被装在，符合懒加载
    private static class SingleInstance {
        private static final Single SINGLE = new Single();
    }
    //公共方法，里面调用静态内部类
    public static Single getInstance(){
        //此时调用静态内部类，才会被装在，只会装在一次，是线程安全的
        return SingleInstance.SINGLE;
    }
}