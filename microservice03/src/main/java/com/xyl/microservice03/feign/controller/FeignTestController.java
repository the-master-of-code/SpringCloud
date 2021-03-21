package com.xyl.microservice03.feign.controller;

import com.xyl.microservice03.feign.service.MicroService01FeignTest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/service03")
public class FeignTestController {

    @Autowired
    private MicroService01FeignTest microService01FeignTest;

    @GetMapping("/feignTest")
    public String feignTest(){
        String result01 =microService01FeignTest.microService01TestFeign();
        return "我是service3,调用service1 ->" +result01 ;
    }

    @GetMapping("/Test")
    public String Test(){
        return "我是service3";
    }
}
