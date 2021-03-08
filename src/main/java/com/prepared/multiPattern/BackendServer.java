package com.prepared.multiPattern;

import java.util.HashMap;
import java.util.Map;
import java.util.Random;

/**
 * 多例模式，只能创建固定数量的对象
 *
 * @Author: zhongshibo
 * @Date: 2021/3/8 17:37
 */
public class BackendServer {

    private long serverNo;

    private String serverAddress;

    private static final int SERVER_COUNT = 3;
    private static final Map<Long, BackendServer> serverInstances = new HashMap<>();

    /**
     * 静态代码中，直接创建固定数量的实例
     */
    static {
        serverInstances.put(1L, new BackendServer(1L, "192.134.22.138:8080"));
        serverInstances.put(2L, new BackendServer(1L, "192.134.22.139:8080"));
        serverInstances.put(3L, new BackendServer(1L, "192.134.22.140:8080"));
    }

    public BackendServer(long serverNo, String serverAddress) {
        this.serverNo = serverNo;
        this.serverAddress = serverAddress;
    }

    public BackendServer getInstance(long serverNo) {
        return serverInstances.get(serverNo);
    }

    public BackendServer getRandomInstance() {
        Random r = new Random();
        int no = r.nextInt(SERVER_COUNT) + 1;
        return serverInstances.get(no);
    }
}
