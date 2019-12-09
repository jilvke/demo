package com.example.demo.structuralPattern.facadePattern;

class PointsGiftTest {
    public static void main(String[] args) {
        PointsGift pointsGift = new PointsGift("渊虹");
        GiftExchange giftExchange = new GiftExchange();

        giftExchange.giftExchange(pointsGift);
    }

}