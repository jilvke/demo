package com.example.demo.creationalPattern.AbstractFactoryPattern;

/**
 * @ClassName : CCakeFactory
 * @Description: TODO
 * @Author: jilvke
 * @CreateDate: 2019/12/04
 * @Version: 1.0
 */
public class CCakeFactory implements CakeFactory {
    @Override
    public Cake getCake() {
        return new CCake();
    }

    @Override
    public GiftBox getGiftBox() {
        return new CCakeGiftBox();
    }
}
