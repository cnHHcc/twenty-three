package com.cc.twentythree.start.observer.improve;

/**
 * @author chenchao
 * @version V1.0
 * @date 2021/9/10 16:22
 */
public class Client {
    public static void main(String[] args) {
        WeatherData weatherData = new WeatherData();

        CurrentConditions currentConditions = new CurrentConditions();
        XinLang xinLang = new XinLang();
        weatherData.registerObserver(currentConditions);
        weatherData.registerObserver(xinLang);
        weatherData.setData(10,20,30);
        System.out.println("=========================");
        //模拟天气变化 移除CurrentConditions这个观察者
        weatherData.removeObserver(currentConditions);
        weatherData.setData(1,2,3);

    }
}
