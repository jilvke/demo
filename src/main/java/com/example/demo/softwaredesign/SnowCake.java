package com.example.demo.softwaredesign;

import lombok.AllArgsConstructor;
import lombok.ToString;

/**
 * @ClassName : SnowCake
 * @Description: TODO
 * @Author: jilvke
 * @CreateDate: 2019/12/03
 * @Version: 1.0
 */
@AllArgsConstructor
@ToString
public class SnowCake implements ICake {
    private Integer id;
    private String  taste;
    private Double  price;

    @Override
    public Integer getID() {
        return this.id;
    }

    @Override
    public String getTaste() {
        return this.taste;
    }

    @Override
    public Double getPrice() {
        return this.price;
    }
}
