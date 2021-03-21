package com.xyl.redis.controller;


import com.alibaba.fastjson.JSONObject;
import redis.clients.jedis.Jedis;
import redis.clients.jedis.Transaction;

import java.util.concurrent.TimeUnit;

public class Redis {

    public static void useJedis(){
        Jedis jedis = new Jedis("127.0.0.1",6379);

        System.out.println(jedis.ping());

    }


    public static void transaction() {
        Jedis jedis = new Jedis("127.0.0.1",6379);

        jedis.flushDB();

        JSONObject jsonObject = new JSONObject();
        jsonObject.put("hello","world");
        jsonObject.put("name","xyl");

//        jedis.watch("user1");

        //开启事务
        Transaction multi = jedis.multi();

        String result = jsonObject.toJSONString();

        try {
            multi.set("user1",result);
            multi.set("user2",result);

//            int i = 10/0;

            multi.exec();
        }catch (Exception e){
            multi.discard();
            System.out.println(e.getMessage());
        }finally {
            System.out.println(jedis.get("user1"));
            System.out.println(jedis.get("user2"));
            jedis.close();
        }
    }

    public static void jedisWatch() throws InterruptedException {
        Jedis jedis = new Jedis("127.0.0.1",6379);

        jedis.flushDB();

        JSONObject jsonObject = new JSONObject();
        jsonObject.put("hello","world");
        jsonObject.put("name","xyl");

        jedis.watch("user1");
        TimeUnit.SECONDS.sleep(1);

        new Thread(()->{
            Jedis jedis2 = new Jedis("127.0.0.1",6379);
            jedis2.set("user1",Thread.currentThread().getName()+"----->我先改了，事务执行失败");
            jedis2.close();
        }).start();


        //开启事务
        Transaction multi = jedis.multi();

        String result = jsonObject.toJSONString();

        try {
            multi.set("user1",result);
            multi.set("user2",result);

//            int i = 10/0;

            multi.exec();
        }catch (Exception e){
            multi.discard();
            System.out.println(e.getMessage());
        }finally {
            System.out.println(Thread.currentThread().getName()+"---->"+jedis.get("user1"));
            System.out.println(Thread.currentThread().getName()+"---->"+jedis.get("user2"));
            jedis.close();
        }
    }


    public static void main(String[] args) {
//        useJedis();
//        transaction();
        try {
            jedisWatch();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
