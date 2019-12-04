package com.example.demo.CreationalPattern.SimpleFactoryPattern;

/**
 * @ClassName : CakeFactory
 * @Description: TODO
 * @Author: jilvke
 * @CreateDate: 2019/12/04
 * @Version: 1.0
 */
public class CakeFactory {
/*    public Cake getCake(String type){
        if("雪花酥".equals(type)){
            return new SnowCake();
        }else if("巧克力蛋糕卷".equals(type)){
            return new CCake();
        }
        return null;
    }*/

    public Cake getCake(Class c) {
        Cake cake = null;
        try {
            cake = (Cake) Class.forName(c.getName()).newInstance();
        } catch (InstantiationException e) {
            e.printStackTrace();
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
        return cake;
    }
}
