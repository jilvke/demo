package com.example.demo.strategy;

/**
 * @ClassName : QuackBehaviorImpl
 * @Description: TODO
 * @Author: jilvke
 * @CreateDate: 2019/11/08
 * @Version: 1.0
 */
public class QuackBehaviorImpl implements QuackBehavior {
    @Override
    public void quack() {
        System.out.println("没有翅膀的鸭子，不会飞行。");

    }
}
