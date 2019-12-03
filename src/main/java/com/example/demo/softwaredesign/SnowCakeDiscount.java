package com.example.demo.softwaredesign;

/**
 * @ClassName : SnowCakeDiscount
 * @Description: TODO
 * @Author: jilvke
 * @CreateDate: 2019/12/03
 * @Version: 1.0
 */
public class SnowCakeDiscount extends SnowCake {
    public SnowCakeDiscount(Integer id, String taste, Double price) {
        super(id, taste, price);
    }

    @Override
    public Integer getID() {
        return super.getID();
    }

    @Override
    public String getTaste() {
        return super.getTaste();
    }

    @Override
    public Double getPrice() {
        return super.getPrice() * 0.8;
    }

    @Override
    public String toString() {
        return "SnowCake{" +
                "id=" + super.getID() +
                ", taste='" + super.getTaste() + '\'' +
                ", price=" + super.getPrice() * 0.8 +
                '}';
    }
}
