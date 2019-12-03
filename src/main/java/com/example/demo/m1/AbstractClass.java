package com.example.demo.m1;

/**
 * @ClassName : AbstractClass
 * @Description: 抽象父类
 * @Author: jilvke
 * @CreateDate: 2019/11/08
 * @Version: 1.0
 */
abstract  class AbstractClass {
    /**
     * 基本方法1
     */
    protected abstract void basicMethodOne();

    /**
     * 基本方法2
     */
    protected abstract void basicMethodTwo();

    /**
     * 模板方法
     */
    public final void templateMethod(){
        basicMethodOne();
        basicMethodTwo();
    }
}
