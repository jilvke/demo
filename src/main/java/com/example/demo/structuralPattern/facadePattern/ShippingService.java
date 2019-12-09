package com.example.demo.structuralPattern.facadePattern;

/**
 * @ClassName : ShippingService
 * @Description: TODO
 * @Author: jilvke
 * @CreateDate: 2019/12/09
 * @Version: 1.0
 */
public class ShippingService {
    public String shipGift(PointsGift pointsGift) {
        //物流系统的对接逻辑
        System.out.println(pointsGift.getName() + "进入物流系统");
        String shippingOrderNumber = "666";  //物流订单号
        return shippingOrderNumber;
    }
}
