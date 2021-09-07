package com.cc.twentythree.start.factory.factoryInterface.pizzastore.order;

import com.cc.twentythree.start.factory.factoryInterface.pizzastore.pizza.LdCheesePizza;
import com.cc.twentythree.start.factory.factoryInterface.pizzastore.pizza.LdPepperPizza;
import com.cc.twentythree.start.factory.factoryInterface.pizzastore.pizza.Pizza;

/**
 * @author chenchao
 * @version V1.0
 * @date 2021/9/7 16:01
 */
public class LdFactory implements AbsFactory{
    @Override
    public Pizza createPizza(String orderType) {
        Pizza pizza = null;
        if ("cheese".equals(orderType)){
            pizza = new LdCheesePizza();
        } else if ("pepper".equals(orderType)){
            pizza = new LdPepperPizza();
        }
        return pizza;
    }
}
