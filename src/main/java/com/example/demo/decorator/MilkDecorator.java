package com.example.demo.decorator;

/**
 * @ClassName : MilkDecorator
 * @Description: TODO
 * @Author: jilvke
 * @CreateDate: 2019/11/11
 * @Version: 1.0
 */
public class MilkDecorator extends  BreadDecorator {
    public MilkDecorator(Bread bread) {
        super(bread);
    }
    public void myType(){
        super.myType();
        milkType();
    }

    public void milkType(){
        System.out.println("add milk.");
    }
}
