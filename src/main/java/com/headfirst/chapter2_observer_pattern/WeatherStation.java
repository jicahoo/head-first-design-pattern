package com.headfirst.chapter2_observer_pattern;

/**
 * Created by zhangj52 on 1/21/2017.
 */
public class WeatherStation {

    public static void main(String[] args) {
        WeatherData weatherData = new WeatherData();

        CurrentConditionsDisplay currentConditionsDisplay = new CurrentConditionsDisplay(weatherData);

        currentConditionsDisplay.display();

        weatherData.setMeasurements(10, 20, 30);
        currentConditionsDisplay.display();
        weatherData.setMeasurements(40, 50, 60);
        currentConditionsDisplay.display();
    }
}
