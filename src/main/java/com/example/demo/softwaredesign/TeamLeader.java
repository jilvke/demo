package com.example.demo.softwaredesign;

import java.util.ArrayList;
import java.util.List;

/**
 * @ClassName : TeamLeader
 * @Description: TODO
 * @Author: jilvke
 * @CreateDate: 2019/12/04
 * @Version: 1.0
 */
public class TeamLeader {
    public void checkNumberOfProject() {
        List<Project> list = new ArrayList<>();
        for (int i = 0; i < 3; i++) {
            list.add(new Project());
        }
        System.out.println("项目数量是: " + list.size());
    }
}
