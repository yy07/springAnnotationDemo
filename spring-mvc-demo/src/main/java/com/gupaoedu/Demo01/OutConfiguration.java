package com.gupaoedu.Demo01;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class OutConfiguration {
    @Bean("student001")
    public Student student() {

        return new Student("inner");
    }
}
