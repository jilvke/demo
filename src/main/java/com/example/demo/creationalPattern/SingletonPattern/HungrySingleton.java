package com.example.demo.creationalPattern.SingletonPattern;

import java.io.Serializable;

/**
 * @ClassName : HungrySingleton
 * @Description: TODO
 * @Author: jilvke
 * @CreateDate: 2019/12/04
 * @Version: 1.0
 */
public class HungrySingleton implements Serializable {
    // 类加载的时候初始化
    private final static HungrySingleton hungrySingleton = new HungrySingleton();

    private HungrySingleton() {
        if (hungrySingleton != null) {
            throw new RuntimeException("单例构造器禁止反射调用");
        }
    }

    public static HungrySingleton getInstance() {
        return hungrySingleton;
    }

    private Object readResolve() {
        return hungrySingleton;
    }
}
