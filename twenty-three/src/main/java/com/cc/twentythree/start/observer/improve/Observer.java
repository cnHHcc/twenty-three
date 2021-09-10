package com.cc.twentythree.start.observer.improve;

/**
 * @author chenchao
 * @version V1.0
 * @date 2021/9/10 16:00
 * 观察者接口
 */
public interface Observer {
    void update(float temperature, float pressure, float humidity);
}
