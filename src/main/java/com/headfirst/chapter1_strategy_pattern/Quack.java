package com.headfirst.chapter1_strategy_pattern;

/**
 * Created by zhangj52 on 1/18/2017.
 */
public class Quack implements QuackBehavior {
    @Override
    public void quack() {
        System.out.println("Quack!");
    }
}
