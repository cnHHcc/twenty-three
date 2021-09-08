package com.cc.twentythree.start.decorator;

/**
 * @author chenchao
 * @version V1.0
 * @date 2021/9/8 16:22
 * 装饰者公共方法抽取实体类（如果没有公共方法，或者具体的实体类都需要重写，那这个类可以省略）
 */
public class Flavour extends Decorator{
    public Flavour(Drink drink) {
        super(drink);
    }

    @Override
    public float cost() {
        return super.cost();
    }

    @Override
    public String getDes() {
        return super.getDes();
    }
}
