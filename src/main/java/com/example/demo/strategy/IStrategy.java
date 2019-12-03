package com.example.demo.strategy;

/**
 * @ClassName : IStrategy
 * @Description: 策略接口 抽象策略
 * @Author: jilvke
 * @CreateDate: 2019/11/08
 * @Version: 1.0
 */
public interface IStrategy {
    //每个锦囊妙计都有一个可执行的算法
    public void operate();
}
