package com.cc.twentythree.start.adapter.objectadapter;

/**
 * @author chenchao
 * @version V1.0
 * @date 2021/9/8 10:18
 */
public class Phone {
    public void charging (Voltage5V v){
        if (v.output5v() == 5){
            System.out.println("开始充电");
        } else {
            System.out.println("电压不符，无法充电");
        }
    }
}
