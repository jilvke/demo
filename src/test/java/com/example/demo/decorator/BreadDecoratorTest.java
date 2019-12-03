package com.example.demo.decorator;

import static org.junit.jupiter.api.Assertions.*;

class BreadDecoratorTest {
    public static void main(String[] args) {
        SimpleBread simpleBread = new SimpleBread();
        ButterDecorator butterDecorator = new ButterDecorator(simpleBread);
        MilkDecorator milkDecorator = new MilkDecorator(butterDecorator);
        milkDecorator.myType();
    }

}