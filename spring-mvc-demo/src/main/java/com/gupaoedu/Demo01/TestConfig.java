package com.gupaoedu.Demo01;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;

/**
 * @Author:jinboxaing
 * @date:2020/7/8 16:07
 */
@Configuration
@Import({ImportTest.class,MyImportSelector.class,OutConfiguration.class})
public class TestConfig {

}
