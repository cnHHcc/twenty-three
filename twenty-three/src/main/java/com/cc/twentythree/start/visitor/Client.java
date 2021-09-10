package com.cc.twentythree.start.visitor;

import java.lang.reflect.Field;

/**
 * @author chenchao
 * @version V1.0
 * @date 2021/9/10 11:09
 */
public class Client {
    public static void main(String[] args) {
        //1.创建一个ObjectStructure
        ObjectStructure objectStructure = new ObjectStructure();
        //2.创建人
        Man dali = new Man("大力");
        Women wanggangdan = new Women("王钢蛋");
        objectStructure.attach(dali);
        objectStructure.attach(wanggangdan);
        //创建成功评价
        Success success = new Success();
        //完成评价
        objectStructure.display(success);

        System.out.println("---------------");

        Man lilei = new Man("lilei");
        Women hanmeimei = new Women("Hanmeimei");
        objectStructure.detach(dali);
        objectStructure.detach(wanggangdan);
        objectStructure.attach(lilei);
        objectStructure.attach(hanmeimei);
        Fail fail = new Fail();
        objectStructure.display(fail);

    }
}
