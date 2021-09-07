package com.cc.twentythree.start.factory.simplefactory.pizzastore.pizza;

/**
 * @author chenchao
 * @version V1.0
 * @date 2021/9/7 13:48
 */
public class PepperPizza extends Pizza{
    @Override
    public void prepare() {
        System.out.println("制作胡椒披萨，原材料准备中");
    }
}
