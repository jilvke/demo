package com.example.demo.structuralPattern.adapterPattern;

/**
 * @ClassName : Adapter1
 * @Description: TODO
 * @Author: jilvke
 * @CreateDate: 2019/12/09
 * @Version: 1.0
 */
public class Adapter1 implements Target {
    private Adaptee adaptee = new Adaptee();

    @Override
    public void request() {
        adaptee.adapteeRequest();
    }
}
