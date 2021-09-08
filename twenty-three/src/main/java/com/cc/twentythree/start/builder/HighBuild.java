package com.cc.twentythree.start.builder;

/**
 * @author chenchao
 * @version V1.0
 * @date 2021/9/8 9:14
 */
public class HighBuild extends AbstractHouse{
    @Override
    public void buildBasic() {
        System.out.println("高层开始打地基");
    }

    @Override
    public void buildWalls() {
        System.out.println("高层开始砌墙");
    }

    @Override
    public void roofed() {
        System.out.println("高层开始封顶");
    }
}
