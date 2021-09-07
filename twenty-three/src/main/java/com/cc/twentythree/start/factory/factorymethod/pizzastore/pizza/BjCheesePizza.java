package com.cc.twentythree.start.factory.factorymethod.pizzastore.pizza;

/**
 * @author chenchao
 * @version V1.0
 * @date 2021/9/7 13:29
 */
public class BjCheesePizza extends Pizza {
    @Override
    public void prepare() {
        setName("北京奶酪披萨");
        System.out.println("制作北京奶酪披萨，准备原材料");
    }
}
