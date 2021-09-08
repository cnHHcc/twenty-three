package com.cc.twentythree.start.bridge;

/**
 * @author chenchao
 * @version V1.0
 * @date 2021/9/8 15:16
 */
public class XiaoMi implements Brand{
    @Override
    public void open() {
        System.out.println("小米手机开机");
    }

    @Override
    public void close() {
        System.out.println("小米手机关机");
    }

    @Override
    public void call() {
        System.out.println("小米手机打电话");
    }
}
