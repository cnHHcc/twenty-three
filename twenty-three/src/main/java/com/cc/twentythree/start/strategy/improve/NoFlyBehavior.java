package com.cc.twentythree.start.strategy.improve;

/**
 * @author cc
 * @date 2021/9/13 21:31
 */
public class NoFlyBehavior implements FlyBehavior {
    @Override
    public void fly() {
        System.out.println("不能飞");
    }
}
