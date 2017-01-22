package com.headfirst.chapter3_decorator_pattern;

/**
 * Created by zhangj52 on 1/21/2017.
 */
public class Milk extends CondimentDecorator {

    public Milk(Beverage beverage) {
        super(beverage);
    }

    @Override
    public double cost() {
        return super.beverage.cost() + 1;
    }

    @Override
    public String getDescription() {
        return beverage.getDescription() + ", Milk";
    }
}

