package com.prepared.strategy;

import java.util.HashMap;
import java.util.Map;

/**
 * @Author: zhongshibo
 * @Date: 2021/4/27 14:13
 */
public class UserCache {

    private Map<String, User> cacheData = new HashMap<>();

    private EvictionStrategy eviction;

    public UserCache(EvictionStrategy eviction) {
        this.eviction = eviction;
    }
}
