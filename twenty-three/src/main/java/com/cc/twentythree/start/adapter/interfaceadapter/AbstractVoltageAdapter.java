package com.cc.twentythree.start.adapter.interfaceadapter;

/**
 * @author chenchao
 * @version V1.0
 * @date 2021/9/8 10:47
 * 抽象适配器接口实现类（空实现接口的所有方法）
 */
public class AbstractVoltageAdapter implements VoltageXV{
    @Override
    public int output5v() {
        return 0;
    }

    @Override
    public int output10v() {
        return 0;
    }

    @Override
    public int output25v() {
        return 0;
    }

    @Override
    public int output50v() {
        return 0;
    }
}
