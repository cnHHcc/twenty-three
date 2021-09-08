package com.cc.twentythree.start.bridge;

/**
 * @author chenchao
 * @version V1.0
 * @date 2021/9/8 15:17
 */
public class Vivo implements Brand{
    @Override
    public void open() {
        System.out.println("vivo手机开机");
    }

    @Override
    public void close() {
        System.out.println("vivo手机关机");
    }

    @Override
    public void call() {
        System.out.println("vivo手机打电话");
    }
}
