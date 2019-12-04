package com.example.demo.CreationalPattern.SingletonPattern;

/**
 * @ClassName : LazyDoubleCheckSingleton
 * @Description: TODO
 * @Author: jilvke
 * @CreateDate: 2019/12/04
 * @Version: 1.0
 */
public class LazyDoubleCheckSingleton {
    private volatile static LazyDoubleCheckSingleton lazySingleton = null;

    private LazyDoubleCheckSingleton() {
    }

    public static LazyDoubleCheckSingleton getInstance() {
        if (lazySingleton == null) {
            synchronized (LazyDoubleCheckSingleton.class) {
                if (lazySingleton == null) {
                    lazySingleton = new LazyDoubleCheckSingleton();
                }
            }
        }
        return lazySingleton;
    }


}
