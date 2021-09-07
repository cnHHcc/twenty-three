package com.cc.twentythree.start.factory.factoryInterface.pizzastore.order;

import com.cc.twentythree.start.factory.factoryInterface.pizzastore.pizza.Pizza;

/**
 * @author chenchao
 * @version V1.0
 * @date 2021/9/7 15:56
 * 抽象工厂类
 */
public interface AbsFactory {
    //抽象类的接口由子类去实现
    public Pizza createPizza (String orderType);
}
