package com.cc.twentythree.start.strategy;

/**
 * @author cc
 * @date 2021/9/13 21:15
 * 玩具鸭（假设玩具鸭不会叫，不会游泳，不会飞）（就需要重写父类的所有方法）
 * 这就使得父类Duck失去了存在的意义
 */
public class ToyDuck extends Duck {
    @Override
    public void display() {
        System.out.println("我是玩具鸭");
    }

    @Override
    public void quack() {
        System.out.println("玩具鸭不会叫");
    }

    @Override
    public void swim() {
        System.out.println("玩具鸭不会游泳");
    }

    @Override
    public void fly() {
        System.out.println("玩具鸭不会飞翔");
    }
}
