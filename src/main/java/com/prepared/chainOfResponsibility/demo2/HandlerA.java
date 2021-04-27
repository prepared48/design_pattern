package com.prepared.chainOfResponsibility.demo2;

/**
 * @Author: zhongshibo
 * @Date: 2021/4/27 16:21
 */
public class HandlerA extends Handler {

    @Override
    public boolean doHandle() {
        System.out.println("this is handlerA");
        boolean handled = false;
        return false;
    }
}
