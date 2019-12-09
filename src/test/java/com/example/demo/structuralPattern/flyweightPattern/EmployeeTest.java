package com.example.demo.structuralPattern.flyweightPattern;

class EmployeeTest {
    private static final String departments[] = {"RD", "QS", "PM", "DD", "MM"};

    public static void main(String[] args) {
        for (int i = 0; i < 5; i++) {
            String department = departments[(int) (Math.random() * departments.length)];
            Manager manager = (Manager) EmployeeFactory.getManager(department);
            manager.report();
        }
    }

}