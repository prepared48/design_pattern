package com.prepared.observer;

/**
 * @Author: zhongshibo
 * @Date: 2021/4/13 09:23
 */
public class ObserverTest {

    public static void main(String[] args) {
        JavaStackObservable javaStackObservable = new JavaStackObservable();
        javaStackObservable.addObserver(new ReaderObserver("小明"));
        javaStackObservable.addObserver(new ReaderObserver("小李"));
        javaStackObservable.addObserver(new ReaderObserver("小张"));
        javaStackObservable.publish("什么是观察者模式？");

    }
}
