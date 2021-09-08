package com.cc.twentythree.start.decorator;

/**
 * @author chenchao
 * @version V1.0
 * @date 2021/9/8 16:10
 * 被装饰者具体实现类
 */
public class ShortBlackCoffee extends Coffee{
    public ShortBlackCoffee() {
        setDes("浓缩咖啡");
        setPrice(18.0f);
    }
}
