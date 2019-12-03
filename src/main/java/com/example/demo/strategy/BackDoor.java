package com.example.demo.strategy;

/**
 * @ClassName : BackDoor
 * @Description: TODO
 * @Author: jilvke
 * @CreateDate: 2019/11/08
 * @Version: 1.0
 */
public class BackDoor implements IStrategy {

    @Override
    public void operate() {
        System.out.println("找乔国老帮忙，让吴国太给孙权施加压力，使孙权不能杀刘备...");
    }
}
