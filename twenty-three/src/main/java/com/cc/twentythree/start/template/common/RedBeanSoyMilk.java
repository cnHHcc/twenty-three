package com.cc.twentythree.start.template.common;

/**
 * @author chenchao
 * @version V1.0
 * @date 2021/9/9 17:50
 * 红豆豆浆
 */
public class RedBeanSoyMilk extends SoyMilk{

    @Override
    void addFlavour(int i) {
        System.out.println("第"+i+"部：添加红豆");
    }
}
