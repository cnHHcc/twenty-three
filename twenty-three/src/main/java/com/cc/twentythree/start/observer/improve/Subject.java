package com.cc.twentythree.start.observer.improve;

/**
 * @author chenchao
 * @version V1.0
 * @date 2021/9/10 15:58
 */
public interface Subject {
    void registerObserver (Observer o);
    void removeObserver(Observer o);
    void notifyAllObserver();
}
