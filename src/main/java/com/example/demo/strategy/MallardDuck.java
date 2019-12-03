package com.example.demo.strategy;

/**
 * @ClassName : MallardDuck
 * @Description: TODO
 * @Author: jilvke
 * @CreateDate: 2019/11/08
 * @Version: 1.0
 */
public class MallardDuck extends Duck {
    public MallardDuck() {
        flyBehavior=new FlyBehaviorImpl();
        quackBehavior=new QuackBehaviorImpl();
    }

    @Override
    public void display() {
        System.out.println("蓝色");

    }
}
