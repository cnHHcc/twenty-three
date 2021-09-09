package com.cc.twentythree.start.facade;

/**
 * @author chenchao
 * @version V1.0
 * @date 2021/9/9 10:57
 * dvd
 */
public class DVDPlayer {
    //饿汉式单例
    private static final DVDPlayer DVD_PLAYER = new DVDPlayer();

    public static DVDPlayer getInstance() {
        return DVD_PLAYER;
    }

    public void on() {
        System.out.println("dvd on");
    }

    public void off() {
        System.out.println("dvd off");
    }

    public void play() {
        System.out.println("dvd play");
    }

    public void pause() {
        System.out.println("dvd pause");
    }
}
