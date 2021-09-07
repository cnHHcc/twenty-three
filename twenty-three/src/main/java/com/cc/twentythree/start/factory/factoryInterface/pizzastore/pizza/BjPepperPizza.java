package com.cc.twentythree.start.factory.factoryInterface.pizzastore.pizza;


/**
 * @author chenchao
 * @version V1.0
 * @date 2021/9/7 13:48
 */
public class BjPepperPizza extends Pizza {
    @Override
    public void prepare() {
        setName("北京胡椒披萨");
        System.out.println("制作北京胡椒披萨，原材料准备中");
    }
}
