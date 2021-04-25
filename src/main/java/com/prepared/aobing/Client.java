package com.prepared.aobing;

/**
 * @Author: zhongshibo
 * @Date: 2021/4/12 14:19
 */
public class Client {

    /**
     * 这是一个异步方法，返回的Data接口是一个Future
     *
     * @param queryStr
     * @return
     */
    public Data request(final String queryStr) {
        final FutureData futureData = new FutureData();
        new Thread() {
            @Override
            public void run() {
                // RealData的构建很慢，所以在单独的线程中进行
                RealData realData = new RealData(queryStr);
                //setRealData()的时候会notify()等待在这个future上的对象
                futureData.setRealData(realData);
            }
        }.start();
        // FutureData会被立即返回，不会等待RealData被构造完
        return futureData;
    }
}
