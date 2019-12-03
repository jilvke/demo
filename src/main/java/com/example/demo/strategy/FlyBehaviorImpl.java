package com.example.demo.strategy;

/**
 * @ClassName : FlyBehaviorImpl
 * @Description: TODO
 * @Author: jilvke
 * @CreateDate: 2019/11/08
 * @Version: 1.0
 */
public class FlyBehaviorImpl implements FlyBehavior {
    @Override
    public void fly() {
        System.out.println("拥有翅膀的鸭子，可以飞行");

    }
}
