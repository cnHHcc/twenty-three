package com.cc.twentythree.start.template.hook;

/**
 * @author chenchao
 * @version V1.0
 * @date 2021/9/9 17:45
 */
public abstract class SoyMilk {
    //定义的公共算法，final修饰，防止子类重写
    final void make (){
        select();
        addFlavour();
        soak();
        beat();
    }
    void select (){
        System.out.println("第一步：选择新鲜的黄豆");
    }

    /**
     * 添加调料，由于每种豆浆的调料不一样，写成抽象方法，交由子类重写
     */
    abstract void addFlavour ();

    void soak (){
        System.out.println("第三步：浸泡开始");
    }
    void beat (){
        System.out.println("第四步：研磨开始");
    }
}
