package com.cc.twentythree.start.single.type03;

/**
 * @author chenchao
 * @version V1.0
 * @date 2021/9/7 9:49
 * 懒汉式（线程不安全） 单线程情况下可用
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
    //提供一个静态方法，当使用该方法时，才创建实例
    public static Single getInstance(){
        //判断当前这个single是否为空，为空才创建新的
        if (single == null){
            //这里如果A线程先通过判断进来，还没有进行创建，此时B线程也通过判断进来了。这就会导致线程A、B都会接着走下面new的逻辑
            //导致创建了两个Single实例
            single = new Single();
        }
        return single;
    }
}