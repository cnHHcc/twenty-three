package com.cc.twentythree.start.factory.simplefactory.pizzastore.order;

import com.cc.twentythree.start.factory.simplefactory.pizzastore.pizza.CheesePizza;
import com.cc.twentythree.start.factory.simplefactory.pizzastore.pizza.GreekPizza;
import com.cc.twentythree.start.factory.simplefactory.pizzastore.pizza.Pizza;

/**
 * @author chenchao
 * @version V1.0
 * @date 2021/9/7 14:50
 */
public class SimpleFactory {
    public static Pizza createPizza (String orderType){
        Pizza pizza = null;
        if ("greek".equals(orderType)) {
            pizza = new GreekPizza();
            pizza.setName("希腊披萨");
        } else if ("cheese".equals(orderType)) {
            pizza = new CheesePizza();
            pizza.setName("奶酪披萨");
        } else if ("pepper".equals(orderType)) {
            pizza = new CheesePizza();
            pizza.setName("呼叫披萨");
        }
        return pizza;
    }
}
