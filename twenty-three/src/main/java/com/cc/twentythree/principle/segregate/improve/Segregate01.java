package com.cc.twentythree.principle.segregate.improve;

/**
 * @author chenchao
 * @version V1.0
 * @date 2021/9/6 11:21
 */
public class Segregate01 {
    public static void main(String[] args) {
        //具体使用
        A a = new A();
        a.depend01(new B());
        a.depend02(new B());
        a.depend03(new B());
        C c = new C();
        c.depend01(new D());
        c.depend04(new D());
        c.depend05(new D());
    }
}

interface Interface01 {
    void operation01 ();
}
interface Interface02 {
    void operation02 ();
    void operation03 ();
}
interface Interface03 {
    void operation04 ();
    void operation05 ();
}

class B implements Interface01,Interface02{

    @Override
    public void operation01() {
        System.out.println("B实现了operation01");
    }

    @Override
    public void operation02() {
        System.out.println("B实现了operation02");
    }

    @Override
    public void operation03() {
        System.out.println("B实现了operation03");
    }

}

class D implements Interface01,Interface03{
    @Override
    public void operation01() {
        System.out.println("D实现了operation01");
    }
    @Override
    public void operation04() {
        System.out.println("D实现了operation04");
    }

    @Override
    public void operation05() {
        System.out.println("D实现了operation05");
    }
}

/**
 * A只用到接口的123方法
 */
class A {
    public void depend01 (Interface01 i){
        i.operation01();
    }
    public void depend02 (Interface02 i){
        i.operation02();
    }
    public void depend03(Interface02 i){
        i.operation03();
    }
}

/**
 * C只用到接口的145方法
 */
class C {
    public void depend01 (Interface01 i){
        i.operation01();
    }
    public void depend04 (Interface03 i){
        i.operation04();
    }
    public void depend05(Interface03 i){
        i.operation05();
    }
}