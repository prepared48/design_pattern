package com.prepared.chainOfResponsibility.demo1;

/**
 * @Author: zhongshibo
 * @Date: 2021/4/27 16:21
 */
public class HandlerA extends Handler {

    @Override
    public void handle() {
        System.out.println("this is handlerA");
        boolean handled = false;
//        handled = true;
        if (!handled && successor != null) {
            successor.handle();
        }
    }
}
