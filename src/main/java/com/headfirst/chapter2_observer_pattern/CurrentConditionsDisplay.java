package com.headfirst.chapter2_observer_pattern;

import java.util.WeakHashMap;
import java.util.spi.CurrencyNameProvider;

/**
 * As you can see, this call implemented two interfaces, which are actually those two responsibilities of the Display
 * Device:
 * 1. One is oriented to Subject as Observer.
 * 2. One is oriented to display screen as DisplayElment.
 * Created by zhangj52 on 1/21/2017.
 */
public class CurrentConditionsDisplay implements Observer, DisplayElement {

    private float temperature;
    private float humidity;
    private float pressure;

    private WeatherData weatherData;

    public CurrentConditionsDisplay(WeatherData weatherData) {
        this.weatherData = weatherData;
        weatherData.registerObserver(this);
    }

    @Override
    public void update(float temp, float humidity, float pressure) {
        this.temperature = temp;
        this.humidity = humidity;
        this.pressure = pressure;
    }

    @Override
    public void display() {
        System.out.println("{ temperature:" + temperature
                + ", humidity: " + humidity
                + ", pressure: " + pressure
                + "}");

    }

}
