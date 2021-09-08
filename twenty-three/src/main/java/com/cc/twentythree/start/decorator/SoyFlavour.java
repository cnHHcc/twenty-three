package com.cc.twentythree.start.decorator;

/**
 * @author chenchao
 * @version V1.0
 * @date 2021/9/8 16:25
 * 装饰者具体对象
 */
public class SoyFlavour extends Flavour{
    public SoyFlavour(Drink drink) {
        super(drink);
        setDes("豆浆");
        setPrice(1.0f);
    }
}
