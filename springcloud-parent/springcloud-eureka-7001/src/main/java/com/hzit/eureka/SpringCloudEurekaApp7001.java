package com.hzit.eureka;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer
public class SpringCloudEurekaApp7001 {

	public static void main(String[] args) throws Exception {
		SpringApplication.run(SpringCloudEurekaApp7001.class, args);
	}

}
