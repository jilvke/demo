package com.example.demo.elephantbehaviorpattern.visitorpattern;

/**
 * @ClassName : IVisitor
 * @Description: 抽象访问者Visitor
 * @Author: jilvke
 * @CreateDate: 2019/12/10
 * @Version: 1.0
 */
public interface IVisitor {
    void visit(FreeCourse freeCourse);

    void visit(CodingCourse codingCourse);
}
