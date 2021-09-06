package com.cc.twentythree.principle.single;

/**
 * 单一职责错误示例
 * @author chenchao
 * @version V1.0
 * @date 2021/9/6 10:49
 */
public class SingleResponsibility01 {
    public static void main(String[] args) {
        Vehicle vehicle = new Vehicle();
        vehicle.run("汽车");
        vehicle.run("飞机");
        vehicle.run("轮船");
    }
}

/**
 * 由于Vehicle交通工具类并没有为交通工具分类，不管传什么参数进来，都是在陆地上运行，说明这个Vehicle类的职责不纯粹了，也满足不了多种交通工具的要求了
 * 这便违反了单一职责原则
 * 解决方法，就是将Vehicle这个类细分下去（见SingleResponsibility02）
 */
class Vehicle {
    public void run (String vehicle){
        System.out.println(vehicle + "在陆地上运行");
    }

}
