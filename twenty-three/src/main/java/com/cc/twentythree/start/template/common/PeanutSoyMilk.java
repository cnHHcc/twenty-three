package com.cc.twentythree.start.template.common;

/**
 * @author chenchao
 * @version V1.0
 * @date 2021/9/9 17:51
 */
public class PeanutSoyMilk extends SoyMilk{
    @Override
    void addFlavour(int i) {
        System.out.println("第"+i+"部：添加花生");
    }
}
