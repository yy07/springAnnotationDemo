package com.gupaoedu.conditional;

import org.springframework.boot.autoconfigure.condition.ConditionalOnBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Conditional;
import org.springframework.context.annotation.Configuration;

/**
 * @Author:jinboxaing
 * @date:2020/7/8 16:24
 */
@Configuration
public class Config {
    @Bean
    public City city() {
        City city = new City();
        city.setCityName("千岛湖");
        return city;
    }

    @Bean
    @ConditionalOnBean(name = "city")
    public People people(City city) {
        //这里如果city实体没有成功注入 这里就会报空指针
        city.setCityCode(301701);
        return new People("小小", 3, city);
    }
    @Conditional(ConditionalDemo.class)
    @Bean("city2")
    public City city2() {
        City city = new City();
        city.setCityName("大明湖");
        return city;
    }
}
