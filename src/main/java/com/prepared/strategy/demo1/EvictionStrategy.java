package com.prepared.strategy.demo1;

/**
 * @Author: zhongshibo
 * @Date: 2021/4/27 14:15
 */
public interface EvictionStrategy {
    EvictionStrategy getEvictionStrategy(String type);
}
