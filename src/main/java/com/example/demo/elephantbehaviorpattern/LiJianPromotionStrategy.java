package com.example.demo.elephantbehaviorpattern;

/**
 * @ClassName : LiJianPromotionStrategy
 * @Description: 促销策略：立减（具体策略）
 * @Author: jilvke
 * @CreateDate: 2019/12/10
 * @Version: 1.0
 */
public class LiJianPromotionStrategy implements PromotionStrategy {
    @Override
    public void doPromotion() {
        System.out.println("立减促销,课程的价格直接减去配置的价格");
    }
}
