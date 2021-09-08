package com.cc.twentythree.start.builder;

/**
 * @author chenchao
 * @version V1.0
 * @date 2021/9/8 9:08
 * 造房子的抽象基类，具体由实现类实现
 */
public abstract class AbstractHouse {
    //打地基
    public abstract void buildBasic ();
    //砌墙
    public abstract void buildWalls ();
    //封顶
    public abstract void roofed ();

    public void build (){
        buildBasic();
        buildWalls();
        roofed();
    }
}
