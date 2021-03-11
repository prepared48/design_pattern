package com.prepared.singetonPattern;

/**
 * 静态内部类 单例模式
 *
 * @Author: zhongshibo
 * @Date: 2021/3/11 14:23
 */
public class InnerClassSingleton {

    private static class MySingletonHandler {
        private static InnerClassSingleton instance = new InnerClassSingleton();
    }

    private InnerClassSingleton() {
    }

    public static InnerClassSingleton getInstance() {
        return MySingletonHandler.instance;
    }
}
