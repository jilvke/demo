package com.example.demo.decorator;

/**
 * @ClassName : ButterDecorator
 * @Description: TODO
 * @Author: jilvke
 * @CreateDate: 2019/11/11
 * @Version: 1.0
 */
public class ButterDecorator extends BreadDecorator {
    public ButterDecorator(Bread bread) {
        super(bread);
    }
    public void myType(){
        super.myType();
        butterType();
    }

    public void butterType(){
        System.out.println("add butter.");
    }
}
