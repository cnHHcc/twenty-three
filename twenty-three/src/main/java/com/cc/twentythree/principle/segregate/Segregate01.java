package com.cc.twentythree.principle.segregate;

/**
 * @author chenchao
 * @version V1.0
 * @date 2021/9/6 11:21
 */
public class Segregate01 {
    public static void main(String[] args) {

    }
}
interface Interface01 {
    void operation01 ();
    void operation02 ();
    void operation03 ();
    void operation04 ();
    void operation05 ();
}
class B implements Interface01 {

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

    @Override
    public void operation04() {
        System.out.println("B实现了operation04");
    }

    @Override
    public void operation05() {
        System.out.println("B实现了operation05");
    }
}

class D implements Interface01 {

    @Override
    public void operation01() {
        System.out.println("D实现了operation01");
    }

    @Override
    public void operation02() {
        System.out.println("D实现了operation02");
    }

    @Override
    public void operation03() {
        System.out.println("D实现了operation03");
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
//由于A和C并不是用到接口的所有方法，就没有起到接口隔离原则，客户端不应该依赖不需要的接口方法。
//改进见improve
/**
 * A只用到接口的123方法
 */
class A {
    public void depend01 (Interface01 i){
        i.operation01();
    }
    public void depend02 (Interface01 i){
        i.operation02();
    }
    public void depend03(Interface01 i){
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
    public void depend04 (Interface01 i){
        i.operation04();
    }
    public void depend05(Interface01 i){
        i.operation05();
    }
}