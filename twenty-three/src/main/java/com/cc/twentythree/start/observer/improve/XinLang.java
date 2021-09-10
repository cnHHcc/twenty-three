package com.cc.twentythree.start.observer.improve;

/**
 * @author chenchao
 * @version V1.0
 * @date 2021/9/10 16:24
 */
public class XinLang implements Observer{
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
     * 更新
     */
    @Override
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
        System.out.println("***XinLang Temperature: " + temperature + "***");
        System.out.println("***XinLang Pressure: " + pressure + "***");
        System.out.println("***XinLang Humidity: " + humidity + "***");
    }
}
