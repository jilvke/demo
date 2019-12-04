package com.example.demo.softwaredesign;

import lombok.Getter;
import lombok.Setter;

/**
 * @ClassName : Square
 * @Description: TODO
 * @Author: jilvke
 * @CreateDate: 2019/12/04
 * @Version: 1.0
 */
@Getter
@Setter
public class Square implements QRangle {
    private long sideLength;

    public long getLength() {
        return getSideLength();
    }

    public long getWidth() {
        return getLength();
    }


}
