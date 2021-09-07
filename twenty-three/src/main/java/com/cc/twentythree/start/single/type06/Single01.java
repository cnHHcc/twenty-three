package com.cc.twentythree.start.single.type06;

/**
 * @author chenchao
 * @version V1.0
 * @date 2021/9/7 9:49
 * 懒汉式（双重校验） 优秀
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
    //用volatile修饰，使得线程可见
    private static volatile Single single;
    private Single (){

    }
    public static Single getInstance(){
        //判断当前这个single是否为空，为空才创建新的
        if (single == null){
            synchronized (Single.class){
                //进来之后在判断一次single是否为null，这里的判断是基于single是被volaile修饰的，不然线程是不可见的
                if (single == null){
                    single = new Single();
                }
            }
        }
        return single;
    }
}