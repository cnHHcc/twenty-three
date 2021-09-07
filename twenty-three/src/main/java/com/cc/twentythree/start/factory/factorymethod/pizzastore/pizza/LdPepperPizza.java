package com.cc.twentythree.start.factory.factorymethod.pizzastore.pizza;

/**
 * @author chenchao
 * @version V1.0
 * @date 2021/9/7 13:48
 */
public class LdPepperPizza extends Pizza {
    @Override
    public void prepare() {
        setName("伦敦胡椒披萨");
        System.out.println("制作伦敦胡椒披萨，原材料准备中");
    }
}
