package com.example.demo.elephantbehaviorpattern.visitorpattern;

/**
 * @ClassName : Course
 * @Description: TODO
 * @Author: jilvke
 * @CreateDate: 2019/12/10
 * @Version: 1.0
 */
public abstract class Course {
    private String name;


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    //处理访问者的访问 参数是访问者
    public abstract void accept(IVisitor visitor);
}
