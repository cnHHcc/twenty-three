package com.cc.twentythree.start.strategy;

/**
 * @author cc
 * @date 2021/9/13 21:13
 * 北京鸭（假设北京鸭不会飞翔，要重写Duck的fly方法）
 */
public class PekingDuck extends Duck {
    @Override
    public void display() {
        System.out.println("我是北京鸭");
    }

    @Override
    public void fly() {
        System.out.println("北京鸭不会飞翔");
    }
}
