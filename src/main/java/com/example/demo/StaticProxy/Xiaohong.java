package com.example.demo.StaticProxy;

/**
 * @ClassName : Xiaohong
 * @Description: TODO
 * @Author: jilvke
 * @CreateDate: 2019/11/11
 * @Version: 1.0
 */
public class Xiaohong implements  Customer {
    @Override
    public void buyGoods() {
        System.out.println("pay");
    }
}
