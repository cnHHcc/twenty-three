package com.cc.twentythree.start.factory.simplefactory.pizzastore.pizza;

/**
 * @author chenchao
 * @version V1.0
 * @date 2021/9/7 13:30
 */
public class GreekPizza extends Pizza{
    @Override
    public void prepare() {
        System.out.println("制作希腊披萨，准备原材料");
    }
}
