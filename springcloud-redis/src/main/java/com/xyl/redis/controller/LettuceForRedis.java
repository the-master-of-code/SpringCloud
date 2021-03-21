package com.xyl.redis.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.RedisTemplate;

public class LettuceForRedis {
    @Autowired
    private static RedisTemplate redisTemplate;

}
