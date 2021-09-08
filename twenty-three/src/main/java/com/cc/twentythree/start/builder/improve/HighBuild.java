package com.cc.twentythree.start.builder.improve;

import com.cc.twentythree.start.builder.AbstractHouse;

/**
 * @author chenchao
 * @version V1.0
 * @date 2021/9/8 9:14
 * 高层（对应ConcreteBuilder）
 */
public class HighBuild extends HouseBuilder {
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
