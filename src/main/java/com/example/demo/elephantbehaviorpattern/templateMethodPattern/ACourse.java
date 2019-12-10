package com.example.demo.elephantbehaviorpattern.templateMethodPattern;

/**
 * @ClassName : ACourse
 * @Description: TODO
 * @Author: jilvke
 * @CreateDate: 2019/12/10
 * @Version: 1.0
 */
public abstract class ACourse {
    //不允许子类覆盖
    protected final void makeCourse() {
        this.makePPT();
        this.makeVideo();
        if (needWriteArticle()) {
            this.writeArticle();
        }
        this.packageCourse();
    }

    final void makePPT() {
        System.out.println("制作PPT");
    }

    final void makeVideo() {
        System.out.println("制作视频");
    }

    final void writeArticle() {
        System.out.println("编写博文");
    }

    //钩子方法
    //是否需要编写博文
    protected boolean needWriteArticle() {
        return false;
    }

    abstract void packageCourse();

}
