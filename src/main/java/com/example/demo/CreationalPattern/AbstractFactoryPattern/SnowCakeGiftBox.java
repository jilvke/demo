package com.example.demo.CreationalPattern.AbstractFactoryPattern;

/**
 * @ClassName : SnowCakeGiftBox
 * @Description: TODO
 * @Author: jilvke
 * @CreateDate: 2019/12/04
 * @Version: 1.0
 */
public class SnowCakeGiftBox extends GiftBox {
    @Override
    public void produce() {
        System.out.println("生产雪花蛋糕礼盒...");
    }
}
