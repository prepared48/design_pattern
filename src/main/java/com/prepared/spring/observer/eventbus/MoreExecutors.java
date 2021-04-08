package com.prepared.spring.observer.eventbus;

import java.util.concurrent.Executor;
import java.util.concurrent.Executors;

/**
 * @Author: zhongshibo
 * @Date: 2021/4/8 19:25
 */
public class MoreExecutors {

    public static Executor directExecutor() {
        return Executors.newSingleThreadExecutor();
    }
}
