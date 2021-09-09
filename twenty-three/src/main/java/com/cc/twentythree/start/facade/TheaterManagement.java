package com.cc.twentythree.start.facade;

/**
 * @author chenchao
 * @version V1.0
 * @date 2021/9/9 11:24
 */
public class TheaterManagement {
    private DVDPlayer dvdPlayer;
    private Light light;
    private Popcorn popcorn;
    private Screen screen;
    private Stereo stereo;
    private Projector projector;

    public TheaterManagement() {
        this.dvdPlayer = DVDPlayer.getInstance();
        this.light = Light.getInstance();
        this.popcorn = Popcorn.getInstance();
        this.screen = Screen.getInstance();
        this.stereo = Stereo.getInstance();
        this.projector = Projector.getInstance();
    }

    public void ready() {
        dvdPlayer.on();
        light.on();
        popcorn.on();
        screen.on();
        stereo.on();
        projector.on();
    }

    public void work() {
        dvdPlayer.play();
        light.dim();
        popcorn.pop();
        stereo.down();
        projector.focus();
    }

    public void end() {
        dvdPlayer.off();
        light.off();
        popcorn.off();
        screen.off();
        stereo.off();
        projector.off();
    }
}
