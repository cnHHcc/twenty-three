package com.cc.twentythree.start.flyweight;

import java.util.HashMap;

/**
 * @author chenchao
 * @version V1.0
 * @date 2021/9/9 14:07
 * 网站工厂类，类面有个网站的集合，通过类型，在集合中获取对应的网站
 */
public class WebSiteFactory {
    /**
     * 创建一个网站集合，充当池的作用
     */
    private HashMap<String, ConcreteWebSite> pool = new HashMap<>();

    /**
     * 根据网站的类型，返回一个网站，如果没有该类型，就新建一个网站，并放到池中。
     * @param type
     * @return
     */
    public WebSite getWebSiteCategory(String type) {
        if (!pool.containsKey(type)) {
            pool.put(type, new ConcreteWebSite(type));
        }
        /**
         * pool.get(type)得到的应该是一个ConcreteWebSite对象，向上转型为父类WebSite对象返回
         * 而当外部调用这个方法的时候，得到的是WebSite对象，其实是由ConcreteWebSite向上转型的结果，这样，调用WebSite的use()方法时，
         * 指向的是子类ConcreteWebSite重写后的use()方法
         */
        return pool.get(type);
    }

    /**
     * 获取网站池中不同网站的数量
     * @return
     */
    public int getWebSiteCount() {
        return pool.size();
    }
}
