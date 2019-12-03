package com.example.demo.m1;

/**
 * @ClassName : concreteClass1
 * @Description: TODO
 * @Author: jilvke
 * @CreateDate: 2019/11/08
 * @Version: 1.0
 */
public class concreteClass1 extends  AbstractClass {
    @Override
    protected void basicMethodOne() {
        System.out.println("I'm basicMethodOne in concreteClass1");
    }

    @Override
    protected void basicMethodTwo() {
        System.out.println("I'm basicMethodTwo in concreteClass1");
    }
}
