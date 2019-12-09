package com.example.demo.creationalPattern.AbstractFactoryPattern;

/**
 * @ClassName : SnowCake
 * @Description: TODO
 * @Author: jilvke
 * @CreateDate: 2019/12/04
 * @Version: 1.0
 */
public class SnowCake extends Cake {
    @Override
    public void produce() {
        System.out.println("生产雪花蛋糕...");
    }
}
