package com.example.demo.creationalPattern.FactoryMethodPattern;

class CakeFactoryTest {
    public static void main(String[] args) {
        CakeFactory cakeFactory = new CCakeFactory();
        Cake cake = cakeFactory.getCakeFactory();
        cake.produce();

        CakeFactory cakeFactory2 = new SnowCakeFactory();
        Cake cake2 = cakeFactory2.getCakeFactory();
        cake2.produce();
    }

}