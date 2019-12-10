package com.example.demo.elephantbehaviorpattern.templateMethodPattern;

/**
 * @ClassName : DesignPatternCourse
 * @Description: TODO
 * @Author: jilvke
 * @CreateDate: 2019/12/10
 * @Version: 1.0
 */
public class DesignPatternCourse extends ACourse {

    @Override
    void packageCourse() {
        System.out.println("提供配套资料");
    }

    @Override
    protected boolean needWriteArticle() {
        return true;
    }
}
