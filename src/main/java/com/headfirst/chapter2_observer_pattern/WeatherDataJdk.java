package com.headfirst.chapter2_observer_pattern;

import java.util.Observable;

/**
 * Created by zhangj52 on 1/21/2017.
 */
public class WeatherDataJdk extends Observable {

    private float temperature;
    private float humidity;
    private float pressure;


    public WeatherDataJdk() {
    }

    public void measurementsChanged(){
        setChanged();
        notifyObservers(this);
    }

    public void setMeasurements(float temperature, float humidity, float pressure) {
        this.temperature = temperature;
        this.humidity = humidity;
        this.pressure = pressure;
        measurementsChanged();
    }

    public float getTemperature() {
        return temperature;
    }

    public void setTemperature(float temperature) {
        this.temperature = temperature;
    }

    public float getHumidity() {
        return humidity;
    }

    public void setHumidity(float humidity) {
        this.humidity = humidity;
    }

    public float getPressure() {
        return pressure;
    }

    public void setPressure(float pressure) {
        this.pressure = pressure;
    }
}
