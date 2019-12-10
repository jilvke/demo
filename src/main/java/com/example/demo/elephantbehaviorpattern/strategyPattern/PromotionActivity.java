package com.example.demo.elephantbehaviorpattern.strategyPattern;

/**
 * @ClassName : PromotionActivity
 * @Description: TODO
 * @Author: jilvke
 * @CreateDate: 2019/12/10
 * @Version: 1.0
 */
public class PromotionActivity {
    private PromotionStrategy promotionStrategy;

    public PromotionActivity(PromotionStrategy promotionStrategy) {
        this.promotionStrategy = promotionStrategy;
    }

    public void executePromotionStrategy() {
        promotionStrategy.doPromotion();
    }
}
