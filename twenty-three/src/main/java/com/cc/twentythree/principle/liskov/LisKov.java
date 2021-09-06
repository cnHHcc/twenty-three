package com.cc.twentythree.principle.liskov;

/**
 * @author chenchao
 * @version V1.0
 * @date 2021/9/6 15:49
 * 里氏替换原则
 */
public class LisKov {
    public static void main(String[] args) {
        A a = new A();
        System.out.println(a.fun(11,3));
        System.out.println(a.fun(1,8));
        System.out.println("____________________");
        B b = new B();
        //本意是调用父类方法求出11与3的差，但是其实方法已经被重写了
        System.out.println(b.fun(11,3));
        //本意是调用父类方法求出1与8的差，但是其实方法已经被重写了
        System.out.println(b.fun(1,8));
        System.out.println(b.fun02(11,3));
    }
}

class A {
    public int fun(int a, int b) {
        return a - b;
    }
}

class B extends A {
    //无意间重写了父类A的方法
    @Override
    public int fun(int a, int b) {
        return a + b;
    }

    public int fun02(int a, int b) {
        return fun(a, b) + 9;
    }
}