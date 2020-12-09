package com.xyl.microservice01copy.service;

import org.springframework.stereotype.Service;

@Service
public class MicroService01Impl implements MicroService01{

    @Override
    public String microService01Test(String microService01Str) {
        return "我是MicroService01Copy ->" + microService01Str;
    }
}
