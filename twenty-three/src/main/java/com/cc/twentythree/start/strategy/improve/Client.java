package com.cc.twentythree.start.strategy.improve;

/**
 * @author cc
 * @date 2021/9/13 21:38
 */
public class Client {
    public static void main(String[] args) {

        WidDuck widDuck = new WidDuck();
        widDuck.fly();
        //动态修改野鸭   使其不能飞

        widDuck.setFlyBehavior(new NoFlyBehavior());
        widDuck.fly();
    }
}
