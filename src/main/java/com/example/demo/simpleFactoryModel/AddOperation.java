package com.example.demo.simpleFactoryModel;

import lombok.Builder;

/**
 * @ClassName : AddOperation
 * @Description: TODO
 * @Author: jilvke
 * @CreateDate: 2019/11/11
 * @Version: 1.0
 */
public class AddOperation  extends   Operation {

    @Override
    public double getResult() {
        return getNumberA()+getNumberB();
    }
}
