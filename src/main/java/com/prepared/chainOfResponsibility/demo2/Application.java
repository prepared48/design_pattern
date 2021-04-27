package com.prepared.chainOfResponsibility.demo2;

/**
 * @Author: zhongshibo
 * @Date: 2021/4/27 16:31
 */
public class Application {

    public static void main(String[] args) {
        HandlerChain chain = new HandlerChain();
        chain.addHandler(new HandlerA());
        chain.addHandler(new HandlerB());
        chain.handle();
    }
}
