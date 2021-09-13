package com.cc.twentythree.start.strategy.improve;

import lombok.Data;

/**
 * @author cc
 * @date 2021/9/13 21:13
 * 北京鸭（假设北京鸭不会飞翔）
 */
@Data
public class PekingDuck extends Duck {

    public PekingDuck (){
        flyBehavior = new NoFlyBehavior();
    }
    @Override
    public void display() {
        System.out.println("我是北京鸭");
    }


}
