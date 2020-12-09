package com.xyl.microservice01.service;

import org.springframework.stereotype.Service;

@Service
public class MicroService01Impl implements MicroService01{

    @Override
    public String microService01Test(String microService01Str) {
        return "我是MicroService01 ->" + microService01Str;
    }
}
