package com.example.demo.creationalPattern.BuilderPattern;

import lombok.*;

/**
 * @ClassName : Cake
 * @Description: TODO
 * @Author: jilvke
 * @CreateDate: 2019/12/04
 * @Version: 1.0
 */
@Getter
@Setter
@ToString
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class Cake {
    //蛋糕名称
    private String name;
    //蛋糕配套礼盒
    private String giftBox;
    //蛋糕味道
    private String taste;
    //蛋糕海报
    private String poster;

    //评价
    private String evaluation;

}
