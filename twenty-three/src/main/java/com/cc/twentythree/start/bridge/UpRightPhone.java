package com.cc.twentythree.start.bridge;

/**
 * @author chenchao
 * @version V1.0
 * @date 2021/9/8 15:25
 */
public class UpRightPhone extends Phone{
    public UpRightPhone(Brand brand) {
        super(brand);
    }

    @Override
    protected void open() {
        super.open();
        System.out.println("直立手机");
    }

    @Override
    protected void close() {
        super.close();
        System.out.println("直立手机");
    }

    @Override
    protected void call() {
        super.call();
        System.out.println("直立手机");
    }
}
