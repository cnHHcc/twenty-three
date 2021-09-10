package com.cc.twentythree.start.observer.improve;

import lombok.Data;

import java.util.ArrayList;
import java.util.List;

/**
 * @author chenchao
 * @version V1.0
 * @date 2021/9/10 15:35
 * 包含最新的天气情况
 * 包含观察者集合
 * 当数据有更新时，主动调用集合 通知所有的观察者更新数据
 */
@Data
public class WeatherData implements Subject{
    private float temperature;
    private float pressure;
    private float humidity;
    private List<Observer> observerList;

    public WeatherData() {
        this.observerList = new ArrayList<Observer>();
    }

    public float getTemperature() {
        return temperature;
    }

    public float getPressure() {
        return pressure;
    }

    public float getHumidity() {
        return humidity;
    }

    public void dataChange() {
        notifyAllObserver();
    }

    /**
     * 当数据有更新时，调用该方法
     * 同时该方法会动用自身的dataChange方法，而dataChange方法中会调用CurrentConditions的update方法，完成更新和输出的目的
     */
    public void setData(float temperature, float pressure, float humidity) {
        this.temperature = temperature;
        this.pressure = pressure;
        this.humidity = humidity;
        dataChange();
    }
    //注册
    @Override
    public void registerObserver(Observer o) {
        observerList.add(o);
    }
    //移除
    @Override
    public void removeObserver(Observer o) {
        if (observerList.contains(o)){
            observerList.remove(o);
        }
    }

    @Override
    public void notifyAllObserver() {
        observerList.forEach(o ->{
            o.update(this.temperature,this.pressure,this.humidity);
        });
    }
}