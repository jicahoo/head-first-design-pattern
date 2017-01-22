package com.headfirst.chapter3_decorator_pattern;

/**
 * Created by zhangj52 on 1/21/2017.
 */
public class StarbuzzCoffee {

    public static void main(String[] args) {
        Beverage darkRoastBase = new DarkRoast();

        darkRoastBase = new Milk(darkRoastBase);
        darkRoastBase = new Mocha(darkRoastBase);

        System.out.println(darkRoastBase.getDescription());

        System.out.println("$" + darkRoastBase.cost());

    }
}
