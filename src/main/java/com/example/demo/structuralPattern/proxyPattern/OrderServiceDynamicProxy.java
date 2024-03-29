package com.example.demo.structuralPattern.proxyPattern;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

/**
 * @ClassName : OrderServiceDynamicProxy
 * @Description: TODO
 * @Author: jilvke
 * @CreateDate: 2019/12/09
 * @Version: 1.0
 */
public class OrderServiceDynamicProxy implements InvocationHandler {
    //目标对象
    private Object target;

    //通过构造器传入目标对象
    public OrderServiceDynamicProxy(Object target) {
        this.target = target;
    }

    //绑定目标对象
    public Object bind() {
        Class cls = target.getClass();
        return Proxy.newProxyInstance(cls.getClassLoader(), cls.getInterfaces(), this);
    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        Object argObject = args[0];
        beforeMethod(argObject);
        Object object = method.invoke(target, args);
        afterMethod();
        return object;
    }

    private void beforeMethod(Object obj) {
        int userId = 0;
        System.out.println("动态代理 before code");
        if (obj instanceof Order) {
            Order order = (Order) obj;
            userId = order.getUserId();
        }
        int dbRouter = userId % 2;
        System.out.println("动态代理分配到【db" + dbRouter + "】处理数据");

        //todo 设置dataSource;
        DataSourceContextHolder.setDBType("db" + String.valueOf(dbRouter));
    }

    private void afterMethod() {
        System.out.println("动态代理 after code");
    }
}
