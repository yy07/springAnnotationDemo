package com.gupaoedu.conditional;

import com.gupaoedu.Demo01.TestConfig;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * @Author:jinboxaing
 * @date:2020/7/8 16:28
 */
public class ApplicationTest {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext applicationContext=new AnnotationConfigApplicationContext(Config.class);
        String[] beanDefinitionNames = applicationContext.getBeanDefinitionNames();
        for (String name : beanDefinitionNames){
            System.out.println(name);
        }

    }
}
