package com.cc.twentythree.start.factory.simplefactory.pizzastore.order;

/**
 * @author chenchao
 * @version V1.0
 * @date 2021/9/7 13:38
 * 相当于一个客户端，订购服务
 */
public class PizzaStore {
    public static void main(String[] args) {
        OrderPizza orderPizza = new OrderPizza(new SimpleFactory());
    }
}
