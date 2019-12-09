package com.example.demo.structuralPattern.proxyPattern;

/**
 * @ClassName : OrderServiceImpl
 * @Description: TODO
 * @Author: jilvke
 * @CreateDate: 2019/12/09
 * @Version: 1.0
 */
public class OrderServiceImpl implements IOrderService {
    private IOrderDao iOrderDao;

    @Override
    public int saveOrder(Order order) {
        //Spring会自己注入，我们这里直接new了
        iOrderDao = new OrderDaoImpl();
        System.out.println("Service层调用Dao层添加Order");
        return iOrderDao.insert(order);
    }
}
