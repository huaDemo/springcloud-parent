package com.springcloud.eurekaclient;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

//eurekaclient启动注解
@EnableEurekaClient
@SpringBootApplication
public class SpringcloudEurekaclientApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringcloudEurekaclientApplication.class, args);
    }
}
