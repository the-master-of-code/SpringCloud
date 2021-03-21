package com.xyl.microservice03.feign.service;

import com.xyl.microservice03.feign.errorfallback.FallBackExample;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestMapping;

@FeignClient(value = "MICROSERVICE01",fallback = FallBackExample.class)
@Service
public interface MicroService01FeignTest {

    @RequestMapping("/service01/hi")
    String microService01TestFeign();

}
