package com.cc.twentythree.start.adapter.interfaceadapter;

/**
 * @author chenchao
 * @version V1.0
 * @date 2021/9/8 10:13
 * 适配接口(此时适配接口中用很多方法，而如果此时我的适配器不需要完全用到里面的方法，就可以用一个抽象类来实现该接口，并实现所有接口方法（空实现）)
 */
public interface VoltageXV {
    /**
     * 抽象方法，输出5V电压
     * @return
     */
    public int output5v ();
    /**
     * 抽象方法，输出10V电压
     * @return
     */
    public int output10v();
    /**
     * 抽象方法，输出25V电压
     * @return
     */
    public int output25v();
    /**
     * 抽象方法，输出50V电压
     * @return
     */
    public int output50v();
}
