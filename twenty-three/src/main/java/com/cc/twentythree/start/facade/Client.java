package com.cc.twentythree.start.facade;

/**
 * @author chenchao
 * @version V1.0
 * @date 2021/9/9 13:29
 */
public class Client {
    public static void main(String[] args) {
        TheaterManagement theaterManagement = new TheaterManagement();
        theaterManagement.ready();
        System.out.println("--------------");
        theaterManagement.work();
        System.out.println("--------------");
        theaterManagement.end();
    }
}
