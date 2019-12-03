package com.example.demo.m2;

import lombok.AllArgsConstructor;
import lombok.Data;

/**
 * @ClassName : ShallowResume
 * @Description: TODO
 * @Author: jilvke
 * @CreateDate: 2019/11/08
 * @Version: 1.0
 */
@Data
@AllArgsConstructor
public class ShallowResume implements  Cloneable {
    private String name;
    private int age;
    private  ShallowWorkExperience shallowWorkExperience ;
    public Object clone(){
        try {
            return super.clone();
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }
        return null;
    }

}
