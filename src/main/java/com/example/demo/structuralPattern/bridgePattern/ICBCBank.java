package com.example.demo.structuralPattern.bridgePattern;

/**
 * @ClassName : ICBCBank
 * @Description: TODO
 * @Author: jilvke
 * @CreateDate: 2019/12/09
 * @Version: 1.0
 */
public class ICBCBank extends Bank {
    public ICBCBank(Account account) {
        super(account);
    }

    @Override
    Account openAccount() {
        System.out.println("打开ICBC银行账号");
        account.openAccount();
        return account;//来自抽象类
    }

}
