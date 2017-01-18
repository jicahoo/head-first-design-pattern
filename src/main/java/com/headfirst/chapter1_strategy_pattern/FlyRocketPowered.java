package com.headfirst.chapter1_strategy_pattern;

/**
 * Created by zhangj52 on 1/18/2017.
 */
public class FlyRocketPowered implements FlyBehavior {
    @Override
    public void fly() {
        System.out.println("I's flying with a rocket.");
    }
}
