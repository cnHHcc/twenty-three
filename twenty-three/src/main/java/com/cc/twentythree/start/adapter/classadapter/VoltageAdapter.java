package com.cc.twentythree.start.adapter.classadapter;

/**
 * @author chenchao
 * @version V1.0
 * @date 2021/9/8 10:14
 * 适配器类(继承被适配者，实现适配器接口)
 */
public class VoltageAdapter extends Voltage220V implements Voltage5V{
    @Override
    public int output5v() {
        //由于是继承关系，这里直接使用Voltage220V的output220v方法获得原始电压
        int i = output220v();
        //转换电压并返回
        return i/44;
    }
}
