package com.headfirst.chapter2_observer_pattern;

/**
 * Created by zhangj52 on 1/21/2017.
 */
public class WeatherStationJdk {

    public static void main(String[] args) {
        WeatherDataJdk weatherData = new WeatherDataJdk();

        CurrentConditionsDisplayJdk displayJdk = new CurrentConditionsDisplayJdk(weatherData);

        weatherData.addObserver(displayJdk);
        weatherData.setMeasurements(10, 20, 30);
        weatherData.setMeasurements(40, 50, 60);

    }
}
