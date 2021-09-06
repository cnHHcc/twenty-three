package com.cc.twentythree.principle.inversion;

/**
 * @author chenchao
 * @version V1.0
 * @date 2021/9/6 13:46
 */
public class DenpendecyIversion {
    public static void main(String[] args) {
        Person person = new Person();
        person.receive(new Email());
    }
}
class Email {
    public String getInfo (){
        return "电子邮件信息已发送";
    }
}

/**
 * 完成接收消息功能
 * 方式一
 * 1.简单，方便实现
 * 2.如果现在要发送微信或者其他平台的消息，那就需要再建一个微信类，然后Person中也要添加相应的方法
 * 解决思路：建一个接口，表示接收者，这样Person与这个接口发生依赖即可
 * 好处：Email，Weixin等等都是接口的实现者，都属于接收范围，这样就实现了依赖倒转的原则
 */
class Person {
    public void receive (Email email){
        System.out.println(email.getInfo());
    }
}
