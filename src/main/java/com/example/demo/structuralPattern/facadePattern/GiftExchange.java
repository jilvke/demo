package com.example.demo.structuralPattern.facadePattern;

/**
 * @ClassName : GiftExchange
 * @Description: TODO
 * @Author: jilvke
 * @CreateDate: 2019/12/09
 * @Version: 1.0
 */
public class GiftExchange {
    //礼物兑换服务
    //礼物兑换服务
    private QualifyService       qualifyService       = new QualifyService();
    private PointsPaymentService pointsPaymentService = new PointsPaymentService();
    private ShippingService      shippingService      = new ShippingService();

    public void giftExchange(PointsGift pointsGift) {
        if (qualifyService.isAvailable(pointsGift)) {
            //资格校验通过
            if (pointsPaymentService.pay(pointsGift)) {
                //如果支付积分成功
                String shippingOrderNumber = shippingService.shipGift(pointsGift);
                System.out.println("物流系统下单成功,订单号是: " + shippingOrderNumber);
            }
        }
    }
}
