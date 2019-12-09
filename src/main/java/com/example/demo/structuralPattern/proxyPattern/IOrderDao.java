package com.example.demo.structuralPattern.proxyPattern;

/**
 * @ClassName : IOrderDao
 * @Description: TODO
 * @Author: jilvke
 * @CreateDate: 2019/12/09
 * @Version: 1.0
 */
public interface IOrderDao {
    //添加订单
    int insert(Order order);
}
