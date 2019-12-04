package com.example.demo.CreationalPattern.PrototypePattern;

import java.text.MessageFormat;

/**
 * @ClassName : MainUtil
 * @Description: TODO
 * @Author: jilvke
 * @CreateDate: 2019/12/04
 * @Version: 1.0
 */
public class MainUtil {
    public static void sendMain(Mail mail) {
        String outputContent = "向亲爱的{0},邮件地址:{1},邮件内容:{2}发送邮件成功";
        System.out.println(MessageFormat.format(outputContent, mail.getName(), mail.getEmailAddress(), mail.getContent()));
    }

    public static void saveOriginMailRecord(Mail mail) {
        System.out.println("存储originMail记录originMail:" + mail.getContent());
    }
}
