package com.cc.twentythree.start.factory.simplefactory.pizzastore.pizza;

import lombok.Data;

/**
 * @author chenchao
 * @version V1.0
 * @date 2021/9/7 13:25
 * pizza抽象类
 */
@Data
public abstract class Pizza {
    protected String name;
    //准备原材料、不同的pizza是不一样的
    public abstract void prepare();
    //烘烤
    public void bake() {
        System.out.println(name + " baking;");
    }
    //切割
    public void cut() {
        System.out.println(name + " cutting;");
    }
    //打包
    public void box() {
        System.out.println(name + " boxing;");
    }

    public void setName(String name) {
        this.name = name;
    }
}
