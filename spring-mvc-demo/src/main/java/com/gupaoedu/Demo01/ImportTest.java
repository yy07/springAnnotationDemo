package com.gupaoedu.Demo01;

import org.springframework.beans.factory.config.BeanDefinition;
import org.springframework.beans.factory.config.ConstructorArgumentValues;
import org.springframework.beans.factory.support.BeanDefinitionRegistry;
import org.springframework.beans.factory.support.GenericBeanDefinition;
import org.springframework.beans.factory.support.RootBeanDefinition;
import org.springframework.context.annotation.ImportBeanDefinitionRegistrar;
import org.springframework.core.type.AnnotationMetadata;

public class ImportTest implements ImportBeanDefinitionRegistrar {
    public void registerBeanDefinitions(AnnotationMetadata annotationMetadata, BeanDefinitionRegistry beanDefinitionRegistry) {
        //指定bean定义信息（包括bean的类型、作用域...）
        RootBeanDefinition rootBeanDefinition = new RootBeanDefinition(TestUser.class);
        //注册一个bean指定bean名字（id）
        beanDefinitionRegistry.registerBeanDefinition("TestDemo4444", rootBeanDefinition);


        BeanDefinition beanDefinition = new GenericBeanDefinition();
        beanDefinition.setBeanClassName(TestUser.class.getName());
        ConstructorArgumentValues arg = new ConstructorArgumentValues();
        arg.addIndexedArgumentValue(0,"张三");//这个向生成的bean对象中的属性注入值要求一定要有构造函数并且index下标要小于等于构造函数参数数量
        arg.addIndexedArgumentValue(1,"123456");
        ((GenericBeanDefinition) beanDefinition).setConstructorArgumentValues(arg);
        beanDefinitionRegistry.registerBeanDefinition("TestUser",beanDefinition);
    }
}
