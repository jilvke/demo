package com.example.demo.softwaredesign;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class BirdTest {
    Bird bird;

    @BeforeEach
    void setUp() {
        bird = new Bird();
    }

    @Test
    void mainMoveMode() {
/*        bird.mainMoveMode("猫头鹰");
        bird.mainMoveMode("变色龙");*/
        FlyBird flyBird = new FlyBird();
        WalkAnimal walkAnimal = new WalkAnimal();
        //应用层判断
        flyBird.mainMoveMode("猫头鹰");
        walkAnimal.mainMoveMode("变色龙");

    }
}