package com.headfirst.chapter3_decorator_pattern;

/**
 * Created by zhangj52 on 1/21/2017.
 */
public abstract class CondimentDecorator extends Beverage {

    protected Beverage beverage;

    public CondimentDecorator(Beverage beverage) {
        this.beverage = beverage;
    }
}
