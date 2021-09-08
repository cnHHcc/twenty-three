package com.cc.twentythree.start.prototype.improve.deepclone;

/**
 * @author cc
 * @date 2021/9/7 22:01
 */
public class Client {
    public static void main(String[] args) throws CloneNotSupportedException {

        DeepPrototype deepPrototype = new DeepPrototype();
        deepPrototype.setName("haha");
        deepPrototype.setDeepCloneableTarget(new DeepCloneableTarget("hehe","jiujiu"));
        //测试方法一
        DeepPrototype clone = (DeepPrototype)deepPrototype.clone();
        System.out.println(deepPrototype.toString());
        System.out.println(clone.toString());
        //这样，deepPrototype和clone里的DeepCloneableTarget就不是地址的复制，而是类的复制了
        System.out.println(deepPrototype.getDeepCloneableTarget() == clone.getDeepCloneableTarget());//false
        System.out.println("--------------------------------");
        //测试方法二
        DeepPrototype clone2 = (DeepPrototype)deepPrototype.deepClone();
        System.out.println(deepPrototype.toString());
        System.out.println(clone2.toString());
        //这样，deepPrototype和clone里的DeepCloneableTarget就不是地址的复制，而是类的复制了
        System.out.println(deepPrototype.getDeepCloneableTarget() == clone2.getDeepCloneableTarget());//false
    }
}
