package com.example.demo.structuralPattern.facadePattern;

import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

/**
 * @ClassName : PointsGift
 * @Description: TODO
 * @Author: jilvke
 * @CreateDate: 2019/12/09
 * @Version: 1.0
 */
@Builder
@Setter
@Getter
public class PointsGift {
    private String name;

    public PointsGift(String name) {
        this.name = name;
    }
}
