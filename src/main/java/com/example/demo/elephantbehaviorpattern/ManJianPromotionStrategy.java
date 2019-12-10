package com.example.demo.elephantbehaviorpattern;

/**
 * @ClassName : ManJianPromotionStrategy
 * @Description: 促销策略：满减（具体策略）
 * @Author: jilvke
 * @CreateDate: 2019/12/10
 * @Version: 1.0
 */
public class ManJianPromotionStrategy implements PromotionStrategy {
    @Override
    public void doPromotion() {
        System.out.println("满减促销,满200-20元");
    }
}
