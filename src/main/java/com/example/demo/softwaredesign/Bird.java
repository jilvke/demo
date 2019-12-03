package com.example.demo.softwaredesign;

/**
 * @ClassName : Bird
 * @Description: TODO
 * @Author: jilvke
 * @CreateDate: 2019/12/03
 * @Version: 1.0
 */
public class Bird {
    public void mainMoveMode(String birdName) {
        if ("变色龙".equals(birdName)) {
            System.out.println("变色龙用四肢走");
        } else {
            System.out.println(birdName + "用翅膀飞");
        }
    }
}
