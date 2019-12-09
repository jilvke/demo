package com.example.demo.structuralPattern.bridgePattern;

/**
 * @ClassName : ABCBank
 * @Description: TODO
 * @Author: jilvke
 * @CreateDate: 2019/12/09
 * @Version: 1.0
 */
public class ABCBank extends Bank {
    public ABCBank(Account account) {
        super(account);
    }

    @Override
    Account openAccount() {
        System.out.println("打开ABC银行账号");
        account.openAccount();
        return account;//account来自父类
    }
}
