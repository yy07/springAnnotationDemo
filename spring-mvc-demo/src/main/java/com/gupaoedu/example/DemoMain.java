package com.gupaoedu.example;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

/**
 * 咕泡学院，只为更好的你
 * 咕泡学院-Mic: 2227324689
 * http://www.gupaoedu.com
 **/
public class DemoMain {
    public static void main(String[] args) {
        ApplicationContext context=new
                FileSystemXmlApplicationContext(
                        "classpath:applicationContext.xml");
        System.out.println(context.getBean(HelloService.class));
    }
}
