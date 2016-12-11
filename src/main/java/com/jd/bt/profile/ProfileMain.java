package com.jd.bt.profile;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.core.SpringVersion;

/**
 * User: 吴海旭
 * Date: 2016-12-11
 * Time: 下午4:31
 */
public class ProfileMain {

    public static void main(String[] args) {
        System.out.println("jdk version:\t" + System.getProperty("java.version"));
        System.out.println("spring version:\t" + SpringVersion.getVersion());

        ApplicationContext ctx = new ClassPathXmlApplicationContext("spring-context.xml");

        System.out.println(ctx.getBean(DemoObject.class));
    }
}
