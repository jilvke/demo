package com.example.demo.creationalPattern.FactoryMethodPattern;

/**
 * @ClassName : CCakeFactory
 * @Description: TODO
 * @Author: jilvke
 * @CreateDate: 2019/12/04
 * @Version: 1.0
 */
public class CCakeFactory extends CakeFactory {
    @Override
    public Cake getCakeFactory() {
        return new CCake();
    }
}
