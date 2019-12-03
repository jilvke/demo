package com.example.demo.softwaredesign;

import org.junit.jupiter.api.Test;

class BuyTest {
    Buy buy = new Buy();

    @Test
    void buy() {
        buy.setThings(new BuyMouse());
        buy.buy();
    }
}