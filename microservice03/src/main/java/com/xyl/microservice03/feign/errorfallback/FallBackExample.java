package com.xyl.microservice03.feign.errorfallback;

import com.xyl.microservice03.feign.service.MicroService01FeignTest;
import org.springframework.stereotype.Component;

/*
*断路器处理返回
*/
@Component
public class FallBackExample implements MicroService01FeignTest {

    //服务01不可用的时候，跳转到这里～

    public String microService01TestFeign() {
        return "服务不可用,Feign熔断";
    }
}