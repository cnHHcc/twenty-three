package com.cc.twentythree.start.observer.improve;

import lombok.Data;
import org.springframework.validation.annotation.Validated;

/**
 * @author chenchao
 * @version V1.0
 * @date 2021/9/10 15:34
 * 观察者一号（气象局）
 */
@Data
public class CurrentConditions implements Observer{
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
        System.out.println("***CurrentConditions Temperature: " + temperature + "***");
        System.out.println("***CurrentConditions Pressure: " + pressure + "***");
        System.out.println("***CurrentConditions Humidity: " + humidity + "***");
    }
}
