package com.cc.twentythree.start.proxy.cglibproxy;


/**
 * @author chenchao
 * @version V1.0
 * @date 2021/9/9 15:02
 */
public class Client {
    public static void main(String[] args) {
        ProxyFactory proxyFactory = new ProxyFactory(new Teacher(true));
        Teacher proxyInstance = (Teacher) proxyFactory.getProxyInstance();
        proxyInstance.teach();
        System.out.println("---------------");
        Teacher teacher = new Teacher(false);
        ProxyFactory proxyFactory2 = new ProxyFactory(teacher);
        Teacher proxyInstance2 = (Teacher) proxyFactory2.getProxyInstance();
        proxyInstance2.teach();
        System.out.println("---------------");
        ProxyFactory proxyFactory3 = new ProxyFactory(new Student());
        Student proxyInstance3 = (Student) proxyFactory3.getProxyInstance();
        proxyInstance3.teach();
    }
}
