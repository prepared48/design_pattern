package com.prepared.strategy.demo1;

/**
 * 非运行时动态确定，在代码中指定使用哪种策略
 *
 * @Author: zhongshibo
 * @Date: 2021/4/27 14:57
 */
public class Application2 {

    public static void main(String[] args) {
        EvictionStrategy evictionStrategy = new EvictionStrategyA();
        UserCache userCache = new UserCache(evictionStrategy);
    }
}
