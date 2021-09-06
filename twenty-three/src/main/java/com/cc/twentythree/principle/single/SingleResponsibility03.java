package com.cc.twentythree.principle.single;

/**
 * @author chenchao
 * @version V1.0
 * @date 2021/9/6 11:02
 */
public class SingleResponsibility03 {
    public static void main(String[] args) {
        Vehicle2 vehicle2 = new Vehicle2();
        vehicle2.roadRun("汽车");
        vehicle2.airRun("飞机");
        vehicle2.waterRun("轮船");
    }
}

/**
 * 该方法对原有类的修改不是很大
 * 虽然没有在类的级别上实现单一职责原则，但是在具体方法上实现了。   非标准
 */
class Vehicle2 {
    public void roadRun (String vehicle){
        System.out.println(vehicle + "在陆地上运行");
    }
    public void airRun (String vehicle){
        System.out.println(vehicle + "在陆地上运行");
    }
    public void waterRun (String vehicle){
        System.out.println(vehicle + "在陆地上运行");
    }

}
