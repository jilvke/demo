package com.example.demo.structuralPattern.decoratorPattern;

class ABattercakeTest {
    public static void main(String[] args) {
        ABattercake aBattercake = new SausageDecorator(new EggDecorator(new EggDecorator(new Battercake())));
        System.out.println(aBattercake.getDesc() + " 销售价格为:" + aBattercake.cost());
    }

}