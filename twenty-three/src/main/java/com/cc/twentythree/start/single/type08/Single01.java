package com.cc.twentythree.start.single.type08;

/**
 * @author chenchao
 * @version V1.0
 * @date 2021/9/7 11:09
 * 枚举（线程安全） 优秀
 */
public class Single01 {
    public static void main(String[] args) {
        Single single = Single.SINGLE;
        Single single1 = Single.SINGLE;
        System.out.println(single == single1);
        System.out.println(single.hashCode());
        System.out.println(single1.hashCode());
        single.method();
    }
}
enum Single {
    SINGLE;
    public void method (){
        System.out.println("OK");
    }
}