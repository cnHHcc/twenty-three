package com.cc.twentythree.start.bridge;

/**
 * @author chenchao
 * @version V1.0
 * @date 2021/9/8 15:20
 */
public abstract class Phone {
    private Brand brand;

    public Phone(Brand brand) {
        this.brand = brand;
    }
    protected void open (){
        brand.open();
    }
    protected void close (){
        brand.close();
    }
    protected void call (){
        brand.call();
    }
}
