package com.example.demo.decorator;

/**
 * @ClassName : BreadDecorator
 * @Description: TODO
 * @Author: jilvke
 * @CreateDate: 2019/11/11
 * @Version: 1.0
 */
public abstract  class BreadDecorator implements  Bread {
    private Bread bread;

    public BreadDecorator(Bread bread) {
        this.bread = bread;
    }


    public void setBread(Bread bread) {
        this.bread = bread;
    }

    @Override
    public void myType() {
        bread.myType();
    }
}
