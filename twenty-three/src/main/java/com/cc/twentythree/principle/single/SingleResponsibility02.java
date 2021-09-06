package com.cc.twentythree.principle.single;

/**
 * @author chenchao
 * @version V1.0
 * @date 2021/9/6 10:57
 */
public class SingleResponsibility02 {
    public static void main(String[] args) {
        RoadVehicle roadVehicle = new RoadVehicle();
        roadVehicle.run("汽车");
        AirVehicle airVehicle = new AirVehicle();
        airVehicle.run("飞机");
        WaterVehicle waterVehicle = new WaterVehicle();
        waterVehicle.run("轮船");
    }
}

/**
 * 此时遵守了单一职责原则   标准
 * 但：1.代码花销太大
 *    2.代码需要改动的地方太多
 * 解决：SingleResponsibility03
 */
class RoadVehicle  {
    public void run (String roadVehicle){
        System.out.println(roadVehicle+"在陆地上运行");
    }
}
class AirVehicle  {
    public void run (String airVehicle){
        System.out.println(airVehicle+"在天上运行");
    }
}
class WaterVehicle  {
    public void run (String waterVehicle){
        System.out.println(waterVehicle+"在水上运行");
    }
}
