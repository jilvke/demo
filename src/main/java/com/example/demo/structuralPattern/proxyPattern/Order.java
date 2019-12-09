package com.example.demo.structuralPattern.proxyPattern;

import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

/**
 * @ClassName : Order
 * @Description: TODO
 * @Author: jilvke
 * @CreateDate: 2019/12/09
 * @Version: 1.0
 */
@Getter
@Setter
@Builder
public class Order {
    private Object  orderInfo;  //订单数据
    private Integer userId;  //用户
}
