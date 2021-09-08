package com.cc.twentythree.start.adapter.objectadapter;

/**
 * @author chenchao
 * @version V1.0
 * @date 2021/9/8 10:14
 * 适配器类(实现适配器接口，将被适配者当成员变量引入，通过构造器具体定义 )
 */
public class VoltageAdapter implements Voltage5V {
    //利用了关联关系的聚合
    private final Voltage220V v;

    public VoltageAdapter(Voltage220V v) {
        this.v = v;
    }

    @Override
    public int output5v() {
        if (v != null){
            int i = v.output220v();
            //转换电压并返回
            return i/44;
        } else {
            return 0;
        }
    }
}
