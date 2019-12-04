package com.example.demo.CreationalPattern.FactoryMethodPattern;

/**
 * @ClassName : SnowCakeFactory
 * @Description: TODO
 * @Author: jilvke
 * @CreateDate: 2019/12/04
 * @Version: 1.0
 */
public class SnowCakeFactory extends CakeFactory {
    @Override
    public Cake getCakeFactory() {
        return new SnowCake();
    }
}
