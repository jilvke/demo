package com.example.demo.CreationalPattern.AbstractFactoryPattern;

/**
 * @ClassName : SnowCakeFactory
 * @Description: TODO
 * @Author: jilvke
 * @CreateDate: 2019/12/04
 * @Version: 1.0
 */
public class SnowCakeFactory implements CakeFactory {
    @Override
    public Cake getCake() {
        return new SnowCake();
    }

    @Override
    public GiftBox getGiftBox() {
        return new SnowCakeGiftBox();
    }
}
