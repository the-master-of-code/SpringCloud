package com.xyl.microservice03.feign.controller;

import com.xyl.microservice03.feign.test.MicroService01FeignTest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("service03")
public class FeginTestController {

    @Autowired
    private MicroService01FeignTest microService01FeignTest;

    @GetMapping("feginTest")
    public String feginTest(String str){
        String result01 =microService01FeignTest.microService01FeignTest(str);
        return "我是service3,调用service1 success ->" +result01 ;
    }

    @GetMapping("Test")
    public String Tset(){
        return "我是service3";
    }
}
