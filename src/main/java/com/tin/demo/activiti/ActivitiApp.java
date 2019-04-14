package com.tin.demo.activiti;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication(exclude = org.activiti.spring.boot.SecurityAutoConfiguration.class)
@MapperScan("com.tin.demo.activiti.mapper")
public class ActivitiApp {

    public static void main(String[] args) {
        SpringApplication.run(ActivitiApp.class, args);
    }
}
