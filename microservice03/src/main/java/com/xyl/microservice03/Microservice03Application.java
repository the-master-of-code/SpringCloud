package com.xyl.microservice03;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.openfeign.EnableFeignClients;

@EnableFeignClients//允许此服务调用其他微服务
@EnableEurekaClient//表示此服务是一个微服务
@SpringBootApplication
public class Microservice03Application {

    public static void main(String[] args) {
        SpringApplication.run(Microservice03Application.class, args);
    }

}
