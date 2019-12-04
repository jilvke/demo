package com.example.demo.CreationalPattern.BuilderPattern;

/**
 * @ClassName : CakeBuilder
 * @Description: TODO
 * @Author: jilvke
 * @CreateDate: 2019/12/04
 * @Version: 1.0
 */
public abstract class CakeBuilder {
    public abstract void buildCakeName(String cakeName);

    public abstract void buildCakeGiftBox(String cakeGiftBox);

    public abstract void buildCakeTaste(String cakeTaste);

    public abstract void buildCakePoster(String cakePoster);

    public abstract void buildCakeEvaluation(String cakeEvaluation);

    //制作蛋糕
    public abstract Cake makeCake();
}
