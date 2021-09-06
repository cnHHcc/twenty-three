package com.cc.twentythree.principle.liskov.improve;

import lombok.Data;

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
        System.out.println(b.fun(11,3));
        System.out.println(b.fun(1,8));
        System.out.println(b.fun02(11,3));
        //这样想调用减法就很明确了
        System.out.println(b.fun03(7,5));
    }
}
//创建一个更基础的Base类，让A、B都去继承Base类，让A、B的耦合度降低
class Base {

}
class A extends Base{
    public int fun(int a, int b) {
        return a - b;
    }
}
@Data
class B extends Base {
    //如果B类要使用A类的方法，使用一个组合的关系
    private A a = new A();

    public int fun(int a, int b) {
        return a + b;
    }

    public int fun02(int a, int b) {
        return fun(a, b) + 9;
    }

    //仍旧要用A类的相减方法
    public int fun03 (int a ,int b){
        return this.a.fun(a,b);
    }
}