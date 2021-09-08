package com.cc.twentythree.start.adapter.interfaceadapter;

/**
 * @author chenchao
 * @version V1.0
 * @date 2021/9/8 10:14
 * 适配器类(继承抽象的适配器接口实现类，重写我们需要的方法)
 */
public class Voltage5vAdapter extends AbstractVoltageAdapter {
    //利用了关联关系的聚合
    private final Voltage220V v;

    public Voltage5vAdapter(Voltage220V v) {
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
