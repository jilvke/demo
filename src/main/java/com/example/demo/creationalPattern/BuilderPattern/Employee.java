package com.example.demo.creationalPattern.BuilderPattern;

/**
 * @ClassName : Employee
 * @Description: TODO
 * @Author: jilvke
 * @CreateDate: 2019/12/04
 * @Version: 1.0
 */
public class Employee {
    private CakeBuilder cakeBuilder;

    public void setCakeBuilder(CakeBuilder cakeBuilder) {
        this.cakeBuilder = cakeBuilder;
    }

    public Cake makeCake(String cakeName, String cakeGiftBox, String cakeTaste, String cakePoster, String cakeEvaluation) {
        this.cakeBuilder.buildCakeEvaluation(cakeEvaluation);
        this.cakeBuilder.buildCakeName(cakeName);
        this.cakeBuilder.buildCakeGiftBox(cakeGiftBox);
        this.cakeBuilder.buildCakeTaste(cakeTaste);
        this.cakeBuilder.buildCakePoster(cakePoster);
        return this.cakeBuilder.makeCake();
    }
}
