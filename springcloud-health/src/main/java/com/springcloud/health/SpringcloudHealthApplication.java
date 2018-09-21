package com.springcloud.health;

import com.springcloud.health.config.MyHealthIndicator;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

//eurekaclient启动注解
@Configuration
@ComponentScan
@EnableAutoConfiguration
@EnableEurekaClient
@SpringBootApplication
public class SpringcloudHealthApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringcloudHealthApplication.class, args);
	}

	@Bean
	public MyHealthIndicator myHealthIndicator(){
		return new MyHealthIndicator();
	}

}
