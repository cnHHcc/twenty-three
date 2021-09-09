package com.cc.twentythree.start.facade;

/**
 * @author chenchao
 * @version V1.0
 * @date 2021/9/9 11:09
 * 灯光
 */
public class Light {
    //饿汉式单例
    private static final Light LIGHT = new Light();

    public static Light getInstance() {
        return LIGHT;
    }

    public void on() {
        System.out.println("Light on");
    }

    public void off() {
        System.out.println("Light off");
    }

    public void bright() {
        System.out.println("Light bright");
    }

    public void dim() {
        System.out.println("Light dim");
    }
}
