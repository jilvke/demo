package com.example.demo.creationalPattern.PrototypePattern;

class MailTest {
    public static void main(String[] args) throws CloneNotSupportedException {
        Mail mail = new Mail();
        mail.setContent("初始化模板");
        for (int i = 0; i < 10; i++) {
            Mail mailTemp = (Mail) mail.clone();  //二进制流的copy速度比new快
            mailTemp.setName("顾客" + i);
            mailTemp.setEmailAddress("姓名" + i + "@163.com");
            mailTemp.setContent("恭喜你中了1000万大奖,");
            MainUtil.sendMain(mailTemp);
        }
        MainUtil.saveOriginMailRecord(mail);
    }

}