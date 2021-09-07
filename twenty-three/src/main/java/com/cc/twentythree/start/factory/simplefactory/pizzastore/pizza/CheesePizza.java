package com.cc.twentythree.start.factory.simplefactory.pizzastore.pizza;

/**
 * @author chenchao
 * @version V1.0
 * @date 2021/9/7 13:29
 */
public class CheesePizza extends Pizza {
    @Override
    public void prepare() {
        System.out.println("制作奶酪披萨，准备原材料");
    }
}
