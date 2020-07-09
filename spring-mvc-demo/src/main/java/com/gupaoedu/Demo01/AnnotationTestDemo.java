package com.gupaoedu.Demo01;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * @Author:jinboxaing
 * @date:2020/7/8 16:05
 */
public class AnnotationTestDemo {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext applicationContext=new AnnotationConfigApplicationContext(TestConfig.class);  //这里的参数代表要做操作的类

        String[] beanDefinitionNames = applicationContext.getBeanDefinitionNames();
        for (String name : beanDefinitionNames){
            System.out.println(name);
        }

    }
}
