package com.example.demo.structuralPattern.adapterPattern;

class TargetTest {
    public static void main(String[] args) {
        Target target = new ConcreteTarget();
        target.request();

        Target adapterTarget = new Adapter();
        adapterTarget.request();
    }

}