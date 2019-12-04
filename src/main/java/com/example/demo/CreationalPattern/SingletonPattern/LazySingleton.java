package com.example.demo.CreationalPattern.SingletonPattern;

/**
 * @ClassName : LazySingleton
 * @Description: TODO
 * @Author: jilvke
 * @CreateDate: 2019/12/04
 * @Version: 1.0
 */
public class LazySingleton {
    private static LazySingleton lazySingleton = null;

    private LazySingleton() {
    }

    public static LazySingleton getInstance() {
        if (lazySingleton == null) {
            lazySingleton = new LazySingleton();
        }
        return lazySingleton;
    }

}
