package com.example.demo.CreationalPattern.SimpleFactoryPattern;

/**
 * @ClassName : CCake
 * @Description: 具体产品角色
 * @Author: jilvke
 * @CreateDate: 2019/12/04
 * @Version: 1.0
 */
public class CCake extends Cake {
    @Override
    public void produce() {
        System.out.println("生产巧克力蛋糕卷");
    }
}
