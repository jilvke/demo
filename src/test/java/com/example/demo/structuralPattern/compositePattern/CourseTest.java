package com.example.demo.structuralPattern.compositePattern;

class CourseTest {
    public static void main(String[] args) {
        CatalogComponent linuxCourse = new Course("Linux课程", 11);
        CatalogComponent windowsCourse = new Course("Windows课程", 11);

        CatalogComponent javaCourseCatalog = new CourseCatalog("Java课程目录", 2);

        CatalogComponent mmallCourse1 = new Course("Java网络编程", 55);
        CatalogComponent mmallCourse2 = new Course("Java编程思想", 66);
        CatalogComponent designPattern = new Course("Java设计模式", 77);

        javaCourseCatalog.add(mmallCourse1);
        javaCourseCatalog.add(mmallCourse2);
        javaCourseCatalog.add(designPattern);

        CatalogComponent imoocMainCourseCatalog = new CourseCatalog("计算机课程主目录", 1);
        imoocMainCourseCatalog.add(linuxCourse);
        imoocMainCourseCatalog.add(windowsCourse);
        imoocMainCourseCatalog.add(javaCourseCatalog);

        imoocMainCourseCatalog.print();
    }

}