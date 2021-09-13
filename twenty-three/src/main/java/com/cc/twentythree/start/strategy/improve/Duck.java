package com.cc.twentythree.start.strategy.improve;

import lombok.Data;

/**
 * @author cc
 * @date 2021/9/13 21:10
 * 假设所有的鸭子都会游泳，但是飞的本领和叫声不一样描述不一样
 */
@Data
public abstract class Duck {
    public FlyBehavior flyBehavior;
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
       if (flyBehavior != null){
           flyBehavior.fly();
       }
    }
}
