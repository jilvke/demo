package com.example.demo.structuralPattern.bridgePattern;

/**
 * @ClassName : DepositAccount
 * @Description: 定期账号
 * @Author: jilvke
 * @CreateDate: 2019/12/09
 * @Version: 1.0
 */
public class DepositAccount implements Account {
    @Override
    public Account openAccount() {
        System.out.println("打开定期账号");
        return new DepositAccount();
    }

    @Override
    public void showAccountType() {
        System.out.println("这是一个定期账号");
    }
}
