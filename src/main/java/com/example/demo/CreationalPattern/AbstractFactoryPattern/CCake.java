package com.example.demo.CreationalPattern.AbstractFactoryPattern;

/**
 * @ClassName : CCake
 * @Description: TODO
 * @Author: jilvke
 * @CreateDate: 2019/12/04
 * @Version: 1.0
 */
public class CCake extends Cake {
    @Override
    public void produce() {
        System.out.println("生产巧克力蛋糕...");
    }
}
