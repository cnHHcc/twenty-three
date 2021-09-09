package com.cc.twentythree.start.facade;

/**
 * @author chenchao
 * @version V1.0
 * @date 2021/9/9 11:07
 * 环绕立体声
 */
public class Stereo {
    //饿汉式单例
    private static final Stereo STEREO = new Stereo();

    public static Stereo getInstance() {
        return STEREO;
    }

    public void on() {
        System.out.println("stereo on");
    }

    public void off() {
        System.out.println("stereo off");
    }

    public void up() {
        System.out.println("stereo up");
    }

    public void down() {
        System.out.println("stereo down");
    }
}
