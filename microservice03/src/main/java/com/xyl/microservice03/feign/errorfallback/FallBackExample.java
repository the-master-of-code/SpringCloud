//package com.xyl.microservice03.feign.errorfallback;
//
//import com.xyl.microservice03.feign.test.MicroService01FeignTest;
//import org.springframework.stereotype.Component;
//import org.springframework.web.bind.annotation.RequestParam;
//
///*
//*断路器处理返回
//*/
//@Component
//public class FallBackExample implements MicroService01FeignTest {
//
//    //服务01不可用的时候，跳转到这里～
//    @Override
//    public String microService01FeignTest(@RequestParam("str") String str) {
//        return "服务01不可用 error~" +str;
//    }
//}
