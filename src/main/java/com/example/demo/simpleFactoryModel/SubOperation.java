package com.example.demo.simpleFactoryModel;

/**
 * @ClassName : SubOperation
 * @Description: TODO
 * @Author: jilvke
 * @CreateDate: 2019/11/11
 * @Version: 1.0
 */
public class SubOperation extends  Operation  {

    @Override
    public double getResult() {
        return getNumberA() - getNumberB();
    }

}
