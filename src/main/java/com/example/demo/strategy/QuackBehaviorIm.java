package com.example.demo.strategy;

/**
 * @ClassName : QuackBehaviorIm
 * @Description: TODO
 * @Author: jilvke
 * @CreateDate: 2019/11/08
 * @Version: 1.0
 */
public class QuackBehaviorIm implements QuackBehavior {
    @Override
    public void quack() {
        System.out.println("叽叽叫");
    }
}
