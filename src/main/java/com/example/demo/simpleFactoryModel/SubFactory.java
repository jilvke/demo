package com.example.demo.simpleFactoryModel;

/**
 * @ClassName : SubFactory
 * @Description: TODO
 * @Author: jilvke
 * @CreateDate: 2019/11/11
 * @Version: 1.0
 */
public class SubFactory extends   OperationFactory1  {
    @Override
    public Operation produceOperation() {
        return new SubOperation();
    }
}
