package com.headfirst.chapter1_strategy_pattern;

/**
 * Created by zhangj52 on 1/18/2017.
 */
public class ModelDuck extends Duck {
    ModelDuck() {
        setFlyBehavior(new FlyNoWay());
        setQuackBehavior(new Quack());
    }

    @Override

    public void display() {
        System.out.println("I am Model duck.");
    }
}
