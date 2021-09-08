package com.cc.twentythree.start.builder.improve;

/**
 * @author chenchao
 * @version V1.0
 * @date 2021/9/8 9:39
 * 指挥者（对应Director）
 */
public class HouseDirector {
    private HouseBuilder houseBuilder = null;
    //方法一：通过setter方法注入HouseBulider
    public void setHouseBuilder(HouseBuilder houseBuilder) {
        this.houseBuilder = houseBuilder;
    }
    //方法二：通过构造器注入HouseBuilder
    public HouseDirector(HouseBuilder houseBuilder) {
        this.houseBuilder = houseBuilder;
    }
    //如何建造房子的流程，交给指挥者
    public House constructHouse (){
        houseBuilder.buildBasic();
        houseBuilder.buildWalls();
        houseBuilder.roofed();
        return houseBuilder.buildHouse();
    }
}
