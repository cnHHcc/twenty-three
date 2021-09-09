package com.cc.twentythree.start.flyweight;

/**
 * @author chenchao
 * @version V1.0
 * @date 2021/9/9 14:03
 * 具体的网站
 */
public class ConcreteWebSite extends WebSite {
    //网站的具体类型 共享部分 内部状态
    private String type;

    public ConcreteWebSite(String type) {
        this.type = type;
    }

    @Override
    public void use(User user) {
        System.out.println(user.getName()+"创建了" + type + "网站");
    }
}
