package com.example.demo.softwaredesign;

/**
 * @ClassName : PostgreSQLConnection
 * @Description: TODO
 * @Author: jilvke
 * @CreateDate: 2019/12/04
 * @Version: 1.0
 */
public class PostgreSQLConnection extends DBConnection {
    @Override
    public String getConnection() {
        return " PostgreSQL数据库连接";
    }
}
