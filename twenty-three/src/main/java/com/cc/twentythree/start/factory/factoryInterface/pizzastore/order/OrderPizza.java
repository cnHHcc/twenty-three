package com.cc.twentythree.start.factory.factoryInterface.pizzastore.order;

import com.cc.twentythree.start.factory.factoryInterface.pizzastore.pizza.Pizza;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * @author chenchao
 * @version V1.0
 * @date 2021/9/7 16:03
 */
public class OrderPizza {
    //构造器
    public OrderPizza (AbsFactory absFactory){
        setAbsFactory(absFactory);
    }
    /**
     * 该方法参数是接口，传参时，根据不同的实现了完成不同的创建
     * @param factory
     */
    public void setAbsFactory (AbsFactory factory){
        Pizza pizza = null;
        String orderType = "";
        do {
            orderType = getType();
            pizza = factory.createPizza(orderType);
            if (pizza != null){
                pizza.prepare();
                pizza.bake();
                pizza.cut();
                pizza.box();
            }
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
