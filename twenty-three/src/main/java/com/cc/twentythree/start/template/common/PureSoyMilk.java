package com.cc.twentythree.start.template.common;

/**
 * @author chenchao
 * @version V1.0
 * @date 2021/9/9 18:00
 */
public class PureSoyMilk extends SoyMilk{
    @Override
    void addFlavour(int i) {
        //因为纯豆浆是不需要添加配料的，所以这里空实现即可
    }

    @Override
    boolean wantAddFlavour() {
        //由于纯豆浆是不需要添加配料的，所以这里重写是否要添加配料的方法，并返回false，表示不要添加原材料
        return false;
    }
}
