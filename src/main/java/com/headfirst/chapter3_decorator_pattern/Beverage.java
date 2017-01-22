package com.headfirst.chapter3_decorator_pattern;

/**
 * Created by zhangj52 on 1/21/2017.
 */
public abstract class Beverage {

    private String description;

    public String getDescription() {
        return description;
    }

    public abstract double cost();
}
