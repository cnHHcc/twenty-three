package com.cc.twentythree.start.factory.factoryInterface.pizzastore.order;

/**
 * @author chenchao
 * @version V1.0
 * @date 2021/9/7 16:16
 */
public class PizzaStore {
    public static void main(String[] args) {
        //此时只需要传入不同的抽象工厂实现类，就可以满足相应的需求了
        new OrderPizza(new BjFactory());
    }
}
