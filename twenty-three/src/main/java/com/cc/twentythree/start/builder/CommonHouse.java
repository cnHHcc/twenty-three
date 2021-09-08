package com.cc.twentythree.start.builder;

/**
 * @author chenchao
 * @version V1.0
 * @date 2021/9/8 9:11
 */
public class CommonHouse extends AbstractHouse{
    @Override
    public void buildBasic() {
        System.out.println("普通房子开始打地基");
    }

    @Override
    public void buildWalls() {
        System.out.println("普通房子开始砌墙");
    }

    @Override
    public void roofed() {
        System.out.println("普通房子开始封顶");
    }
}
