package com.cc.twentythree.start.template.common;

/**
 * @author chenchao
 * @version V1.0
 * @date 2021/9/9 17:45
 */
public abstract class SoyMilk {
    //定义的公共算法，final修饰，防止子类重写
    final void make() {
        int i = 1;
        select(i++);
        //这里判断是否要添加配料，要才添加第二步
        if (wantAddFlavour()) {
            addFlavour(i++);
        }
        soak(i++);
        beat(i);
    }

    void select(int i) {
        System.out.println("第"+i+"步：选择新鲜的黄豆");
    }

    /**
     * 添加调料，由于每种豆浆的调料不一样，写成抽象方法，交由子类重写
     */
    abstract void addFlavour(int i);

    /**
     * 判断是否要添加原材料的方法，默认返回true，即默认是要添加的
     *
     * @return
     */
    boolean wantAddFlavour() {
        return true;
    }

    void soak(int i) {
        System.out.println("第"+i+"步：浸泡开始");
    }

    void beat(int i) {
        System.out.println("第"+i+"步：研磨开始");
    }
}
