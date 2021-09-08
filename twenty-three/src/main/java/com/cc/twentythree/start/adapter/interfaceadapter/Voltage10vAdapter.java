package com.cc.twentythree.start.adapter.interfaceadapter;

/**
 * @author chenchao
 * @version V1.0
 * @date 2021/9/8 11:12
 */
public class Voltage10vAdapter extends AbstractVoltageAdapter{
    private  final Voltage220V v;

    public Voltage10vAdapter(Voltage220V v) {
        this.v = v;
    }

    @Override
    public int output10v() {
        if (v != null){
            int i = v.output220v();
            //转换电压并返回
            return i/22;
        } else {
            return 0;
        }
    }
}
