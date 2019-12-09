package com.example.demo.structuralPattern.facadePattern;

/**
 * @ClassName : QualifyService
 * @Description: TODO
 * @Author: jilvke
 * @CreateDate: 2019/12/09
 * @Version: 1.0
 */
public class QualifyService {
    public boolean isAvailable(PointsGift pointsGift) {
        System.out.println("校验" + pointsGift.getName() + " 积分资格通过，库存通过");
        return true;
    }
}
