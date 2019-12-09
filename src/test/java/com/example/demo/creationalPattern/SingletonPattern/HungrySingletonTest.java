package com.example.demo.creationalPattern.SingletonPattern;

import lombok.extern.slf4j.Slf4j;

import java.io.*;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

@Slf4j
class HungrySingletonTest {
    public static void main(String[] args) throws IOException, ClassNotFoundException, NoSuchMethodException, IllegalAccessException, InvocationTargetException, InstantiationException {
        HungrySingleton hungrySingleton = HungrySingleton.getInstance();
        ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("singleton"));
        oos.writeObject(hungrySingleton);

        File file = new File("singleton");
        ObjectInputStream ois = new ObjectInputStream(new FileInputStream(file));

        HungrySingleton newHungrySingleton = (HungrySingleton) ois.readObject();

        log.info("结果 {}", hungrySingleton);
        log.info("结果 {}", newHungrySingleton);
        log.info("对比结果 {}", hungrySingleton == newHungrySingleton);


        Class objectClass = HungrySingleton.class;
        Constructor constructor = objectClass.getDeclaredConstructor();
        constructor.setAccessible(true); // 强行打开构造器权限
        HungrySingleton instance = HungrySingleton.getInstance();
        HungrySingleton newInstance = (HungrySingleton) constructor.newInstance();

        log.info("结果{}", instance);
        log.info("结果{}", newInstance);
        log.info("比较结果{}", newInstance == instance);

    }


}