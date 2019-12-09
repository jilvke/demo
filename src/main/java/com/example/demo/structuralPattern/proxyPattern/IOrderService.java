package com.example.demo.structuralPattern.proxyPattern;

/**
 * @ClassName : IOrderService
 * @Description: TODO
 * @Author: jilvke
 * @CreateDate: 2019/12/09
 * @Version: 1.0
 */
public interface IOrderService {
    //保存订单  返回值为生效行数
    int saveOrder(Order order);
}
