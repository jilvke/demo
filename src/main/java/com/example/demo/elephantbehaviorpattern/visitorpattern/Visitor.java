package com.example.demo.elephantbehaviorpattern.visitorpattern;

/**
 * @ClassName : Visitor
 * @Description: TODO
 * @Author: jilvke
 * @CreateDate: 2019/12/10
 * @Version: 1.0
 */
public class Visitor implements IVisitor {
    @Override
    public void visit(FreeCourse freeCourse) {
        System.out.println("免费课程:" + freeCourse.getName());
    }

    @Override
    public void visit(CodingCourse codingCourse) {
        System.out.println("编程课程:" + codingCourse.getName() + " 价格:" + codingCourse.getPrice() + "元");
    }
}
