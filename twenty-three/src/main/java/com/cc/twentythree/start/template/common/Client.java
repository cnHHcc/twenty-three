package com.cc.twentythree.start.template.common;

/**
 * @author chenchao
 * @version V1.0
 * @date 2021/9/9 17:51
 */
public class Client {
    public static void main(String[] args) {
        PeanutSoyMilk p = new PeanutSoyMilk();
        p.make();
        System.out.println("------------");
        RedBeanSoyMilk redBeanSoyMilk = new RedBeanSoyMilk();
        redBeanSoyMilk.make();
        System.out.println("-----------");
        PureSoyMilk pureSoyMilk = new PureSoyMilk();
        pureSoyMilk.make();
    }
}
