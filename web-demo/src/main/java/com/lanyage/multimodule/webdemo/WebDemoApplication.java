package com.lanyage.multimodule.webdemo;

import com.lanyage.multimodule.servicedemo.service.TestService;
import com.lanyage.multimodule.servicedemo.service.impl.TestServiceImpl;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.condition.ConditionalOnMissingBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan(basePackages = {"com.lanyage.multimodule"})
public class WebDemoApplication {
    @Bean(name = "testService")
    @ConditionalOnMissingBean
    public TestService testService() {
        return new TestServiceImpl();
    }
    public static void main(String[] args) {
        SpringApplication.run(WebDemoApplication.class, args);
    }
}
