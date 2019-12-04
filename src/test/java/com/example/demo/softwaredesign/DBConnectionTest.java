package com.example.demo.softwaredesign;

import org.junit.jupiter.api.Test;

class DBConnectionTest {

    @Test
    void getConnection() {
        ProductDao productDao = new ProductDao();
        productDao.setDbConnection(new MySQLConnection());
        productDao.addProduct();
    }
}