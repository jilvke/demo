package com.example.demo.m2;

import lombok.AllArgsConstructor;
import lombok.Data;

/**
 * @ClassName : DeepWorkExperience
 * @Description: TODO
 * @Author: jilvke
 * @CreateDate: 2019/11/08
 * @Version: 1.0
 */
@Data
@AllArgsConstructor
public class DeepWorkExperience implements  Cloneable  {
    private String companyName;  //company name
    private String companyAddress;  // company address
    public Object clone(){
        try {
            return super.clone();
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }
        return null;
    }

}
