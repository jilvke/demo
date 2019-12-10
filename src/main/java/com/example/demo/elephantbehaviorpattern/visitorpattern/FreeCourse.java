package com.example.demo.elephantbehaviorpattern.visitorpattern;

/**
 * @ClassName : FreeCourse
 * @Description: TODO
 * @Author: jilvke
 * @CreateDate: 2019/12/10
 * @Version: 1.0
 */
public class FreeCourse extends Course {
    @Override
    public void accept(IVisitor visitor) {
        visitor.visit(this);
    }
}
