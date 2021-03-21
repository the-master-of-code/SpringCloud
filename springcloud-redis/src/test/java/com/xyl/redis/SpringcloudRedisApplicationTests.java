package com.xyl.redis;


import com.fasterxml.jackson.core.JsonProcessingException;
import com.xyl.redis.pojo.User1;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class SpringcloudRedisApplicationTests {

    @Autowired
    @Qualifier("redisTemplate")
    private RedisTemplate<String,Object> redisTemplate;

    @Test
    public void contextLoads() throws JsonProcessingException {
        User1 xyl = new User1("xyl", "100");
        redisTemplate.opsForValue().set("user",xyl);
        System.out.println(redisTemplate.opsForValue().get("user"));
    }

}
