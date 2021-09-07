package com.cc.twentythree.start.factory.factorymethod.pizzastore.order;


import com.cc.twentythree.start.factory.factorymethod.pizzastore.pizza.Pizza;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * @author chenchao
 * @version V1.0
 * @date 2021/9/7 13:31
 * 订购披萨
 */
public abstract class OrderPizza {
    /**
     * 抽象方法，具体的实现交给子类完成
     * @param orderType
     * @return
     */
    public abstract Pizza createPizza(String orderType);
    public OrderPizza (){
        Pizza pizza = null;
        String orderType;
        do {
            orderType = getType();
            pizza = createPizza(orderType);
            pizza.prepare();
            pizza.bake();
            pizza.cut();
            pizza.box();
        } while (true);
    }
    private String getType() {
        try {
            BufferedReader strin = new BufferedReader(new InputStreamReader(System.in));
            System.out.println("input pizza type:");
            return strin.readLine();
        } catch (IOException e) {
            e.printStackTrace();
            return "";
        }
    }
}
