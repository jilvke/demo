package com.example.demo.structuralPattern.proxyPattern;

/**
 * @ClassName : OrderDaoImpl
 * @Description: TODO
 * @Author: jilvke
 * @CreateDate: 2019/12/09
 * @Version: 1.0
 */
public class OrderDaoImpl implements IOrderDao {
    @Override
    public int insert(Order order) {
        System.out.println("Dao层添加Order成功");
        return 1;
    }
}
