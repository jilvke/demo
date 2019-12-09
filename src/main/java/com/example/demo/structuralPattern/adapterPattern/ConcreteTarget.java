package com.example.demo.structuralPattern.adapterPattern;

/**
 * @ClassName : ConcreteTarget
 * @Description: TODO
 * @Author: jilvke
 * @CreateDate: 2019/12/09
 * @Version: 1.0
 */
public class ConcreteTarget implements Target {
    @Override
    public void request() {
        System.out.println("ConcreteTarget目标方法");
    }
}
