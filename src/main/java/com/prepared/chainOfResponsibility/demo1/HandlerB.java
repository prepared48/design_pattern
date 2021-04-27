package com.prepared.chainOfResponsibility.demo1;

/**
 * @Author: zhongshibo
 * @Date: 2021/4/27 16:21
 */
public class HandlerB extends Handler {

    @Override
    public void handle() {
        System.out.println("this is handlerB");
        boolean handled = false;
        if (!handled && successor != null) {
            successor.handle();
        }
    }
}
