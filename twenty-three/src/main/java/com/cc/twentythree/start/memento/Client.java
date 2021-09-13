package com.cc.twentythree.start.memento;

/**
 * @author chenchao
 * @version V1.0
 * @date 2021/9/13 14:03
 */
public class Client {
    public static void main(String[] args) {
        Originator originator = new Originator();
        originator.setState("满血状态");
        Memento memento = originator.saveMemento("满血状态");
        originator.setState("非满血状态");
        System.out.println(originator);
        CareTaker careTaker = new CareTaker();
        careTaker.add(memento);
        Memento memento1 = careTaker.getMemento(0);
        originator.recoveryState(memento1);
        System.out.println(originator);
    }
}
