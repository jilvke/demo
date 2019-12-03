package com.example.demo.StaticProxy;

/**
 * @ClassName : IntermediaryAgent
 * @Description: TODO
 * @Author: jilvke
 * @CreateDate: 2019/11/11
 * @Version: 1.0
 */
public class IntermediaryAgent implements  Customer {
    private Customer customer;
    public IntermediaryAgent(Customer customer){
        this.customer = customer;
    }

    public void setCustomer(Customer customer){
        this.customer = customer;
    }
    @Override
    public void buyGoods() {
        customer.buyGoods();
        doOther();
    }

    public void doOther(){
        System.out.println("the other things needed to do by proxy");
    }
}
