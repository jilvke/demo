package com.example.demo.elephantbehaviorpattern.visitorpattern;

import java.util.ArrayList;
import java.util.List;

class VisitorTest {
    public static void main(String[] args) {
        List<Course> courseList = new ArrayList<Course>();

        FreeCourse freeCourse = new FreeCourse();
        freeCourse.setName("操作系统");

        CodingCourse codingCourse = new CodingCourse();
        codingCourse.setName("算法");
        codingCourse.setPrice(299);

        courseList.add(freeCourse);
        courseList.add(codingCourse);

        for (Course course : courseList) {
            course.accept(new Visitor());
        }
    }

}