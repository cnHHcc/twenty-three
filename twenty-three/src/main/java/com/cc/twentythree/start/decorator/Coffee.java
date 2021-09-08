package com.cc.twentythree.start.decorator;

/**
 * @author chenchao
 * @version V1.0
 * @date 2021/9/8 16:07
 * 被装饰者公共部分抽取类（如果没有公共方法，或者具体的实体类都需要重写，那这个类可以省略）
 */
public class Coffee extends Drink{
    @Override
    public float cost() {
        return super.getPrice();
    }
}
