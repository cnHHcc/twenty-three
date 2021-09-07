package com.cc.twentythree.start.factory.factoryInterface.pizzastore.order;

import com.cc.twentythree.start.factory.factoryInterface.pizzastore.pizza.BjCheesePizza;
import com.cc.twentythree.start.factory.factoryInterface.pizzastore.pizza.BjPepperPizza;
import com.cc.twentythree.start.factory.factoryInterface.pizzastore.pizza.Pizza;

/**
 * @author chenchao
 * @version V1.0
 * @date 2021/9/7 15:59
 */
public class BjFactory implements AbsFactory{
    @Override
    public Pizza createPizza(String orderType) {
        Pizza pizza = null;
        if ("cheese".equals(orderType)){
            pizza = new BjCheesePizza();
        } else if ("pepper".equals(orderType)){
            pizza = new BjPepperPizza();
        }
        return pizza;
    }
}
