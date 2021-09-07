package com.cc.twentythree.start.factory.factorymethod.pizzastore.order;


import com.cc.twentythree.start.factory.factorymethod.pizzastore.pizza.BjCheesePizza;
import com.cc.twentythree.start.factory.factorymethod.pizzastore.pizza.BjPepperPizza;
import com.cc.twentythree.start.factory.factorymethod.pizzastore.pizza.Pizza;

/**
 * @author chenchao
 * @version V1.0
 * @date 2021/9/7 15:21
 */
public class BjOrderPizza extends OrderPizza{

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
