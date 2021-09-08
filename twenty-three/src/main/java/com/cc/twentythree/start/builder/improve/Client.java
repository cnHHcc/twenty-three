package com.cc.twentythree.start.builder.improve;


/**
 * @author chenchao
 * @version V1.0
 * @date 2021/9/8 9:45
 */
public class Client {
    public static void main(String[] args) {
        //创建一个普通房子
        CommonHouse commonHouse = new CommonHouse();
        //创建一个指挥者，将普通房子作为构造器参数传入
        HouseDirector houseDirector = new HouseDirector(commonHouse);
        //用指挥者造房子的方法获取房子
        House house = houseDirector.constructHouse();
        //创建一个高层
        HighBuild highBuild = new HighBuild();
        //无需创建新的指挥者，只需要将高层set进去即可（重新构建指挥者）
        houseDirector.setHouseBuilder(highBuild);
        House house1 = houseDirector.constructHouse();
    }
}
