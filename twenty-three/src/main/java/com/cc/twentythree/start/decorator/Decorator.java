package com.cc.twentythree.start.decorator;

/**
 * @author chenchao
 * @version V1.0
 * @date 2021/9/8 16:15
 * 装饰者（调料）
 * 继承抽象类，并将抽象类以变量的形式引入
 */
public class Decorator extends Drink {

    private Drink drink;

    public Decorator(Drink drink) {
        this.drink = drink;
    }

    @Override
    public float cost() {
        //自己的价格+单品的价格
        return super.getPrice() + drink.cost();
    }
    //重写描述
    @Override
    public String getDes() {
        //返回自己的描述和价格+被装饰者（咖啡）的描述
        return  des + "__ " + getPrice() + "&&" + drink.getDes();
    }
}
