package com.headfirst.chapter3_decorator_pattern;

/**
 * Created by zhangj52 on 1/21/2017.
 */
public class Mocha extends CondimentDecorator {

    public Mocha(Beverage beverage) {
        super(beverage);
    }

    @Override
    public double cost() {
        return beverage.cost() + 3;
    }

    @Override
    public String getDescription() {
        return beverage.getDescription() + ", Mocha";
    }

}
