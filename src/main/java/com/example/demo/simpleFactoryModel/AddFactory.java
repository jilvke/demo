package com.example.demo.simpleFactoryModel;

/**
 * @ClassName : AddFactory
 * @Description: TODO
 * @Author: jilvke
 * @CreateDate: 2019/11/11
 * @Version: 1.0
 */
public class AddFactory extends  OperationFactory1 {
    @Override
    public Operation produceOperation() {
        return new AddOperation();
    }
}
