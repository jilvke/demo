package com.example.demo.simpleFactoryModel;

/**
 * @ClassName : OperationFactory
 * @Description: TODO
 * @Author: jilvke
 * @CreateDate: 2019/11/11
 * @Version: 1.0
 */
public class OperationFactory {
    public static Operation productOperation(String operationStr){
        Operation operation = null;
        switch (operationStr){
            case "+":operation = new AddOperation();
                break;
            case "-":operation = new SubOperation();
                break;
        }
        return operation;
    }
}
