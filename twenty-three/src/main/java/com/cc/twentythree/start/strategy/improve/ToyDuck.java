package com.cc.twentythree.start.strategy.improve;

import lombok.Data;

/**
 * @author cc
 * @date 2021/9/13 21:15
 * 玩具鸭（假设玩具鸭不会叫，不会游泳，不会飞）
 */
@Data
public class ToyDuck extends Duck {

    public ToyDuck (){
        flyBehavior = new NoFlyBehavior();
    }
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

}
