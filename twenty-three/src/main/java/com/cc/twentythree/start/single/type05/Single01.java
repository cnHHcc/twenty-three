package com.cc.twentythree.start.single.type05;

/**
 * @author chenchao
 * @version V1.0
 * @date 2021/9/7 9:49
 * 懒汉式（线程安全，同步代码块） 不可用
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
    public static Single getInstance(){
        //判断当前这个single是否为空，为空才创建新的
        if (single == null){
            //这里还是会存在问题，因为还是会存在多个线程同时通过判断进入到这里
            synchronized (Single.class){
                single = new Single();
            }
        }
        return single;
    }
}