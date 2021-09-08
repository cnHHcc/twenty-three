package com.cc.twentythree.start.builder.improve;

/**
 * @author chenchao
 * @version V1.0
 * @date 2021/9/8 9:29
 * 抽象的建造者（对应builder）
 */
public abstract class HouseBuilder {
    //组合一个产品
    private House house = new House();
    //打地基
    public abstract void buildBasic ();
    //砌墙
    public abstract void buildWalls ();
    //封顶
    public abstract void roofed ();
    //建造房子
    public House buildHouse (){
        return house;
    }
}
