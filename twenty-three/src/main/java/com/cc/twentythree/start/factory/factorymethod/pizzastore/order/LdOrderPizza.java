package com.cc.twentythree.start.factory.factorymethod.pizzastore.order;

import com.cc.twentythree.start.factory.factorymethod.pizzastore.pizza.LdCheesePizza;
import com.cc.twentythree.start.factory.factorymethod.pizzastore.pizza.LdPepperPizza;
import com.cc.twentythree.start.factory.factorymethod.pizzastore.pizza.Pizza;

/**
 * @author chenchao
 * @version V1.0
 * @date 2021/9/7 15:21
 */
public class LdOrderPizza extends OrderPizza {
    @Override
    public Pizza createPizza(String orderType) {
        Pizza pizza = null;
        if ("greek".equals(orderType)){
            pizza = new LdCheesePizza();
        } else if ("pepper".equals(orderType)){
            pizza = new LdPepperPizza();
        }
        return pizza;
    }
}
