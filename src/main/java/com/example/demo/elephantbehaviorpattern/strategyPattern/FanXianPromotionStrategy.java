package com.example.demo.elephantbehaviorpattern.strategyPattern;

/**
 * @ClassName : FanXianPromotionStrategy
 * @Description: 促销策略：返现（具体策略）
 * @Author: jilvke
 * @CreateDate: 2019/12/10
 * @Version: 1.0
 */
public class FanXianPromotionStrategy implements PromotionStrategy {
    @Override
    public void doPromotion() {
        System.out.println("返现促销,返回的金额存放到淘宝用户的余额中");
    }
}
