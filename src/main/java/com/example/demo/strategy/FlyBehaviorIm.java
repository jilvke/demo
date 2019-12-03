package com.example.demo.strategy;

/**
 * @ClassName : FlyBehaviorIm
 * @Description: TODO
 * @Author: jilvke
 * @CreateDate: 2019/11/08
 * @Version: 1.0
 */
public class FlyBehaviorIm implements FlyBehavior {
    @Override
    public void fly() {
        System.out.println("没有翅膀的鸭子，不会飞行。");
    }
}
