package com.cc.twentythree.start.strategy;

import lombok.Data;

/**
 * @author cc
 * @date 2021/9/13 21:10
 */
@Data
public abstract class Duck {
    /**
     * 抽象方法，让具体的鸭子具体实现
     */
    public abstract void display ();
    public void quack (){
        System.out.println("鸭子嘎嘎叫");
    }
    public void swim (){
        System.out.println("鸭子游泳");
    }
    public void fly (){
        System.out.println("鸭子飞翔");
    }
}
