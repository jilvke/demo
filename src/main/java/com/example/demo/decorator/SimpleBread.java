package com.example.demo.decorator;

/**
 * @ClassName : SimpleBread
 * @Description: TODO
 * @Author: jilvke
 * @CreateDate: 2019/11/11
 * @Version: 1.0
 */
public class SimpleBread implements  Bread {
    @Override
    public void myType() {
        System.out.println("I'm bread。");
    }
}
