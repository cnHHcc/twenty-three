package com.cc.twentythree.start.facade;

/**
 * @author chenchao
 * @version V1.0
 * @date 2021/9/9 11:04
 * 投影仪
 */
public class Projector {
    //饿汉式单例
    private static final Projector PROJECTOR = new Projector();

    public static Projector getInstance() {
        return PROJECTOR;
    }

    public void on() {
        System.out.println("projector on");
    }

    public void off() {
        System.out.println("projector off");
    }

    public void focus() {
        System.out.println("projector focus");
    }
}
