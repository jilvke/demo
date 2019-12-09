package com.example.demo.creationalPattern.AbstractFactoryPattern;

/**
 * @ClassName : CakeFactory
 * @Description: TODO
 * @Author: jilvke
 * @CreateDate: 2019/12/04
 * @Version: 1.0
 */
public interface CakeFactory {
    Cake getCake();

    GiftBox getGiftBox();
}
