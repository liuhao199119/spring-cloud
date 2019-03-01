package com.hzit.dashboard;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.hystrix.dashboard.EnableHystrixDashboard;

@SpringBootApplication
@EnableHystrixDashboard
public class DashBoard9001_APP {
    public static void main(String[] args) {
        SpringApplication.run(DashBoard9001_APP.class,args);
    }
}