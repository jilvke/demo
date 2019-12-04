package com.example.demo.CreationalPattern.PrototypePattern;

import lombok.*;

/**
 * @ClassName : Mail
 * @Description: TODO
 * @Author: jilvke
 * @CreateDate: 2019/12/04
 * @Version: 1.0
 */
@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class Mail implements Cloneable {
    private String name;
    private String emailAddress;
    private String content;

    @Override
    protected Object clone() throws CloneNotSupportedException {
        System.out.println("clone mail object");
        return super.clone();
    }
}
