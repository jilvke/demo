package com.example.demo.simpleFactoryModel;

import com.example.demo.StaticProxy.CglibProxy;

import static org.junit.jupiter.api.Assertions.*;

class OperationFactoryTest {
    public static void main(String[] args) {
        //if you want get the result of 2 plus 1
        Operation operationPlus = OperationFactory.productOperation("+");
        operationPlus.setNumberA(1);
        operationPlus.setNumberB(2);
        System.out.println("1+2="+operationPlus.getResult());

        //if you want get the result of 2 minus 1

        Operation operationMinus = OperationFactory.productOperation("-");
        operationMinus.setNumberA(2);
        operationMinus.setNumberB(1);
        System.out.println("2-1="+operationMinus.getResult());


        OperationFactory1 addFactory = new AddFactory();
        Operation addOperation = addFactory.produceOperation();
        addOperation.setNumberA(1);
        addOperation.setNumberA(2);

    }


}