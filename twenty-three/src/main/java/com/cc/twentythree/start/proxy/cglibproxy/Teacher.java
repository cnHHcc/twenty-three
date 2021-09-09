package com.cc.twentythree.start.proxy.cglibproxy;

import lombok.Data;

/**
 * @author chenchao
 * @version V1.0
 * @date 2021/9/9 15:01
 */
@Data
public class Teacher{
    private boolean isHealth;

    public Teacher(boolean isHealth) {
        this.isHealth = isHealth;
    }

    public Teacher() {
    }

    public void teach() {
        System.out.println("被代理老师教书方法");
    }
}
