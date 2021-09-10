package com.cc.twentythree.start.observer;

import lombok.Data;

/**
 * @author chenchao
 * @version V1.0
 * @date 2021/9/10 15:34
 * 显示当前天气情况（假设是气象站自己的网站）
 */
@Data
public class CurrentConditions {
    /**
     * 温度
     */
    private float temperature;
    /**
     * 气压
     */
    private float pressure;
    /**
     * 湿度
     */
    private float humidity;

    /**
     * 更新  由WeatherDate调用
     */
    public void update(float temperature, float pressure, float humidity) {
        this.temperature = temperature;
        this.pressure = pressure;
        this.humidity = humidity;
        display();
    }

    /**
     * 显示
     */
    public void display() {
        System.out.println("***Today mTemperature: " + temperature + "***");
        System.out.println("***Today mPressure: " + pressure + "***");
        System.out.println("***Today mHumidity: " + humidity + "***");
    }
}
