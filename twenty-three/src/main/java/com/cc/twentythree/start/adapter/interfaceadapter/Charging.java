package com.cc.twentythree.start.adapter.interfaceadapter;

/**
 * @author chenchao
 * @version V1.0
 * @date 2021/9/8 11:18
 */
public class Charging {
    private AbstractVoltageAdapter a;

    public Charging(AbstractVoltageAdapter a) {
        this.a = a;
    }

    public void charging (){
        if (a instanceof Voltage5vAdapter){
            System.out.println("苹果手机开始充电");
        }
        if (a instanceof Voltage10vAdapter){
            System.out.println("安卓手机开始充电");
        }
    }

}
