package com.cc.twentythree.start.decorator;

/**
 * @author chenchao
 * @version V1.0
 * @date 2021/9/8 16:23
 * 装饰者具体对象
 */
public class MilkFlavour extends Flavour {
    public MilkFlavour(Drink drink) {
        super(drink);
        setDes("牛奶");
        setPrice(5.0f);
    }
}
