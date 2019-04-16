package com.sixon;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
public class ServiceApp01 {

    public static void main(String[] args) {
        SpringApplication.run(ServiceApp01.class,args);
    }
}
