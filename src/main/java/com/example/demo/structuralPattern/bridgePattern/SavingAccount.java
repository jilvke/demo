package com.example.demo.structuralPattern.bridgePattern;

/**
 * @ClassName : SavingAccount
 * @Description: TODO
 * @Author: jilvke
 * @CreateDate: 2019/12/09
 * @Version: 1.0
 */
public class SavingAccount implements Account {
    @Override
    public Account openAccount() {
        System.out.println("打开活期账号");
        return new SavingAccount();
    }

    @Override
    public void showAccountType() {
        System.out.println("这是一个活期账号");
    }
}
