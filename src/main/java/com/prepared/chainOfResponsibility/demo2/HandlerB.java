package com.prepared.chainOfResponsibility.demo2;

/**
 * @Author: zhongshibo
 * @Date: 2021/4/27 16:21
 */
public class HandlerB extends Handler {

    @Override
    public boolean doHandle() {
        System.out.println("this is handlerB");
        boolean handled = false;
        return false;
    }
}
