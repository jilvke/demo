package com.example.demo.softwaredesign;

/**
 * @ClassName : Test
 * @Description: TODO
 * @Author: jilvke
 * @CreateDate: 2019/12/03
 * @Version: 1.0
 */
public class Test {
    public static void main(String[] args) {
        SnowCake sc = new SnowCake(100, "原味", 55.0);
        System.out.println(sc);

        SnowCakeDiscount snowCakeDiscount = new SnowCakeDiscount(100, "原味", 55.0);
        System.out.println(snowCakeDiscount);
    }
}
