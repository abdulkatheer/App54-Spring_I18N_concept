package org.katheer.test;

import org.katheer.bean.Welcome;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Client {
    public static void main(String[] args) {
        ApplicationContext applicationContext =
                new ClassPathXmlApplicationContext("org/katheer/resource" +
                        "/applicationContext.xml");
        Welcome welcome1 = (Welcome) applicationContext.getBean("welcome1");
        Welcome welcome2 = (Welcome) applicationContext.getBean("welcome2");

        welcome1.welcomeMessageWithParams();
        System.out.println();
        welcome2.welcomeMessageWithoutParams();
    }
}
