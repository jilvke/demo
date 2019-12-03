package com.example.demo.StaticProxy;

import static org.junit.jupiter.api.Assertions.*;

class IntermediaryAgentTest {
    public static void main(String[] args) {
        Customer customer = new Xiaohong();
        IntermediaryAgent intermediaryAgent = new IntermediaryAgent(customer);
        intermediaryAgent.buyGoods();

        ProxyFactory proxyFactory = new ProxyFactory(customer);
        Customer proxy = (Customer) proxyFactory.getProxyInstance();
        proxy.buyGoods();

        CglibProxy cglibProxy = new CglibProxy();
        Customer customerProxy = (Customer)cglibProxy.instanceProxy(Xiaohong.class);
        customerProxy.buyGoods();

    }

}