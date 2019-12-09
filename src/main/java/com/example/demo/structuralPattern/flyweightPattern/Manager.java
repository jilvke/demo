package com.example.demo.structuralPattern.flyweightPattern;

/**
 * @ClassName : Manager
 * @Description: TODO
 * @Author: jilvke
 * @CreateDate: 2019/12/09
 * @Version: 1.0
 */
public class Manager implements Employee {
    @Override
    public void report() {
        System.out.println(reportContent);
    }

    //外部状态 依赖外部
    private String department;
    private String reportContent;
    private String title = "部门经理";  //内部状态

    public Manager(String department) {
        this.department = department;
    }

    public void setReportContent(String reportContent) {
        this.reportContent = reportContent;
    }
}
