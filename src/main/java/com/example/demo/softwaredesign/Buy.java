package com.example.demo.softwaredesign;

/**
 * @ClassName : Buy
 * @Description: TODO
 * @Author: jilvke
 * @CreateDate: 2019/12/03
 * @Version: 1.0
 */
public class Buy {

    private Things things;

    public void setThings(Things things) {
        this.things = things;
    }

    public void buy() {
        things.buyThins();
    }

}
