package com.gupaoedu.conditional;

import com.gupaoedu.Demo01.TestConfig;
import com.gupaoedu.demo05.TaskService;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.autoconfigure.condition.ConditionalOnBean;
import org.springframework.context.annotation.*;
import org.springframework.stereotype.Controller;

/**
 * @Author:jinboxaing
 * @date:2020/7/8 16:24
 */
@Configuration
//@ComponentScan(value = "com.gupaoedu.conditional",
//        excludeFilters = {@ComponentScan.Filter(type = FilterType.ANNOTATION, classes = {Service.class})}
//        , useDefaultFilters = true)
//@Import(TestConfig.class)
//@ComponentScan(value="com.gupaoedu.conditional",
//        includeFilters={
//                @ComponentScan.Filter(type=FilterType.ANNOTATION,classes={Controller.class}),
//                @ComponentScan.Filter(type=FilterType.ASSIGNABLE_TYPE,classes={UserService.class})
//        })
//@ComponentScan(//value = "com.gupaoedu.conditional",
//        basePackageClasses = {TaskService.class})

//@ComponentScan(value="com.gupaoedu.conditional",
//        includeFilters={
//                @ComponentScan.Filter(type=FilterType.ANNOTATION,classes={Controller.class}),
////                @ComponentScan.Filter(type=FilterType.ASSIGNABLE_TYPE,classes={UserService.class}
//                @ComponentScan.Filter(type=FilterType.CUSTOM,classes={MyTypeFilter.class}
//                )
//        },useDefaultFilters = false)

@ComponentScan(value = "com.gupaoedu.conditional")
public class Config {

    @Bean("city2")
    public City city2() {
        City city = new City();
        city.setCityName("大明湖");
        return city;
    }


    @Bean("city")
    public City city() {
        City city = new City();
        city.setCityName("西湖");
        return city;
    }


    @Bean
    @ConditionalOnBean(name = "city2")
    public People people(@Qualifier("city2") City city) {
        //这里如果city实体没有成功注入 这里就会报空指针
        city.setCityCode(301701);
        People people = new People();
        people.setAge(31);
        people.setCity(city);
        people.setName("小小");
        return people;
    }

    @Conditional(ConditionalDemo.class)
    @Bean("city3")
    public City city3() {
        City city = new City();
        city.setCityName("千岛湖");
        return city;
    }

}
