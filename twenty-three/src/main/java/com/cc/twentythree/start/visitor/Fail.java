package com.cc.twentythree.start.visitor;

/**
 * @author chenchao
 * @version V1.0
 * @date 2021/9/10 10:48
 */
public class Fail extends Action{
    @Override
    public void getManResult(Man man) {
        System.out.println(man.getName()+"男人评价失败");
    }

    @Override
    public void getWomenResult(Women women) {
        System.out.println(women.getName()+"女人评价失败");
    }
}
