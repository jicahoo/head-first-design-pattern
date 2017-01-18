package com.headfirst.chapter1_strategy_pattern;

/**
 * Created by zhangj52 on 1/18/2017.
 */
public class MallardDuck extends Duck {

    MallardDuck() {
        setFlyBehavior(new FlyWithWings());
        setQuackBehavior(new Quack());
    }

    @Override
    public void display() {
        System.out.println("I am mallard duck.");
    }

}
