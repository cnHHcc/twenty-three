package com.cc.twentythree.start.factory.simplefactory.pizzastore.order;

import com.cc.twentythree.start.factory.simplefactory.pizzastore.pizza.CheesePizza;
import com.cc.twentythree.start.factory.simplefactory.pizzastore.pizza.GreekPizza;
import com.cc.twentythree.start.factory.simplefactory.pizzastore.pizza.Pizza;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * @author chenchao
 * @version V1.0
 * @date 2021/9/7 13:31
 * 订购披萨
 */
public class OrderPizza {
    Pizza pizza = null;
    String orderType = "";
    public void setFactory (SimpleFactory simpleFactory){

        do {
            orderType = getType();
            pizza = SimpleFactory.createPizza(orderType);
            if (pizza != null){
                pizza.prepare();
                pizza.bake();
                pizza.cut();
                pizza.box();
            } else {
                System.out.println("订购失败");
            }
        } while (true);
    }
    public OrderPizza (SimpleFactory simpleFactory){
        setFactory(simpleFactory);
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
