package com.cc.twentythree.principle.inversion.improve;

/**
 * @author chenchao
 * @version V1.0
 * @date 2021/9/6 13:46
 */
public class DenpendecyIversion {
    public static void main(String[] args) {
        Person person = new Person();
        person.receive(new Email());
        person.receive(new Weixin());
    }
}
interface IReceive {
    public String getInfo ();
}
class Email implements IReceive{
    @Override
    public String getInfo (){
        return "电子邮件信息已发送";
    }
}
class Weixin implements IReceive{
    @Override
    public String getInfo() {
        return "微信信息已发送";
    }
}
/**
 * 方式二：
 * 参数就不是一个具体的类，而是接口，与接口形成依赖
 * 用时，传入具体的接口实现类即可
 */
class Person {
    public void receive (IReceive i){
        System.out.println(i.getInfo());
    }
}
