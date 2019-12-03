package com.example.demo.StaticProxy;

import java.lang.reflect.Proxy;

/**
 * @ClassName : ProxyFactory
 * @Description: TODO
 * @Author: jilvke
 * @CreateDate: 2019/11/11
 * @Version: 1.0
 */
public class ProxyFactory {
    private Customer customer;

    public ProxyFactory(Customer customer) {
        this.customer = customer;
    }

    public Object getProxyInstance() {
        return Proxy.newProxyInstance(customer.getClass().getClassLoader(),
                customer.getClass().getInterfaces(),
                (proxy, method, args) -> {
                    Object invoke = method.invoke(customer, args);
                    doOther();
                    return invoke;
                });

    }

    public void doOther() {
        System.out.println("~~~~~~~~~~~~~~~~ to do by proxy");
    }

}
