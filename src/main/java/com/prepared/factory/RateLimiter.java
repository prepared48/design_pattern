package com.prepared.factory;

public class RateLimiter {
    private RedisCounter RedisCounter;

    public RateLimiter(RedisCounter redisCounter) {
        this.RedisCounter = redisCounter;
    }

    public void test() {
        System.out.println("Hello World!");
    }  //...
}