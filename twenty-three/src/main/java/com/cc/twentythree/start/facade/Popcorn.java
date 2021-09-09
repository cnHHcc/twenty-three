package com.cc.twentythree.start.facade;

/**
 * @author chenchao
 * @version V1.0
 * @date 2021/9/9 11:02
 * 爆米花机
 */
public class Popcorn {
    //饿汉式单例
    private static final Popcorn POPCORN = new Popcorn();

    public static Popcorn getInstance() {
        return POPCORN;
    }

    public void on() {
        System.out.println("popcorn on");
    }

    public void off() {
        System.out.println("popcorn off");
    }

    public void pop() {
        System.out.println("popcorn pop");
    }

}
