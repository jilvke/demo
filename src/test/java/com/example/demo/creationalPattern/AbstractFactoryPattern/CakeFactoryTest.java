package com.example.demo.creationalPattern.AbstractFactoryPattern;

import org.junit.jupiter.api.Test;

class CakeFactoryTest {

    @Test
    void getCake() {
        CakeFactory cakeFactory = new SnowCakeFactory();

        GiftBox giftBox = cakeFactory.getGiftBox();

        giftBox.produce();

    }

    @Test
    void getGiftBox() {
        CakeFactory cakeFactory = new SnowCakeFactory();
        Cake cake = cakeFactory.getCake();
        cake.produce();


    }
}