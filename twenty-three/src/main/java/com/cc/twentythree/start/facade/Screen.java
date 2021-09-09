package com.cc.twentythree.start.facade;

/**
 * @author chenchao
 * @version V1.0
 * @date 2021/9/9 11:06
 * 屏幕
 */
public class Screen {
    //饿汉式单例
    private static final Screen SCREEN = new Screen();

    public static Screen getInstance() {
        return SCREEN;
    }

    public void on() {
        System.out.println("screen on");
    }

    public void off() {
        System.out.println("screen off");
    }
}
