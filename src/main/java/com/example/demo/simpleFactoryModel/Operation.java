package com.example.demo.simpleFactoryModel;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @ClassName : Operation
 * @Description: TODO
 * @Author: jilvke
 * @CreateDate: 2019/11/11
 * @Version: 1.0
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public abstract  class Operation {
    private double numberA;
    private double numberB;
    /**
     * get the result of operation
     * @return
     */
    public abstract double getResult();

}
