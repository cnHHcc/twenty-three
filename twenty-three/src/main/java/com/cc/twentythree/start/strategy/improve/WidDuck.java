package com.cc.twentythree.start.strategy.improve;

import lombok.Data;

/**
 * @author cc
 * @date 2021/9/13 21:12
 * 野鸭，假设野鸭飞的很好
 */
@Data
public class WidDuck extends Duck {

    public WidDuck (){
       flyBehavior = new GoodFlyBehavior();
    }
    @Override
    public void display() {
        System.out.println("我是野鸭子");
    }
}
