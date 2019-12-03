package com.example.demo.m2;

import static org.junit.jupiter.api.Assertions.*;

class ShallowResumeTest {
    public static void main(String[] args) {
        ShallowWorkExperience shallowWorkExperience = new ShallowWorkExperience("华为","北京");
        ShallowResume shallowResume = new ShallowResume("Joke",22,shallowWorkExperience);
        ShallowResume shallowResumeCopy = (ShallowResume) shallowResume.clone();
        shallowResumeCopy.setName("Rose");
        shallowResumeCopy.setAge(21);
        shallowResumeCopy.getShallowWorkExperience().setCompanyAddress("成都");
        shallowResumeCopy.getShallowWorkExperience().setCompanyName("中兴");
        System.out.println("shallowResume:"+shallowResume);
        System.out.println("shallowResumeCopy:"+shallowResumeCopy);

        DeepWorkExperience deepWorkExperience = new DeepWorkExperience("华为","北京");
        DeepResume deepResume = new DeepResume("Joke",22,deepWorkExperience);
        DeepResume deepResumeCopy = (DeepResume) deepResume.clone();
        deepResumeCopy.setName("Rose");
        deepResumeCopy.setAge(21);
        deepResumeCopy.getDeepWorkExperience().setCompanyAddress("成都");
        deepResumeCopy.getDeepWorkExperience().setCompanyName("中兴");
        System.out.println("shallowResume:"+deepResume);
        System.out.println("shallowResumeCopy:"+deepResumeCopy);

    }
}