package com.example.demo.structuralPattern.facadePattern;

/**
 * @ClassName : PointsPaymentService
 * @Description: TODO
 * @Author: jilvke
 * @CreateDate: 2019/12/09
 * @Version: 1.0
 */
public class PointsPaymentService {
    public boolean pay(PointsGift pointsGift) {
        //扣减积分
        System.out.println("支付" + pointsGift.getName() + " 积分成功");
        return true;
    }
}
