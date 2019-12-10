package com.example.demo.elephantbehaviorpattern;

import com.example.demo.elephantbehaviorpattern.strategyPattern.FanXianPromotionStrategy;
import com.example.demo.elephantbehaviorpattern.strategyPattern.LiJianPromotionStrategy;
import com.example.demo.elephantbehaviorpattern.strategyPattern.PromotionActivity;

class PromotionActivityTest {
    public static void main(String[] args) {
        PromotionActivity promotionActivity618 = new PromotionActivity(new LiJianPromotionStrategy());
        PromotionActivity promotionActivity1111 = new PromotionActivity(new FanXianPromotionStrategy());

        promotionActivity618.executePromotionStrategy();
        promotionActivity1111.executePromotionStrategy();

    }

}