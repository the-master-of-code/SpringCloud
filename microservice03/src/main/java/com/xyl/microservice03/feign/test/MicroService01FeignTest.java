package com.xyl.microservice03.feign.test;

//import com.xyl.microservice03.feign.errorfallback.FallBackExample;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

//@FeignClient(value = "MicroService01", fallback = FallBackExample.class)
@FeignClient(value = "MicroService01")
public interface MicroService01FeignTest {
    @GetMapping("/service01/microService01Test")
    String microService01FeignTest(@RequestParam("str") String str);
}
