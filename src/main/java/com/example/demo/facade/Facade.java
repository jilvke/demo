package com.example.demo.facade;

/**
 * @ClassName : Facade
 * @Description: TODO
 * @Author: jilvke
 * @CreateDate: 2019/11/08
 * @Version: 1.0
 */
public class Facade {
    //示意方法，满足客户需要的功能
    public void test(){
        ModuleA a=new ModuleA();
        a.testA();
        ModuleB b=new ModuleB();
        b.testB();
        ModuleC c=new ModuleC();
        c.testC();
    }
}
