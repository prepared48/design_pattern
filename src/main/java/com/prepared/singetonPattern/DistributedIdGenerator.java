package com.prepared.singetonPattern;

import java.util.concurrent.atomic.AtomicLong;

/**
 * 分布式系统的单例  伪代码
 *
 * @Author: zhongshibo
 * @Date: 2021/3/8 17:23
 */
public class DistributedIdGenerator {

    private AtomicLong id = new AtomicLong(0);
    private static DistributedIdGenerator instance;

//    private static SharedObjectStorge storge = FileSharedObjectStorge(filepath);
//    private static DistributedLock lock = new DistributedLock();


    public DistributedIdGenerator() {
    }

    public synchronized static DistributedIdGenerator getInstance() {
        if (instance == null) {
//            lock.lock();
//            instance = storge.load(DistributedIdGenerator.class);
        }
        return instance;
    }

    public synchronized void freeInstance() {
//        storge.save(this, DistributedIdGenerator.class);
//        instance = null;
//        lock.unlock();
    }

    public long getId() {
        return id.incrementAndGet();
    }

    public static void main(String[] args) {
        DistributedIdGenerator idGenerator = DistributedIdGenerator.getInstance();
        long id = idGenerator.getId();
        idGenerator.freeInstance();
    }
}
