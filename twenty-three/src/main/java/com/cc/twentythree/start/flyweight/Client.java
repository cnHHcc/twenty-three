package com.cc.twentythree.start.flyweight;

/**
 * @author chenchao
 * @version V1.0
 * @date 2021/9/9 14:12
 */
public class Client {
    public static void main(String[] args) {
        WebSiteFactory webSiteFactory = new WebSiteFactory();
        WebSite weiXin = webSiteFactory.getWebSiteCategory("WeiXin");
        /**
         * 这里是父类抽象对象调用子类重写方法，因为实际上 webSiteFactory.getWebSiteCategory("WeiXin")我们拿到的是子类ConcreteWebSite类，
         * 只是在方法返回时，向上转型成了父类，其实已经完成了对父类方法的重写
         * 所以，这里父类抽象类用use()这个方法，实际上会指向到子类ConcreteWebSite重写的方法
         */
        weiXin.use(new User("Tom"));
        WebSite weiXin1 = webSiteFactory.getWebSiteCategory("WeiXin");
        weiXin1.use(new User("LiLei"));
        WebSite weiXin2 = webSiteFactory.getWebSiteCategory("WeiXin");
        weiXin2.use(new User("MeiNiYe"));
        //打印结果为1，也就是说，不管你有多少个人需要用到WeiXin网站，直接到我池里面拿就可以了。
        //而我池里面始终就只有一个WeiXin的网站。减少了不必要的对象创建开支
        System.out.println(webSiteFactory.getWebSiteCount());
    }
}
