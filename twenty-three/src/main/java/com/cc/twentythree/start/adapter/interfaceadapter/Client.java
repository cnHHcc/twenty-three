package com.cc.twentythree.start.adapter.interfaceadapter;

import com.cc.twentythree.start.adapter.objectadapter.Voltage5V;

/**
 * @author chenchao
 * @version V1.0
 * @date 2021/9/8 10:20
 */
public class Client {
    public static void main(String[] args) {
//        ApplePhone applePhone = new ApplePhone();
//        applePhone.charging(new Voltage5vAdapter(new Voltage220V()));
        //可以根据传进来的不同实现类，完成不同的逻辑
        Charging charging = new Charging(new Voltage5vAdapter(new Voltage220V()));
        charging.charging();
        Charging charging1 = new Charging(new Voltage10vAdapter(new Voltage220V()));
        charging1.charging();
    }
}
