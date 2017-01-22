package com.headfirst.chapter3_decorator_pattern;

/**
 * Created by zhangj52 on 1/21/2017.
 */
public class DarkRoast extends Beverage {
    @Override
    public double cost() {
        return 2;
    }

    @Override
    public String getDescription() {
        return "DarkRoast Coffee ";
    }
}
