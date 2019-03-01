package com.hzit.consumer.dept;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.openfeign.EnableFeignClients;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@EnableEurekaClient

@EnableFeignClients("com.hzit.service")
@ComponentScan(basePackages = {"com.hzit.service","com.hzit.consumer.dept"})
public class SpringCloudConsumerApp {
	public static void main(String[] args) {
		SpringApplication.run(SpringCloudConsumerApp.class, args);
	}
}
