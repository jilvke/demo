package com.example.demo.m2;

import lombok.AllArgsConstructor;
import lombok.Data;

/**
 * @ClassName : DeepResume
 * @Description: TODO
 * @Author: jilvke
 * @CreateDate: 2019/11/08
 * @Version: 1.0
 */
@Data
@AllArgsConstructor
public class DeepResume implements Cloneable {
    private String name;
    private int age;
    private DeepWorkExperience deepWorkExperience;
    public Object clone(){
        try {
            DeepResume deepResume = (DeepResume)super.clone();
            deepResume.setDeepWorkExperience((DeepWorkExperience) this.getDeepWorkExperience().clone());
            return deepResume;
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }
        return null;
    }

}
