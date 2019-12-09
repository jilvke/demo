package com.example.demo.structuralPattern.bridgePattern;

/**
 * @ClassName : Bank
 * @Description: TODO
 * @Author: jilvke
 * @CreateDate: 2019/12/09
 * @Version: 1.0
 */
public abstract class Bank {
    //只有子类能拿到account
    protected Account account;

    public Bank(Account account) {
        this.account = account;
    }

    abstract Account openAccount();
}
