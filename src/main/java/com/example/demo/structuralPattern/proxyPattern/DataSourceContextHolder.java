package com.example.demo.structuralPattern.proxyPattern;

/**
 * @ClassName : DataSourceContextHolder
 * @Description: TODO
 * @Author: jilvke
 * @CreateDate: 2019/12/09
 * @Version: 1.0
 */
public class DataSourceContextHolder {
    private static final ThreadLocal<String> CONTEXT_HOLDER = new ThreadLocal<String>();
    //ThreadLocal是线程与线程之间隔离的

    public static void setDBType(String dbType) {
        CONTEXT_HOLDER.set(dbType);
    }

    public static String getDBType() {
        return (String) CONTEXT_HOLDER.get();
    }

    public static void clearDBType() {
        CONTEXT_HOLDER.remove();
    }
}
