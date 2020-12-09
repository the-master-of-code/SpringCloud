package com.xyl.microservice01copy;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@EnableEurekaClient
@SpringBootApplication
public class Microservice01copyApplication {

    public static void main(String[] args) {
        SpringApplication.run(Microservice01copyApplication.class, args);
    }

}
