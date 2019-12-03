package com.example.demo.strategy;

import static org.junit.jupiter.api.Assertions.*;

class ContextTest {
    public static void main(String[] args) {
        Context context;
        //刚到吴国的时候拆开第一个
        System.out.println("刚刚到吴国的时候拆开第一个");
        context=new Context(new BackDoor());
        context.operate();//拆开执行
        System.out.println("\n\n\n");

        //当刘备乐不思蜀时，拆开第二个
        System.out.println("刘备乐不思蜀，拆开第二个");
        context=new Context(new GivenGreenLight());
        context.operate();//拆开第二个
        System.out.println("\n\n\n");

        //孙权的追兵？拆开第三个
        System.out.println("孙权的追兵，拆开第三个");
        context=new Context(new BlackEnemy());
        context.operate();
        System.out.println("\n\n\n");
    }

}