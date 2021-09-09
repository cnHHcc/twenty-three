package com.cc.twentythree.start.proxy.dynamicproxy;


/**
 * @author chenchao
 * @version V1.0
 * @date 2021/9/9 15:02
 */
public class Client {
    public static void main(String[] args) {
        ProxyFactory proxyFactory = new ProxyFactory(new Teacher(true));
        TeacherInterface proxyInstance = (TeacherInterface) proxyFactory.getProxyInstance();
        proxyInstance.teach();
        System.out.println("---------------");
        ProxyFactory proxyFactory2 = new ProxyFactory(new Teacher(false));
        TeacherInterface proxyInstance2 = (TeacherInterface) proxyFactory2.getProxyInstance();
        proxyInstance2.teach();
        System.out.println("---------------");
        ProxyFactory proxyFactory3 = new ProxyFactory(new Student());
        TeacherInterface proxyInstance3 = (TeacherInterface) proxyFactory3.getProxyInstance();
        proxyInstance3.teach();
    }
}
