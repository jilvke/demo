package com.example.demo.CreationalPattern.SimpleFactoryPattern;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class CakeTest {
    CakeFactory cakeFactory;

    @BeforeEach
    void setUp() {
        cakeFactory = new CakeFactory();
    }

    @Test
    void produce() {
        Cake cake = cakeFactory.getCake(SnowCake.class);
        if (cake == null) {
            return;
        }
        cake.produce();
    }
}