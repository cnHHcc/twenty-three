package com.cc.twentythree.start.builder;

/**
 * @author chenchao
 * @version V1.0
 * @date 2021/9/8 9:13
 * 客户端
 */
public class Client {
    public static void main(String[] args) {
        CommonHouse commonHouse = new CommonHouse();
        commonHouse.build();
        HighBuild highBuild = new HighBuild();
        highBuild.build();
    }
}
