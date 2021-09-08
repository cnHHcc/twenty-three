package com.cc.twentythree.start.adapter.interfaceadapter;

/**
 * @author chenchao
 * @version V1.0
 * @date 2021/9/8 11:14
 */
public class AndroidPhone {
    //参数是适配器接口实现类
    public void charging (AbstractVoltageAdapter v){
        if (v.output5v() == 10){
            System.out.println("安卓手机开始充电");
        } else {
            System.out.println("电压不符，无法充电");
        }
    }
}
