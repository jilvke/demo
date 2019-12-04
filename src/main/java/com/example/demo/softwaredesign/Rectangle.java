package com.example.demo.softwaredesign;

import lombok.Setter;

/**
 * @ClassName : Rectangle
 * @Description: TODO
 * @Author: jilvke
 * @CreateDate: 2019/12/04
 * @Version: 1.0
 */
@Setter
public class Rectangle implements QRangle {
    private long length;
    private long width;

    public long getLength() {
        return length;
    }

    public long getWidth() {
        return width;
    }
}
