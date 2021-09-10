package com.cc.twentythree.start.observer;

/**
 * @author chenchao
 * @version V1.0
 * @date 2021/9/10 15:35
 */
public class InternetWeather {
    public static void main(String[] args) {
        //创建接入放
        CurrentConditions currentConditions = new CurrentConditions();
        //将接入方传递到WeatherData中
        WeatherData weatherData = new WeatherData(currentConditions);
        //更新天气
        weatherData.setData(30, 150, 40);
        //模拟天气变化
        weatherData.setData(100,20,32);
    }
}
