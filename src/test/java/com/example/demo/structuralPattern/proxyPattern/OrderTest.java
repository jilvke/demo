package com.example.demo.structuralPattern.proxyPattern;

class OrderTest {
    public static void main(String[] args) {
        Order order = Order.builder().userId(0).build();
        IOrderService orderServiceDynamicProxy = (IOrderService) new OrderServiceDynamicProxy(new OrderServiceImpl()).bind();

        orderServiceDynamicProxy.saveOrder(order);

  /*      OrderServiceStaticProxy orderServiceStaticProxy = new OrderServiceStaticProxy();
        orderServiceStaticProxy.saveOrder(order);*/
    }


}