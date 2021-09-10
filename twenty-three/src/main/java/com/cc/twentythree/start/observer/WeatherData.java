package com.cc.twentythree.start.observer;

import lombok.Data;

/**
 * @author chenchao
 * @version V1.0
 * @date 2021/9/10 15:35
 * 包含最新的天气情况
 * 包含CurrentConditions类
 * 当数据有更新时，主动调用包含CurrentConditions类的update方法 这样第三方就可以获取最新的天气情况
 */
@Data
public class WeatherData {
    private float temperature;
    private float pressure;
    private float humidity;
    private CurrentConditions currentConditions;

    public WeatherData(CurrentConditions currentConditions) {
        this.currentConditions = currentConditions;
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
        currentConditions.update(getTemperature(), getPressure(), getHumidity());
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
}