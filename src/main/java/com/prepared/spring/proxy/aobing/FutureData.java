package com.prepared.spring.proxy.aobing;

/**
 * @Author: zhongshibo
 * @Date: 2021/4/12 14:15
 */
public class FutureData implements Data {

    protected RealData realData;

    protected boolean isReady = false;

    public synchronized void setRealData(RealData realData) {
        if (isReady) {
            return;
        }
        this.realData = realData;
        isReady = true;
        //RealData已经被注入，通知getResult()
        notifyAll();
    }

    @Override
    public String getResult() {
        while (!isReady) {
            try {
                //一直等待，直到RealData被注入
                wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        //真正需要的数据从RealData获取
        return realData.result;
    }
}
