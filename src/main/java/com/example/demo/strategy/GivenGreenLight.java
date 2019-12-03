package com.example.demo.strategy;

/**
 * @ClassName : GivenGreenLight
 * @Description: TODO
 * @Author: jilvke
 * @CreateDate: 2019/11/08
 * @Version: 1.0
 */
public class GivenGreenLight  implements IStrategy {
    @Override
    public void operate() {
        System.out.println("求吴国太开个绿灯。");
    }
}
