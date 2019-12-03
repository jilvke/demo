package com.example.demo.m1;

/**
 * @ClassName : AbstractClassTest
 * @Description: TODO
 * @Author: jilvke
 * @CreateDate: 2019/11/08
 * @Version: 1.0
 */
public class AbstractClassTest {
    public static void main(String[] args) {
        AbstractClass abstractClass = new concreteClass1();
        abstractClass.templateMethod();
        AbstractClass abstractClass2  =   new concreteClass2();
        abstractClass2.templateMethod();
    }
}
