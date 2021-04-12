package com.prepared.factory;


/**
 * 测试DI中的工厂模式
 *
 * @Author: zhongshibo
 * @Date: 2021/4/12 16:10
 */
public class Test {

    public static void main(String[] args) {
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("beans.xml");
        RateLimiter rateLimiter = (RateLimiter) applicationContext.getBean("rateLimiter");
        rateLimiter.test();
    }
}
