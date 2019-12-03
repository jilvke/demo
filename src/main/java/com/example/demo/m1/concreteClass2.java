package com.example.demo.m1;

/**
 * @ClassName : concreteClass2
 * @Description: TODO
 * @Author: jilvke
 * @CreateDate: 2019/11/08
 * @Version: 1.0
 */
public class concreteClass2 extends  AbstractClass {
    @Override
    protected void basicMethodOne() {
        System.out.println("I'm basicMethodOne in concreteClass2");
    }

    @Override
    protected void basicMethodTwo() {
        System.out.println("I'm basicMethodTwo in concreteClass2");
    }
}
