package com.headfirst.chapter2_observer_pattern;

import java.util.*;

/**
 * Created by zhangj52 on 1/21/2017.
 */
public class CurrentConditionsDisplayJdk implements java.util.Observer, DisplayElement {

    private Observable observable;
    private float temperature;
    private float humidity;
    private float pressure;

    public CurrentConditionsDisplayJdk(Observable observable) {
        this.observable = observable;
        observable.addObserver(this);
    }

    @Override
    public void update(Observable o, Object arg) {
        if (arg instanceof  WeatherDataJdk) {
            WeatherDataJdk weatherData = (WeatherDataJdk) arg;
            this.temperature = weatherData.getTemperature();
            this.humidity = weatherData.getHumidity();
            this.pressure = weatherData.getPressure();
            display();
        }
    }

    @Override
    public void display() {
        System.out.println("{temperature:" + temperature
        + ", humidity: " + humidity
        + ", pressure: " + pressure);
    }
}
