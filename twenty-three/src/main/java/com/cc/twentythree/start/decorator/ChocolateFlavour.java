package com.cc.twentythree.start.decorator;

/**
 * @author chenchao
 * @version V1.0
 * @date 2021/9/8 16:26
 * 装饰者具体对象
 */
public class ChocolateFlavour extends Flavour{
    public ChocolateFlavour(Drink drink) {
        super(drink);
        setDes("巧克力");
        setPrice(2.0f);
    }
}
