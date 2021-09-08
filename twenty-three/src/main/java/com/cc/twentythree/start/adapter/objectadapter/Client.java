package com.cc.twentythree.start.adapter.objectadapter;

/**
 * @author chenchao
 * @version V1.0
 * @date 2021/9/8 10:20
 */
public class Client {
    public static void main(String[] args) {
        Phone phone = new Phone();
        phone.charging(new VoltageAdapter(new Voltage220V()));

    }
}
