package com.cc.twentythree.start.factory.factorymethod.pizzastore.pizza;

/**
 * @author chenchao
 * @version V1.0
 * @date 2021/9/7 13:29
 */
public class LdCheesePizza extends Pizza {
    @Override
    public void prepare() {
        setName("伦敦奶酪披萨");
        System.out.println("制作伦敦奶酪披萨，准备原材料");
    }
}
