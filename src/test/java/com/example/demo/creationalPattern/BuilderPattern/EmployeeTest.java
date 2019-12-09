package com.example.demo.creationalPattern.BuilderPattern;

class EmployeeTest {
    public static void main(String[] args) {
        CakeBuilder cakeBuilder = new CakeActualBuilder();
        Employee employee = new Employee();
        employee.setCakeBuilder(cakeBuilder);
        Cake cake = employee.makeCake("巧克力蛋糕", "巧克力蛋糕礼盒"
                , "甜", "巧克力蛋糕海报", "好");
        System.out.println(cake);
    }

}