package com.example.demo.CreationalPattern.BuilderPattern;

/**
 * @ClassName : CakeActualBuilder
 * @Description: TODO
 * @Author: jilvke
 * @CreateDate: 2019/12/04
 * @Version: 1.0
 */
public class CakeActualBuilder extends CakeBuilder {
    private Cake cake = new Cake();

    @Override
    public void buildCakeName(String cakeName) {
        cake.setName(cakeName);
    }

    @Override
    public void buildCakeGiftBox(String cakeGiftBox) {
        cake.setGiftBox(cakeGiftBox);
    }

    @Override
    public void buildCakeTaste(String cakeTaste) {
        cake.setTaste(cakeTaste);
    }

    @Override
    public void buildCakePoster(String cakePoster) {
        cake.setPoster(cakePoster);
    }

    @Override
    public void buildCakeEvaluation(String cakeEvaluation) {
        cake.setEvaluation(cakeEvaluation);
    }

    @Override
    public Cake makeCake() {
        return cake;
    }
}
