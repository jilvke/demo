package com.example.demo.strategy;

/**
 * @ClassName : BlackEnemy
 * @Description: TODO
 * @Author: jilvke
 * @CreateDate: 2019/11/08
 * @Version: 1.0
 */
public class BlackEnemy implements  IStrategy {
    @Override
    public void operate() {
        System.out.println("孙夫人断后，挡住追兵。");
    }
}
