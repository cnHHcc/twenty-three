package com.cc.twentythree.start.strategy.improve;

/**
 * @author cc
 * @date 2021/9/13 21:30
 */
public class BadFlyBehavior implements FlyBehavior {
    @Override
    public void fly() {
        System.out.println("飞的很差");
    }
}
