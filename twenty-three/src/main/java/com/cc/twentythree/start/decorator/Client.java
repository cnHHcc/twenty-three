package com.cc.twentythree.start.decorator;

/**
 * @author chenchao
 * @version V1.0
 * @date 2021/9/8 16:30
 */
public class Client {
    //需求，做一杯美式咖啡，加两份巧克力一份奶
    public static void main(String[] args) {
        //1.创建一个美式咖啡对象，用父类Drink指向子类
        Drink order = new LongBlackCoffee();
        //2.加一分牛奶 此时order是单品美式咖啡=8元
        order = new MilkFlavour(order);
        //每次将被装饰者放入装饰者时，Decorator（由于MilkFlavour继承了Flavour，而Flavour继承了Decorator）中都会将调料的价格，与放入的被装饰者的价格相加
        //3.加一分巧克力 此时order是单品美式咖啡+一份牛奶=8元
        order = new ChocolateFlavour(order);
        //4.再加一分牛奶 此时order是单品美式咖啡+一份牛奶+一份巧克力 = 10元
        order = new ChocolateFlavour(order);
        //此时order是单品美式咖啡+一份牛奶+一份巧克力+一份巧克力 = 12元
        System.out.println(order.getDes());
        System.out.println(order.cost());
    }
}
